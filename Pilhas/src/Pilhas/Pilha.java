package Pilhas;


public class Pilha<T> extends EstruturaEstatica<T>{
	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		super.aumentaCapacidade();
		super.adiciona(elemento);
	}
	
	public T topo() {
		if(estaVazia() == true) {
			return null;
		}
		return this.elementos[tamanho-1];
	}
	
	
	public T desempilha() {
		if(estaVazia()==true) {
			return null;
		}
		
		/*
		T elemento = this.elementos[tamanho-1];
		tamanho--;
		
		return elemento;
		*/
		
		//linha simplificada
		
		return this.elementos[--tamanho];
	}
}
