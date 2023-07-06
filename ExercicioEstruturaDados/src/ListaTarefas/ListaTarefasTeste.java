package ListaTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefasTeste {
	public static void main(String[] args) {
		ArrayList<ListaTarefas> listaTarefas = new ArrayList<ListaTarefas>(5);
		adicionarTarefa(5, listaTarefas);
		
		System.out.println(listaTarefas.toString());
	}

	public static void adicionarTarefa(int quantidade, ArrayList<ListaTarefas> listaTarefas) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < quantidade; i++) {
			ListaTarefas tarefas = new ListaTarefas(null);
			System.out.println("Insira a tarefa: ");
			tarefas.setTarefas(scan.nextLine());
			listaTarefas.add(tarefas);
		}
	}
}
