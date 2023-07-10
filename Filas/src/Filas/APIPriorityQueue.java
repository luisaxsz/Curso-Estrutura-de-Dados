package Filas;

import java.util.PriorityQueue;
import java.util.Queue;

public class APIPriorityQueue {

	public static void main(String[] args) {
		Queue <Integer> filaPrioridade = new PriorityQueue<Integer>();
		
		filaPrioridade.add(2);
		filaPrioridade.add(4);
		filaPrioridade.add(3);
		filaPrioridade.add(1);
		
		System.out.println(filaPrioridade);
		
		

	}

}
