package ListaEncadeada;

public class TesteListaEncadeada {
	public static void main(String[] args) {
		ListEncadeada <Integer> lista = new ListEncadeada<Integer>();
		
		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(3);
		
		System.out.println(lista);
		lista.limparCorretamente();
		System.out.println(lista);
		
	}
}
