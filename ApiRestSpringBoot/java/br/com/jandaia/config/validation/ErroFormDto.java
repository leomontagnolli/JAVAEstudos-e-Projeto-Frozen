package br.com.jandaia.config.validation;

public class ErroFormDto {
	
	private String campo;
	private String error;
	
	public ErroFormDto(String campo, String error) {
		this.campo = campo;
		this.error = error;
	}
	
	
	
	public String getCampo() {
		return campo;
	}
	
	public String getError() {
		return error;
	}
		
	

}
