/*
 *  Algoritmo -> Calcula valor arrecadado por uma fábrica de camisetas
 *  		  -> pequeno(10), medio(12), grande(15)
 *  Por Kalil de Oliveira, data 17 de maio de 2023;
 *  
 */
package br.sc.senac.exercicios.lista1;
import java.util.*;
public class Classe008 {
	// CalculoVendaCamisetas
	public static void main(String[] args) {
		// variaveis
		double valorPequena=10.0;
		double valorMedia=12.0;
		double valorGrande=15.0;
		Scanner entrada = new Scanner(System.in);
		
		// entradas e processos
		System.out.print("Quantidade pequenas-> ");
		int quantidade = entrada.nextInt();
		valorPequena = valorPequena*quantidade;
		// valorPequena *= quantidade;
		
		System.out.print("Quantidade medias -> ");
		quantidade = entrada.nextInt();
		valorMedia = valorMedia*quantidade;
		System.out.print("Quantidade grandes-> ");
		quantidade = entrada.nextInt();
		valorGrande = valorGrande*quantidade;
		
		// saidas
		System.out.println 
		   ("Valor arrecadado -> "+ 
		      (
		        valorPequena
			+valorMedia
			+valorGrande
		      )
		   );
		System.out.println("Pequena -> "+valorPequena);
		System.out.println("Media -> "+valorMedia);
		System.out.println("Gramde -> "+valorGrande);
		
		entrada.close();
	}

}
