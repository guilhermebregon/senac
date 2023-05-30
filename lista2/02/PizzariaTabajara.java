package br.sc.senac.exercicios.lista1;

import java.util.*;

/*
Algoritmo -> Sistema de divisão de fatias de uma Pizzaria em até 12 fatias;
		  -> Broto(2 sabores e ate 4 fatias), Media(3 sabores e ate 6 fatias)
		  -> Grande(4 sabores e ate 9 fatias) e Gigante(4 sabores ate 12 fatias)
	  -> O cliente escolhe o tamanho da pizza, a quantidade de sabores e quantidade 
	     conforme as regras acima!
		  
Por Kalil de Oliveira, 21 de maio de 2023
https://github.com/profkalil
*/

public class PizzariaTabajara {
	static Scanner sc = new Scanner(System.in);
	
public static void main (String[] args) {
	escolhePizza();
}
public static void escolhePizza() {
	System.out.println ("\nBem-vindo a pizzaria SENAC!");
	System.out.println ("Escolha um tipo de pizza->");
	System.out.println ("1 - Broto");
	System.out.println ("2 - Media");
	System.out.println ("3 - Grande");
	System.out.println ("4 - Gigante");
	System.out.print("Opcao nro -> ");
	
	int opcao = sc.nextInt();
	if (opcao ==1) {
		broto();
	}
	if (opcao ==2) {
		
		//media();
	}
	if (opcao ==3) {
		
		//grande();
	}
	if (opcao ==4) {
		
		//gigante();
	}
}
public static void broto() {
	
	String tipo="Broto";
	System.out.println("\nVocê pode escolher até dois sabores");
	System.out.print ("Quantidade Sabores -> ");
	int qtdadeSabores = sc.nextInt();
		if (qtdadeSabores>0 || qtdadeSabores<2) {
			System.out.println("\nVocê pode escolher até quatro fatias");
			System.out.print ("Quantidade fatias -> ");
			int qtdadeFatias = sc.nextInt();
			if (qtdadeFatias>0 || qtdadeFatias<4) {
				imprimePedido(tipo, qtdadeSabores, qtdadeFatias);
			}
		} else {
			System.out.println("Erro");
		}
}
public static void imprimePedido(String tipo, int qtdadeSabores, int qtdadeFatias) {
	System.out.println("\n\nObrigado por escolher a pizza SENAC!");
	System.out.println("Pizza escolhida -> "+tipo);
	System.out.println("Quantidade de sabores -> "+qtdadeSabores);
	System.out.println("Quantidade de fatias -> "+qtdadeFatias);
}	
}
