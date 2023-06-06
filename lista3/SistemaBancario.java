import java.util.*;

public class SistemaBancario {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		if (validaSenha()) {
			menu();
		} else {
			System.out.println("Acesso bloqueado");
		}
		sc.close();
	}
	public static boolean validaSenha() {
		final String senhaSistema = "123xyz";
		int tentativas = 3;
		String senha;
		while (true) {
			System.out.print("Senha -> ");
			senha = sc.next();
			if (senha.equals(senhaSistema)) {
				return true;
			} else {
				tentativas--;
				System.out.println("Senha invalida. Voce tem mais " + tentativas + " tentativas");
				if (tentativas==0) {
					return false;
				}
			}
		}
	}
	public static boolean menu() {
		int operacao = 0;		
		boolean sair = false;
		double saldo = 0.0, limite = 1000.0, valorOperacao = 0.0;
		while (true) {
			System.out.println("\nSeu saldo atual-> " + saldo + " + " + limite + " de limite");
			if (sair==true) {
				System.out.println("Deseja sair? Sim ou Não");
				System.out.print("Opcao - >");
				String opcao = sc.next();
				String Sim="Sim", sim="sim";
				if (opcao.equals(sim) || opcao.equals(Sim)) {
					return false;
				} 
			}
			operacao = 0;
			// public static int menu2()
			do {
				System.out.print("\nEscolha uma operacao:" + "\n1 - debito \n2 - credito" + "\nOpcao -> ");
				operacao = sc.nextInt();
			} while (!(operacao == 1 || operacao == 2));
			
			// public static double saque();
			while (valorOperacao <= 0.0) {
				System.out.print("\nValor -> ");
				valorOperacao = sc.nextDouble();
			}
			if (operacao == 1) {
				if (valorOperacao <= (saldo + limite)) {
					saldo -= valorOperacao;
					if (saldo < 0) {
						limite = limite + saldo;
						if (limite < -1000) {
							saldo += valorOperacao;
							limite = 1000;
							System.out.println("Limite insuficiente. Fale com seu gerente");
						}
					}
				} else {
					System.out.println("Limite insuficiente. Fale com seu gerente");
				}
				valorOperacao = 0.0;
				sair = true;
				
				// public static double deposito();
			} else if (operacao == 2) {
				if (limite < 1000) {
					limite += valorOperacao;
					saldo += valorOperacao;
					if (limite > 1000) {
						saldo = limite - 1000;
						limite = 1000;
					}
				} else {
					saldo += valorOperacao;
				}
				valorOperacao = 0.0;
				sair = true;
			}
		}
	}
	public static double saque() {
		// implementar
		return 0.0;
	}
	public static double deposito() {
		// implementar
		return 0.0;
	}
	public static int menu2() {
		//implemantar
		return 0;
	}
}
