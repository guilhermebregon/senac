package com.senac.aped;
import java.util.ArrayList;

public class Aluno {
    public String nome;
    public ArrayList<Resposta> respostas;

    public Aluno(String _nome) {
        nome = _nome;
        this.respostas = new ArrayList<>();
    }

    public void responder(Pergunta pergunta, String resposta) {
        Resposta respostaAluno = new Resposta(pergunta, resposta);
        respostas.add(respostaAluno);
    }
}