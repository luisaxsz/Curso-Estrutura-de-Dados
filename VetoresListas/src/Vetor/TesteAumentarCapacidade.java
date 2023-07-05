package Vetor;

public class TesteAumentarCapacidade {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);

		// Teste adicionando 2 vetores
		try {
			vetor.adicionar("Elemento 1");
			vetor.adicionar("Elemento 2");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(vetor);

		// Teste adicionando mais espaços ao vetor
		try {
			vetor.adicionar("Elemento 3");
			vetor.adicionar("Elemento 4");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(vetor);
	}

}
