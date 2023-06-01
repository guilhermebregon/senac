import java.util.*;

public class SistemaBancario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String senhaSistema = "123xyz";
		int operacao = 0, tentativas = 3;
		String senha;
		boolean senhaValida = false;
		double saldo = 0.0, limite = 1000.0, valorOperacao = 0.0;

		while ((!senhaValida) && (tentativas > 0)) {
			System.out.print("Senha -> ");
			senha = sc.next();
			if (senha.equals(senhaSistema)) {
				senhaValida = true;
			} else {
				tentativas--;
				System.out.println("Senha invalida. Voce tem mais " + tentativas + " tentativas");
			}
		}
		if (senhaValida) {
			while (true) {
				System.out.println("\nSeu saldo atual-> " + saldo + " + " + limite + " de limite");
				operacao = 0;
				do {
					System.out.print("\nEscolha uma operacao:" + "\n1 - debito \n2 - credito" + "\nOpcao -> ");
					operacao = sc.nextInt();
				} while (!(operacao == 1 || operacao == 2));
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
				}
			}
		} else {
			System.out.println("Acesso bloqueado");
		}
		sc.close();
	}
}
