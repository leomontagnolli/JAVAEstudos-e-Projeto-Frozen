package br.com.bytebank.banco.teste;



import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
	ContaCorrente[] contas = new ContaCorrente [5];
	
	ContaCorrente CC = new ContaCorrente(1111, 1554);
	
	contas [0] = CC;
	
	ContaCorrente C2 = new ContaCorrente(1111, 1554);
	
	contas[1] = C2;
	
	

	}

}
