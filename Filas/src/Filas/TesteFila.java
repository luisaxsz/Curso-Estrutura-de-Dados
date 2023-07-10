package Filas;

public class TesteFila {

	public static void main(String[] args) {
		Fila <Integer> fila = new Fila();
		
		fila.adiciona(10);
		System.out.println(fila);
		fila.adiciona(11);
		System.out.println(fila);
		
		FilaComPrioridade <Integer> filaPrioridade = new FilaComPrioridade <Integer> ();
		
		filaPrioridade.enfila(1);
		filaPrioridade.enfila(3);
		filaPrioridade.enfila(2);
		System.out.println(filaPrioridade);
		

	}

}
