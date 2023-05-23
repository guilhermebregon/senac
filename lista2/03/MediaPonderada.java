/*
	Algoritmo -> Recebe três notas e pesos e devolve a média ponderada
	Por Kalil de Oliveira, 22 de maio de 2023
	https://github.com/profkalil
*/

import java.util.Scanner;
public class MediaPonderada {
   public static void main (String[] args) {
	   //variaveis
		double nota0=0.0, nota1=0.0, nota2=0.0;
		int peso0=0, peso1=0, peso2=0;
		Scanner sc = new Scanner(System.in);
		
	   //entradas
		System.out.print("Nota 1 ->");
		nota0 = sc.nextDouble();
		System.out.print("Peso -> ");
		peso0 = sc.nextInt();
		
		System.out.print("Nota 2 ->");
		nota1 = sc.nextDouble();
		System.out.print("Peso -> ");
		peso1 = sc.nextInt();
		
		System.out.print("Nota 3 ->");
		nota2 = sc.nextDouble();
		System.out.print("Peso -> ");
		peso2 = sc.nextInt();
		
	   //processos
		double media = ((nota0*peso0) + (nota1*peso1) + (nota2*peso2))/(peso0+peso1+peso2);
	   
	   //saidas
		System.out.printf ("Media -> %.2f", media);
		sc.close();
   }
}