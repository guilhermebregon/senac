package com.senac.investigacao;

public class InvestigacaoTest {

	public static void main(String[] args) {
		Investigador delegado = new Investigador();
		Investigado joao = new Investigado();
		Pergunta pergunta = new Pergunta();
		if (delegado.interrogar(joao, pergunta)) {
			System.out.println("Condenado");
		} else {
			System.out.println("Inocente");
		}

	}

}
