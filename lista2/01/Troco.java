//https://www.tutorialspoint.com/online_java_formatter.htm
	  
/*
	Algoritmo -> Recebe o valor do produto e o pagamento, devolvendo o troco;
	Por Kalil de Oliveira, 21 de maio de 2023
	https://github.com/profkalil
*/

import java.util.Scanner;
public class Troco {
   public static void main (String[] args) {
      	  // variaveis
	  double ValorProduto=0.0, valorPago=0.0;
	  Scanner sc = new Scanner(System.in);
	  
	  // entradas
	  System.out.print ("Informe dois valores.");
	  System.out.print ("Preco do produto -> ");
	  valorProduto = sc.nextInt();
	  System.out.print ("Valor pago -> ");
	  valorPago = sc.nextInt();
	  if(valorPago>valorProduto) {
      	  	boolean trocoOk=true;
	  } else {
	  	System.out.println("Valor insuficiente");
	  }
	  
	  // saídas
	   if (trocoOk) {
      	    int resultado = valorProduto - valorPago;
	     System.out.println ("Troco-> " + resultado);
	   }
	  sc.close();
   }
}
