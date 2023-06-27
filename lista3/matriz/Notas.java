import java.util.*;

public class Notas {
	Scanner sc = new Scanner(System.in);
	public void completaNotas(ArrayList<Double> notas) {
		System.out.print("Quantidade de notas -> ");
		int tam=sc.nextInt();
		for (int i=0; i<tam; i++) {
			System.out.print("Digite uma nota - > ");
			double nota = sc.nextDouble();
			notas.add(nota);
		}
	}
	public void mudarUmaNota(ArrayList<Double> notas) {
		System.out.println("Qual nota deseja mudar?");
		System.out.print("Indice -> ");
		int op = sc.nextInt();
		System.out.print("Nova nota -> ");
		double nota = sc.nextDouble();
		notas.set(op, nota);
		
	}
	public void apagarUmaNota(ArrayList<Double> notas) {
		System.out.println("Qual nota deseja apagar?");
		System.out.print("Indice -> ");
		int op = sc.nextInt();
		notas.remove(op);
	}
	public void imprimeNotas(ArrayList<Double> notas) {
		System.out.println(notas);
	}
	public void apagarNotas(ArrayList<Double> notas) {
		notas.clear();
	}
	// pegar uma nota notas.get(<indice>);
	// tamanho do array notas.size();
}