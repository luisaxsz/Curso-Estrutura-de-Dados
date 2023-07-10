package DesafioPalindromo;

import java.util.Scanner;
import java.util.Stack;

public class Palindromo {
	public static void main(String[] args) {
		
		System.out.println(verificaPalindromo(null));
		
		
	}
	
	public static boolean verificaPalindromo(String palavra) {
		Stack<Character> pilha = new Stack <Character>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Teste a palavra: ");
		palavra = scan.nextLine();
		
		for (int i  = 0; i < palavra.length(); i++) {
			pilha.add(palavra.charAt(i));
		}
		
		String palavraInversa = "";
		
		while (!pilha.isEmpty()) {
			palavraInversa += pilha.pop();
		}
		
		if(palavra.equalsIgnoreCase(palavraInversa)) {
			return true;
		}
		return false;
	}
}
