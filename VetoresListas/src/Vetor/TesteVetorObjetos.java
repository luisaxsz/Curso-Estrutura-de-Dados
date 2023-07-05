package Vetor;

public class TesteVetorObjetos {
	public static void main(String[] args) {
		VetorObject vetor = new VetorObject(4);
		
		Contato c1 = new Contato("AAAA" , "9999-999","FULANO1@GMAIL.COM");
		Contato c2 = new Contato("BBBB" , "9999-999","FULANO2@GMAIL.COM");
		Contato c3 = new Contato("BBBB" , "9999-999","FULANO2@GMAIL.COM");
		
		//Adicionar contatos ao vetor
		try {
			vetor.adicionar(c1);
			vetor.adicionar(c2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//verificar elemento
		int pos = vetor.busca(c3);
		
		if(pos > -1) {
			System.out.println("Elemento existe no vetor");
		}else {
			System.out.println("Elemento nao existe no vetor");
		}
		
		System.out.println(vetor);
	}
}
