package com.senac.calculadora_app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Calc {

    private final static String MAIS = "+";
    private final static String MENOS = "-";
    private final static String MULT = "*";
    private final static String DIV = "/";

    public JTextField num1TF;
    public JTextField num2TF;
    public JComboBox<String> operCBB;
    public JButton calcBT;
    public JTextField resultadoTF;

    public Calc() {
        num1TF = new JTextField(5);
        num2TF = new JTextField(5);

        operCBB = new JComboBox<>();
        operCBB.addItem(MAIS);
        operCBB.addItem(MENOS);
        operCBB.addItem(MULT);
        operCBB.addItem(DIV);

        calcBT = new JButton("Calcular");

        resultadoTF = new JTextField();
        resultadoTF.setEditable(false);

        JPanel painelCalculadora = new JPanel();
        painelCalculadora.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelCalculadora.add(num1TF);
        painelCalculadora.add(operCBB);
        painelCalculadora.add(num2TF);
        painelCalculadora.add(calcBT);

        JPanel painelConteudo = new JPanel();
        painelConteudo.setBorder(new TitledBorder("Calculadora aritmética"));
        painelConteudo.setLayout(new BorderLayout());
        painelConteudo.add(BorderLayout.CENTER, resultadoTF);
        painelConteudo.add(BorderLayout.SOUTH, painelCalculadora);

        JFrame frame = new JFrame();
        frame.setTitle("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(painelConteudo);
        frame.pack();
        frame.setLocationRelativeTo(null);

        calcBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        frame.setVisible(true);
    }

    public void calcular() {
        boolean num1Valido = true;
        boolean num2Valido = true;

        double num1 = 0;
        try {
            num1 = Double.parseDouble(num1TF.getText());
        } catch (NumberFormatException e) {
            num1Valido = false;
        }

        double num2 = 0;
        try {
            num2 = Double.parseDouble(num2TF.getText());
        } catch (NumberFormatException ex) {
            num2Valido = false;
        }

        if (num1Valido && num2Valido) {
            boolean divisaoPorZero = false;
            double resultado = 0;

            String operacaoSelecionada = (String) operCBB.getSelectedItem();
            if (operacaoSelecionada.equals(MAIS)) {
                resultado = num1 + num2;
            } else if (operacaoSelecionada.equals(MENOS)) {
                resultado = num1 - num2;
            } else if (operacaoSelecionada.equals(MULT)) {
                resultado = num1 * num2;
            } else if (operacaoSelecionada.equals(DIV)) {
                if (num2 == 0) {
                    divisaoPorZero = true;
                } else {
                    resultado = num1 / num2;
                }
            }

            if (divisaoPorZero) {
                String msg = "Operação inválida - divisão por zero!";
                JOptionPane.showMessageDialog(null, msg, "Calculadora", JOptionPane.WARNING_MESSAGE);
            } else {
                resultadoTF.setText(String.format("%.2f", resultado));
            }
        } else {
            if (!num1Valido) {
                String msg = "O valor \"" + num1TF.getText() + "\" não é um número válido.";
                JOptionPane.showMessageDialog(null, msg, "Calculadora", JOptionPane.WARNING_MESSAGE);
            } else if (!num2Valido) {
                String msg = "O valor \"" + num2TF.getText() + "\" não é um número válido.";
                JOptionPane.showMessageDialog(null, msg, "Calculadora", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Calc();
    }
}
