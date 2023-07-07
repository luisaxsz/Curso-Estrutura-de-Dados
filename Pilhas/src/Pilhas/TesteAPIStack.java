package Pilhas;

import java.util.Stack;

public class TesteAPIStack {
	public static void main(String[] args) {
		
		Pilha<Integer> novaPilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		
		
		
	}
}
