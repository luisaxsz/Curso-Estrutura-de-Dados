package ListaEncadeada;

public class ListEncadeada<T> {
	private No<T> inicio;
	private No<T> ultimoElemento;
	private int tamanho = 0;
	
	public void adiciona(T elemento){
		No<T> celula = new No<T>(elemento);
		if(tamanho == 0) {
			this.inicio = celula;
			this.ultimoElemento = celula;
		}else {
			this.ultimoElemento.setProximo(celula);
		}
		this.ultimoElemento = celula;
		this.tamanho++;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		return "ListEncadeada [inicio=" + inicio + "]";
	}
	
	
}
