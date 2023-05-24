package aulasjavasenac;

/*
Versão dos exercícios da lista 02 do Professor Kalil - Por Jose Tavares Equipe Tristando, 23 de maio de 2023
https://github.com/joseumtavares
*/

import java.util.Scanner;

public class Lista02_Prof_Kalil {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("-----------------------------------------");
    System.out.println("|    Selecione a opção desejada:        |");
    System.out.println("| 1. Subtração de dois números          |");
    System.out.println("| 2. Divisão de dois números            |");
    System.out.println("| 3. Média ponderada de três notas      |");
    System.out.println("| 4. Média aritmética de três notas     |");
    System.out.println("| 5. Cálculo de percentual sobre salário|");
    System.out.println("-----------------------------------------");
    
    int opcao = scanner.nextInt();

    switch (opcao) {
        case 1:
            subtracao();
            break;
        case 2:
            divisao();
            break;
        case 3:
            mediaPonderada();
            break;
        case 4:
            mediaAritmetica();
            break;
        case 5:
            percentual();
            break;
        default:
            System.out.println("Opção inválida!");
            scanner.close();
    }
}

public static void subtracao() {
    
	
    System.out.println("-------------------------------");
	System.out.println("|Bem Vindo(a), ao programa que|");
	System.out.println("|recebe dois números, calcula |");
	System.out.println("|   e mostra a subtração do   |");
	System.out.println("|    primeiro pelo segundo.   |");
    System.out.println("-------------------------------");

	
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int numero1 = scanner.nextInt();
    System.out.println("-------------------------------");
    System.out.print("Digite o segundo número: ");
    int numero2 = scanner.nextInt();
    System.out.println("-------------------------------");

    int subtracao = numero1 - numero2;

    System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é: " + subtracao);
    System.out.println("-------------------------------");
    
    scanner.close();
}

public static void divisao() {
	
		System.out.println("-------------------------------");
		System.out.println("|Bem Vindo(a), ao programa que|");
		System.out.println("|recebe dois números, calcula |");
		System.out.println("|    e mostra a divisão do    |");
		System.out.println("|    primeiro pelo segundo.   |");
	    System.out.println("-------------------------------");
	    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o dividendo: ");
    double dividendo = scanner.nextDouble();
    System.out.println("-------------------------------");

    System.out.print("Digite o divisor: ");
    double divisor = scanner.nextDouble();
    System.out.println("-------------------------------");

    if (divisor != 0) {
        double divisao = dividendo / divisor;
        System.out.println("O resultado da divisão é: " + divisao);
	    System.out.println("-------------------------------");
    } else {
    	System.out.println("Divisão por zero não é permitida!");
	    System.out.println("-------------------------------");
    }
    scanner.close();
}

public static void mediaPonderada() {
    

	System.out.println("-------------------------------");
	System.out.println("|Bem Vindo(a), ao programa que|");
	System.out.println("|  Recebe três notas e pesos  |");
	System.out.println("|              e              |");
	System.out.println("| devolve a média ponderada.  |");
    System.out.println("-------------------------------");
    
	Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1 = scanner.nextDouble();
    System.out.println("-------------------------------");
    System.out.print("Digite o peso da primeira nota: ");
    double peso1 = scanner.nextDouble();
    System.out.println("-------------------------------");
    System.out.print("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();
    System.out.println("-------------------------------");
    System.out.print("Digite o peso da segunda nota: ");
    double peso2 = scanner.nextDouble();
    System.out.println("-------------------------------");
    System.out.print("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();
    System.out.println("-------------------------------");

    System.out.print("Digite o peso da terceira nota: ");
    double peso3 = scanner.nextDouble();
    System.out.println("-------------------------------");
    double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

    System.out.println("A média ponderada é: " + mediaPonderada);
    System.out.println("-------------------------------");
   
    scanner.close();
}

public static void mediaAritmetica() {
    
	System.out.println("-------------------------------");
	System.out.println("|Bem Vindo(a), ao programa que|");
	System.out.println("|    Recebe três notas de     |");
	System.out.println("|   um estudante, calcula e   |");
	System.out.println("|  mostra a média aritmética. |");
    System.out.println("-------------------------------");
    
    //Recebe três notas de um estudante, calcula e mostra a média aritmétic
	
	Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1 = scanner.nextDouble();
    System.out.println("-------------------------------");

    System.out.print("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();
    System.out.println("-------------------------------");
    
    System.out.print("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();
    System.out.println("-------------------------------");
    
    double media = (nota1 + nota2 + nota3) / 3;

    System.out.println("A média aritmética é: " + media);
    System.out.println("-------------------------------");
    
    scanner.close();
}

public static void percentual() {
    
	System.out.println("-------------------------------");
	System.out.println("|Bem Vindo(a), ao programa que|");
	System.out.println("| Adiciona gratificação de 5% |");
	System.out.println("|     sobre o salário e       |");
	System.out.println("|   desconta imposto de 7%.   |");
    System.out.println("-------------------------------");

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o salário: R$");
    double salario = scanner.nextDouble();
    System.out.println("-------------------------------");

    double gratificacao = salario * 0.05;
    double salariobruto = salario + gratificacao; 
    double imposto = salario * 0.07;

    double salarioLiquido = salariobruto - imposto;

    System.out.println("Total de gratificação recebida: R$ " + gratificacao +"0");
    System.out.println("Total de descontos: R$ " + imposto +"0");
    System.out.println("O salário líquido com gratificação e desconto de imposto é: R$ " + salarioLiquido +"0");
    System.out.println("-------------------------------");

    scanner.close();
}
}

