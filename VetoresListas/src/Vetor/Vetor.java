package Vetor;

import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * public void adiciona(String elemento) { for (int i = 0; i < elementos.length;
	 * i++) { if (this.elementos[i] == null) { this.elementos[i] = elemento; break;
	 * } } }
	 */

	/*
	 * public void adiciona(String elemento) throws Exception { if(this.tamanho <
	 * this.elementos.length) { this.elementos[this.tamanho] = elemento; tamanho++;
	 * }else { throw new Exception("Vetor cheio"); }
	 */

	public boolean adiciona(String elemento) {
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

	// Método que busca elemento de determinada posicao

	/*
	 * public String busca(int posicao) throws Exception { if(!(posicao >= 0 &&
	 * posicao < tamanho)){ throw new IllegalArgumentException("Posicao invalida");
	 * }
	 * 
	 * return this.elementos[posicao]; }
	 */

	// Metodo que verifica se elemento está no array

	public int busca(String elemento) {
		// Busca sequencial
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i; //posicao em que ele esta
			}
		}
		return -1;//posicao nao existente
	}

}
