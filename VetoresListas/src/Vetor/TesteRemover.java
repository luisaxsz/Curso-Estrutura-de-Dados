package Vetor;

public class TesteRemover {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		System.out.println(vetor);
		vetor.remover(2);
		System.out.println(vetor);

	}
}
