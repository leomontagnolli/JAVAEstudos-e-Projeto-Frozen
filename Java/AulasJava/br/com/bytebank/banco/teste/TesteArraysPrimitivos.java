package br.com.bytebank.banco.teste;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArraysPrimitivos {

	public static void main(String[] args) {
		
		int[] idade = new int [5];
		
		idade [0] = 10;
		
		for (int i =0; i<5 ; i++) {
			idade[i] = 22;
		}
		
		for (int i =0; i<5 ; i++) {
			System.out.println(idade[i]);
		}
		

	}

}
