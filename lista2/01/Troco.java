/*
	Algoritmo -> Recebe o valor do produto e o pagamento, devolvendo o troco;
	Por Kalil de Oliveira, 21 de maio de 2023
	https://github.com/profkalil
*/

import java.util.Scanner;
public class Troco {
   public static void main (String[] args) {
      	  // variaveis
	  int primeiro=0, segundo=0;
	  Scanner sc = new Scanner(System.in);
	  
	  // entradas
	  System.out.print ("Informe dois valores.");
	  System.out.print ("Preco do produto -> ");
	  primeiro = sc.nextInt();
	  System.out.print ("Valor pago -> ");
	  segundo = sc.nextInt();
	  //https://www.tutorialspoint.com/online_java_formatter.htm
	  // processos
      	  int resultado = primeiro - segundo;
	  
	  // saídas
      	  System.out.println ("Troco-> " + resultado);
	  sc.close();
   }
}
