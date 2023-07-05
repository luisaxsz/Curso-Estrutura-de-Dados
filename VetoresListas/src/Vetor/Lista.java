package Vetor;

import java.lang.reflect.Array;

public class Lista <T>{
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	//Opcao 2 -> construtor
	/*
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	*/
	
	// Adicionar elemento a qualquer posicao
	public boolean adicionar(T elemento, int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		this.aumentaCapacidade();
		// Move elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			// Atribuir vetor antigo ao novo
			this.elementos = elementosNovos;
		}
	}

	public void adicionar(T elemento) throws Exception {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			tamanho++;
		} else {
			throw new Exception("Vetor cheio");
		}
	}

	public boolean adiciona(T elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(" , ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

	// Metodo que verifica se elemento está no array

	public int busca(T elemento) {
		// Busca sequencial
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i; // posicao em que ele esta
			}
		}
		return -1;// posicao nao existente
	}

	// B D E F F -> POSICAO REMOVIDA 1
	// 0 1 2 3 4 -> TAMANHO E 5
	// VETOR[1] = VETOR[2]
	// VETOR[2] = VETOR[3]
	public void remover(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}

		for (int i = posicao; i <= this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}
}
