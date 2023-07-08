package Questao3;

import java.util.Scanner;
import java.util.Stack;

public class TesteLivro {
	public static void main(String[] args) {
		Stack<Livro> pilhaLivro = new Stack<Livro>();
		
		adicionarLivro(3,pilhaLivro);
		
		System.out.println(pilhaLivro);

	}

	public static void adicionarLivro(int quantidade, Stack<Livro> pilhaLivro) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < quantidade; i++) {
			Livro livro = new Livro();
			System.out.println("Insira o nome do livro: ");
			livro.setNome(scan.nextLine());
			System.out.println("Insira o nome do Autor(a): ");
			livro.setNomeAutor(scan.nextLine());
			System.out.println("Insira o ano de lancamento: ");
			livro.setAnoLancamento(scan.nextInt());
			scan.nextLine();
			pilhaLivro.add(livro);
		}
	}
}
