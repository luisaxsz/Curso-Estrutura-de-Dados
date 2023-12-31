package ListaTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefasTeste {
	public static void main(String[] args) {
		ArrayList<ListaTarefas> listaTarefas = new ArrayList<ListaTarefas>();
		
		int opcao = 1;
		
		while (opcao != 0) {
			opcao = menu(0);
			
			switch(opcao) {
			case 0: System.out.println("Lista fechada!");break;
			case 1: adicionarTarefa(5, listaTarefas); break;
			case 2: removerTarefa(5, listaTarefas); break;
			case 3: mostrarLista(listaTarefas); break;
			case 4: limparLista(listaTarefas); break;
			default: System.out.println("Insira um valor valido!");break;
			}
			
		}
	}
	
	public static int menu(int opcao) {
		Scanner scan = new Scanner(System.in);
		System.out.println("[1] Adicionar Tarefas");
		System.out.println("[2] Remover Tarefa");
		System.out.println("[3] Mostrar Lista");
		System.out.println("[4] Limpar Lista");
		System.out.println("[0] Sair");
		opcao = scan.nextInt();	
		return opcao;
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
