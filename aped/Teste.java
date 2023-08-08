package com.senac.aped;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Pergunta> perguntas = LeitorArquivo.lerPerguntasDoArquivo();
        ArrayList<String> respostas = LeitorArquivo.lerRespostasDoArquivo();

        //Prova prova1 = new Prova();
        Prova prova = new Prova();
        for (Pergunta pergunta : perguntas) {
            prova.adicionarPergunta(pergunta);
        }

        Aluno aluno = new Aluno("João");

        Professor professor = new Professor();
        professor.fazerPerguntas(prova, aluno);

        ArrayList<Resposta> respostasAluno = aluno.respostas;

        for (int i = 0; i < respostasAluno.size(); i++) {
            Resposta respostaAluno = respostasAluno.get(i);
            String respostaCorreta = respostas.get(i);

            System.out.println("RELATORIO");
            System.out.println("Pergunta: " + respostaAluno.pergunta.texto);
            System.out.println("Resposta do Aluno: " + respostaAluno.resposta);
            System.out.println("Resposta Correta: " + respostaCorreta);
            System.out.println();
        }
    }
}
