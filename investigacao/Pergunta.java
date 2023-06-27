package com.senac.investigacao;

import java.util.Scanner;

public class Pergunta {
	public int fazPergunta() {
		String [] p = montaPergunta();
		String pergunta;
		String resposta="Sim";
		int contador=0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<p.length; i++) {
			System.out.println(p[i]);
			pergunta = sc.next();
			if (pergunta.equals(resposta)) {
				contador++;
			}
		}
		sc.close();
		return contador;
	}
	public String[] montaPergunta() {
		String [] p = new String[5];
		p[0] = "Telefonou para a vitima?";
		p[1] = "Esteve no local do crime?";
		p[2] = "Mora perto da vitima?";
		p[3] = "Devia para a vitima?";
		p[4] = "Ja trabalhou com a vitima?";
		return p;
	}
}
