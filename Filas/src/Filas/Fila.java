package Filas;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(10);
	}
	
	public void enfila(T elemento) {
		super.aumentaCapacidade();
		super.adiciona(elemento);
	}
	
	public T desenfila() {
		final int POS = 0;
		if(estaVazia()==true) {
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POS];
		
		this.remover(0);
		
		return elementoASerRemovido;
		
	}
	
	public T espiar() {
		if(estaVazia() == true) {
			return null;
		}
		return this.elementos[0];
	}

}
