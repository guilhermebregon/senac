/*
 *  Algoritmo -> Le o preco da gasolina, valor pago e retorna qtdade de litros comprados
 *  Por Kalil de Oliveira
 *  
 * */ 

package br.sc.senac.exercicios.lista1;
import java.util.Scanner;

public class Classe005 {
		//CalculaCompraCombustivel	
	public static void main(String[] args) {

		// variaveis
		double precoDaGasolina=0.0;
		//float precoFloat=0.0;
		double valorPago=0.0;
		Scanner leitura = new Scanner(System.in);
		
		// entradas
		System.out.print("Preco da Gasolina -> ");
		precoDaGasolina = leitura.nextDouble();
		//precoFloat = leitura.nextFloat();
		System.out.print("Valor disponivel -> ");
		valorPago = leitura.nextDouble();
		
		// processos
		double quantidadeGasolina = valorPago/precoDaGasolina;
		int quantidadeInteira = (int)quantidadeGasolina;
		
		// saidas
		System.out.println("Quantidade comprada -> " + quantidadeInteira);
		System.out.println("Quantidade comprada -> " + quantidadeGasolina);
		
		leitura.close();

	}

}
