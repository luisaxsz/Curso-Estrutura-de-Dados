package Questao2;

import java.util.Scanner;
import java.util.Stack;

public class Questao2 {

	public static void main(String[] args) throws Exception {
		Stack <Integer> par = new Stack <Integer>();
		Stack <Integer> impar = new Stack <Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0 ; i <= 10 ; i++) {
			System.out.println("Insira um numero: ");
			int num =  scan.nextInt();
			
			if(num % 2 == 0) {
				par.add(num);
			}else {
				impar.add(num);
			}
			
			try {
				if(num == 0) {
					par.pop();
					impar.pop();
				}
			}catch(Exception e){
				throw new Exception("A pilha esta vazia");
			}
		}
		
		System.out.println(par);
		System.out.println(impar);
	}

}
