/*
	Algoritmo -> Recebe dois números, calcula e mostra a divisao do primeiro pelo segundo;
	Por Kalil de Oliveira, 21 de maio de 2023
	https://github.com/profkalil
*/

import java.util.Scanner;
public class Divisao {
   public static void main (String[] args) {
	   // variaveis
      int primeiro=1, segundo=1;
	  boolean divisaoPorZero = false;
	  Scanner sc = new Scanner(System.in);
       
	  // entradas
	  System.out.print ("Primeiro ->");
	  primeiro = sc.nextInt();
	  do {
		divisaoPorZero = false;
		System.out.print ("Segundo (não pode ser zero!) -> ");
		segundo = sc.nextInt();
		if (segundo ==0)
			divisaoPorZero = true;
	  } while (divisaoPorZero);
	  
	  // processos
      segundo = primeiro / segundo;
	  
	  // saidas
	  System.out.println ("Resultado -> " + segundo);
	  sc.close();
   }
}