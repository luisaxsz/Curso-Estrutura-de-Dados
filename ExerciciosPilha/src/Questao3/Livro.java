package Questao3;

public class Livro {
	private String nome;
	private String nomeAutor;
	private int anoLancamento;
	
	
	public Livro(String nome, String nomeAutor, int anoLancamento) {
		super();
		this.nome = nome;
		this.nomeAutor = nomeAutor;
		this.anoLancamento = anoLancamento;
	}
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	@Override
	public String toString() {
		return "Livro ["+ nome + " " + nomeAutor + " " + anoLancamento + "]";
	}
	
	
}
