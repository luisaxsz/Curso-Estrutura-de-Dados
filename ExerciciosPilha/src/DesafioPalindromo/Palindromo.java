package DesafioPalindromo;

import java.util.Scanner;
import java.util.Stack;

public class Palindromo {
	public static void main(String[] args) {
		
		System.out.println(verificaPalindromo(null));
		
		
	}
	
	public static boolean verificaPalindromo(String palavra) {
		//cria a pilha
		Stack<Character> pilha = new Stack <Character>();
		Scanner scan = new Scanner(System.in);
		
		//entrada da palavra
		System.out.println("Teste a palavra: ");
		palavra = scan.nextLine();
		
		//empilha os caracteres da palavra
		for (int i  = 0; i < palavra.length(); i++) {
			pilha.add(palavra.charAt(i));
		}
		
		String palavraInversa = "";
		
		//inverte a palavra
		while (!pilha.isEmpty()) {
			palavraInversa += pilha.pop();
		}
		//verifica se palavras sao iguais
		if(palavra.equalsIgnoreCase(palavraInversa)) {
			return true;
		}
		return false;
	}
}
