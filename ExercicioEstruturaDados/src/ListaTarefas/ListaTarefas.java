package ListaTarefas;

public class ListaTarefas {
	private String tarefas;
	
	
	@Override
	public String toString() {
		return tarefas;
	}

	public ListaTarefas(String tarefas) {
		super();
		this.tarefas = tarefas;
	}

	public String getTarefas() {
		return tarefas;
	}

	public void setTarefas(String tarefas) {
		this.tarefas = tarefas;
	}

	
}
