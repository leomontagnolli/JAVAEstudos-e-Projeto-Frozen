package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroVida;

public class TesteContas {

	public static void main(String[] args) {
	   ContaCorrente c1 = new ContaCorrente(111, 111);
	   c1.deposita(1000.0);
	   
	   SeguroVida sv = new SeguroVida();
	   
	   CalculadorImposto ci = new CalculadorImposto();
	   
	   ci.registra(c1);
	   ci.registra(sv);
	   
	   System.out.println(ci.getTotalImposto());
	   
	   
	   
	   
	
	   
	   
	  
	   
	   

	}

}
