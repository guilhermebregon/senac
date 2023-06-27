package com.senac.aped;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeitorArquivo {

    public static ArrayList<Pergunta> lerPerguntasDoArquivo() {
        ArrayList<Pergunta> perguntas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\java\\appAped\\src\\com\\senac\\aped\\pergunta.txt"))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                Pergunta pergunta = new Pergunta(linha);
                perguntas.add(pergunta);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return perguntas;
    }

    public static ArrayList<String> lerRespostasDoArquivo() {
        ArrayList<String> respostas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\java\\appAped\\src\\com\\senac\\aped\\resposta.txt"))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                respostas.add(linha);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return respostas;
    }
}
