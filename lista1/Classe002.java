/*
 * 
 *  Algoritmo -> Calcula a quantidade de ferraduras para equipar os cavalos comprados para um haras.
 *  Por Kalil de Oliveira
 * 
 * */

package br.sc.senac.exercicios.lista1;
import java.util.*;

public class Classe002 {

	public static void main(String[] args) {
	
	// variaveis
	final int ferraduras=4;
	int cavalos=0;
	Scanner sc = new Scanner(System.in);
	
	// entradas
	System.out.print("Cavalos -> ");
	cavalos = sc.nextInt();
	
	// processos
	cavalos=cavalos*ferraduras;
	
	// saídas
	System.out.println("Quantidade de ferraduas necessarias -> " + cavalos);
	
	sc.close();
	}

}
