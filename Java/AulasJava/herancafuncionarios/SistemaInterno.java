package herancafuncionarios;

public class SistemaInterno {
	private int senha = 2222;
	
	
	public void autentica (Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("pODE ENTRARA NO SISTEMA");
		} else {
			System.out.println("NAO ENTRARA NO SISTEMA");
		}
		
	}
	

}
