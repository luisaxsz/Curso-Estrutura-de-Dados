package Vetor;

public class TesteRemover {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(6);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		System.out.println(vetor);
		//vetor.remover(4);
		//System.out.println(vetor);
		
		System.out.println("Remover elemento E");
		int pos = vetor.busca("D");
		if(pos > -1) {
			vetor.remover(pos);
		}
		System.out.println(vetor);
		
		
		

	}
}
