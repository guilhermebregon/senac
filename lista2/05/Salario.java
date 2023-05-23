/*
	Algoritmo -> Adiciona gratificação de 5% sobre o salário e desconta imposto de 7%
	Por Kalil de Oliveira, 22 de maio de 2023
	https://github.com/profkalil
*/

import java.util.Scanner;
public class Salario {
   public static void main (String[] args) {
	   // variaveis
		double salario=0.0;
		Scanner sc = new Scanner(System.in);
		
	   // entradas 
		System.out.print ("Salário base ->");
		salario = sc.nextDouble();
		
	   // processos
		salario*=1.05;
		salario*=0.93;
	   
	   // saídas
		System.out.println("Salario a receber->"+salario);
		sc.close();
   }
}