package Pilhas;

public class TestePilha {

	public static void main(String[] args) {
		
		Pilha<Integer> novaPilha = new Pilha<Integer>();
		
		//Verifica se pilha esta vazia
		System.out.println(novaPilha.estaVazia());
		//Mostra o valor do topo da pilha
		System.out.println(novaPilha.topo());
		//Adicionar valor a pilha
		for (int i = 0 ;  i < 11; i++) {
			novaPilha.empilha(i);
		}
		System.out.println(novaPilha);
		System.out.println(novaPilha.tamanho);
		//Verifica se pilha esta vazia
		System.out.println(novaPilha.estaVazia());
		//Mostra o valor do topo da pilha
		System.out.println(novaPilha.topo());
	}

}
