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
		if(tamanho == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		No<T> atual = this.inicio;
		for (int i =0 ; i < this.tamanho-1; i++) {
			builder.append(atual.getElemento()).append(",");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento());
		
		/*builder.append(atual.getElemento()).append(",");
		while(atual.getProximo() != null) {
			atual = atual.getProximo();
			builder.append(atual.getElemento()).append(",");
		}*/
		return builder.toString();
	}
	
	
}
