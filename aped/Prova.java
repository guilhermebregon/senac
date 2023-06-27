package com.senac.aped;
import java.util.ArrayList;

public class Prova {
    public ArrayList<Pergunta> perguntas;

    public Prova() {
        this.perguntas = new ArrayList<>();
    }

    public void adicionarPergunta(Pergunta pergunta) {
        perguntas.add(pergunta);
    }
}