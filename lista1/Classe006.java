/*
 * 
 *  Algoritmo -> Lê o peso (quilos) de uma refeição e retorna o valor a pagar
 *  Por Kalil de Oliveira, data 17 de maio de 2023;
 * 
 * 
 */

package br.sc.senac.exercicios.lista1;
import java.util.Scanner;

public class Classe006 {

	public static void main(String[] args) {
		
		// variaveis
		double peso=0.0;
		final double valorDoQuilo=12.00;
		Scanner entrada = new Scanner(System.in);
		
		// entradas
		System.out.print("Peso do prato -> ");
		peso = entrada.nextDouble();
		
		// processos
		peso = valorDoQuilo*peso;

		// saidas
		System.out.println("Valor a ser pago -> "+peso);
		
		entrada.close();
	}

}
