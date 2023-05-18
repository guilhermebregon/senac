/*
 * 
 *  Algoritmo -> Le a quantidade de paes e broas de uma padaria e retorna o valor arrecadado e a poupar.
 *  Por Kalil de Oliveira, 
 *  
 * 
 * */

package br.sc.senac.exercicios.lista1;
import java.util.*;

public class Classe003 {

	public static void main(String[] args) {
		// variaveis
		int paes=0;
		int broas=0;
		final double valorPaes=0.12;
		final double valorBroas=1.5;
		double totalVendido=0.0;
		double poupanca=0.0; // 10 por cento
		Scanner sc = new Scanner(System.in);
		
		// entradas
		System.out.print("Qtdade de paes -> ");
		paes = sc.nextInt();
		System.out.print("Qtdade de broas -> ");
		broas = sc.nextInt();
		
		// processos
		// valorPaes = valorPaes*paes;
		// valorBroas = valorBroas*broas;
		// totalVendido = valorPaes + valorBroas;
		poupanca = totalVendido*0.1; // ou totalVendido * 10/100;
		
		System.out.println("Total -> " + ((valorPaes*paes)+(valorBroas*broas)));
		System.out.printf("Porcentagem -> %.2f", ((valorPaes*paes)+(valorBroas*broas))*0.1);
		
		// saidas
		// System.out.printf("\nTotal Vendido -> %.2f ", totalVendido);
		// System.out.printf("\nA guardar na poupanca -> %.2f ",  poupanca);
		
		sc.close();

	}

}
