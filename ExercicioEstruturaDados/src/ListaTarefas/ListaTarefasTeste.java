package ListaTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefasTeste {
	public static void main(String[] args) {
		ArrayList<ListaTarefas> listaTarefas = new ArrayList<ListaTarefas>(5);
		adicionarTarefa(5, listaTarefas);
		mostrarLista(listaTarefas);
		removerTarefa(0,listaTarefas);
		mostrarLista(listaTarefas);
		limparLista(listaTarefas);
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
	
	public static void removerTarefa(int posicao, ArrayList<ListaTarefas> listaTarefas){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite numero da tarefa que quer remover: ");
		posicao = scan.nextInt();
		if(posicao == 1) {
			listaTarefas.remove(0);
		}else {
			listaTarefas.remove(posicao-1);
		}
	}
	
	public static void mostrarLista(ArrayList<ListaTarefas> listaTarefas) {
		int tamanho = 1;
		for (ListaTarefas tarefas : listaTarefas) {
			System.out.print(tamanho + " - ");
			System.out.println(tarefas);
			tamanho++;
		}
	}
	
	public static void limparLista(ArrayList<ListaTarefas> listaTarefas) {
		listaTarefas.clear();
	}
}
