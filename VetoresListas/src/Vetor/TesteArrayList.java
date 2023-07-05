package Vetor;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add(0, "B");
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		
		if(existe) {
			System.out.println("Elemento existe");
		}else {
			System.out.println("Elemento nao existe");
		}
		
		
	}

}
