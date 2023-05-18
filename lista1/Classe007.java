/*
 *  Algoritmo -> Recebe dia/mes e retorna quantidade de dias passados no ano
 *  		  -> Mês de 30 dias
 *  Por Kalil de Oliveira, data 17 de maio de 2023;
 *  
 *  
 */
package br.sc.senac.exercicios.lista1;
import java.util.*;
public class Classe007 {
	// CalculaDiasNoAno
	public static void main(String[] args) {
		// variaveis
		int dia=0;
		int mes=0;
		Scanner entrada = new Scanner(System.in);
		
		// entradas
		System.out.print("Informe o dia-> ");
		dia = entrada.nextInt();
		System.out.print("Informe o mes-> ");
		mes = entrada.nextInt();
		
		// processos
		mes=(mes-1)*30+dia;
		
		// saidas
		System.out.println("Dias percorridos -> " + mes + " dias");
		
		entrada.close();
	}

}
