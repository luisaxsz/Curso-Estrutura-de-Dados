package Filas;

import java.util.LinkedList;
import java.util.Queue;

public class APIQueue {

	public static void main(String[] args) {
		Queue <Integer> fila = new  LinkedList<Integer>();
		
		fila.add(10);
		System.out.println(fila);
		fila.add(13);
		System.out.println(fila);
		System.out.println(fila.peek());

	}

}
