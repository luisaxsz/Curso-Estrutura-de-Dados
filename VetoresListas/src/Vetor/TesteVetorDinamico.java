package Vetor;

public class TesteVetorDinamico {
	public static void main(String[] args) {
		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato("AAAA" , "9999-999","FULANO1@GMAIL.COM");
		Contato c2 = new Contato("BBBB" , "9999-999","FULANO2@GMAIL.COM");
		Contato c3 = new Contato("BBBB" , "9999-999","FULANO2@GMAIL.COM");
		
		vetor.adiciona(c2);
		vetor.adiciona(c1);
		System.out.println(vetor);
		
	}
}
