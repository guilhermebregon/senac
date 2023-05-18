/*
 * 	Algoritmo -> Le as dimensões de um terreno retangular e exibir a área
 *      Por Kalil de Oliveira
 */

package br.sc.senac.exercicios.lista1;
import java.util.*;

public class Classe001 {
	   // CalculaArea
	public static void main(String[] args) {
		// variaveis
		double lado1=0;
		double lado2=0;
		Scanner sc = new Scanner(System.in);
		
		// Entradas
		System.out.print("Lado 1 -> ");
		lado1 = sc.nextDouble();
		System.out.print("Lado 2 -> ");
		lado2 = sc.nextDouble();
		sc.close();
		
		// processos
		 lado1 = lado1*lado2;
		
		// saídas
		//System.out.printf("Dimensoes do Terreno -> %.2f" , (lado1*lado2));
		System.out.println("Dimensoes -> " + lado1);
		

	}

}
