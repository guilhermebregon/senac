/*
	Algoritmo -> Recebe três notas de um estudante, calcula e mostra a média aritmética
	Por Kalil de Oliveira, 21 de maio de 2023
	https://github.com/profkalil
*/

import java.util.Scanner;
public class Media {
   public static void main (String[] args){
      // variaveis
	  double nota=0, soma=0;
	  Scanner sc = new Scanner (System.in);
      
	  // entradas
	  for (int i=1; i<=3; i++) {
		  System.out.print ("Nota "+i+" -> ");
		  nota = sc.nextDouble();
		  soma +=nota;
	  }
	  
	  // processos
	  soma/= 3;
	  
	  // saidas
      System.out.println ("Media ->" + soma);
	  sc.close();
   }
}