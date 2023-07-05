package Vetor;

public class TesteBusca {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		try {
			System.out.println(vetor.busca(3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
