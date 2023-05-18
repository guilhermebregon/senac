/*
 * 
 *  Algoritmo -> Le nome e idade e devolve qtdade de dias de vida (ano = 365 dias).
 *  Por Kalil de Oliveira
 *  
 *  
 * 
 * */

package br.sc.senac.exercicios.lista1;
import java.util.*;

public class Classe004 {

	public static void main(String[] args) {
		
		// variaveis
		int idade=0; 							// primitiva float double char int
		String nome=" ";						// objeto
		Scanner sc = new Scanner(System.in);  	// objeto
		
		// entradas
		System.out.print("Nome -> ");
		nome = sc.next();
		System.out.print("Idade -> ");
		idade = sc.nextInt();
		
		// processos
		idade = idade*365;
		
		// saidas
		System.out.println(nome + ", voce ja viveu " + idade + " dias.");
		
		sc.close();

	}

}
