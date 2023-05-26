package br.sc.senac.exercicios.lista1;

/*
Algoritmo -> Sistema de divisão de fatias de uma Pizzaria em até 12 fatias;
		  
Por Kalil de Oliveira, 21 de maio de 2023
https://github.com/profkalil
*/

import java.util.Scanner;
public class ClasseExemplos {
public static void main (String[] args) {
   // variaveis
  int qtdadeFatias = 0;
  Scanner sc = new Scanner(System.in);
   
  // entradas
  System.out.print ("Quantidade de fatias ->");
  qtdadeFatias = sc.nextInt();
  
  verificaQuantidade(qtdadeFatias);
  sc.close();
}
public static void verificaQuantidade(int qtdadeFatias) {
	if (qtdadeFatias<0 || qtdadeFatias>12) {
		  System.out.println ("Erro");
	  } else {
		  System.out.println("OK");
	  }
}
}


