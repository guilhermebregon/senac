package com.senac.investigacao;

public class Investigador {
	public boolean interrogar(Investigado inv, Pergunta p) {
                int aux = p.fazPergunta();
		if (aux>3) {
                        if (aux==3){
				System.out.println("Suspeito");
			} else if (aux==4) {
				System.out.println("Cumplice");
			} else if (aux==5) {
				System.out.println("Assassino");
			} else {
				System.out.println("Inocente");
			}
			inv.culpado = true;
		}
		return inv.culpado;
	}
}