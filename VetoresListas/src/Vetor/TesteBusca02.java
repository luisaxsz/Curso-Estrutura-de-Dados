package Vetor;

public class TesteBusca02 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		
		System.out.println(vetor.busca("Elemento 2"));
		System.out.println(vetor.busca("Elemento 5"));

		
	}
}
