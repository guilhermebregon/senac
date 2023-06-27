package com.senac.aped;
import java.util.ArrayList;
import java.util.Scanner;
public class Professor {
    public void fazerPerguntas(Prova prova, Aluno aluno) {
        ArrayList<Pergunta> perguntas = prova.perguntas;

        Scanner sc = new Scanner(System.in);

        for (Pergunta pergunta : perguntas) {
            System.out.print(pergunta.texto+"\n -> ");
            String resposta = sc.nextLine();
            aluno.responder(pergunta, resposta);
        }

        sc.close();
    }
}