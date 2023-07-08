package Questao1;

import java.util.Scanner;
import java.util.Stack;

public class Questao {

	public static void main(String[] args) {
		Stack <Integer> novaPilha = new Stack<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Insira um numero a pilha:");
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				novaPilha.add(num);
			}else {
				novaPilha.add(num);
				novaPilha.pop();
			}
			
			if(novaPilha.isEmpty() == true) {
				System.out.println("A pilha está vazia");
			}else {
				System.out.println(novaPilha);
			}
		}
	}

}
