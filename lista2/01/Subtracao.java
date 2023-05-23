/*
	Algoritmo -> Recebe dois números, calcula e mostra a subtração do primeiro pelo segundo;
	Por Kalil de Oliveira, 21 de maio de 2023
	https://github.com/profkalil
*/

import java.util.Scanner;
public class Subtracao {
   public static void main (String[] args) {
      // variaveis
	  int primeiro=0, segundo=0;
	  Scanner sc = new Scanner(System.in);
	  
	  // entradas
	  System.out.print ("Primeiro -> ");
	  primeiro = sc.nextInt();
	  System.out.print ("Primeiro -> ");
	  segundo = sc.nextInt();
	  
	  // processos
      segundo = primeiro - segundo;
	  
	  // saídas
      System.out.println (segundo);
	  sc.close();
   }
}