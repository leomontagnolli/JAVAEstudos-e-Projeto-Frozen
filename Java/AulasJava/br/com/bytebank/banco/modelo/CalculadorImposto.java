package br.com.bytebank.banco.modelo;

public class CalculadorImposto {
	
	private double TotalImposto;




	
	public void registra (Tributavel t) {
		double valor = t.getValorImposto();
		this.TotalImposto += valor;
		
	}
	
	public double getTotalImposto() {
		return this.TotalImposto;
	}
	
	
	

	
}
