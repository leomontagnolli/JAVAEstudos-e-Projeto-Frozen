package herancafuncionarios;

public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente ();
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Leonardo");
		g1.setCpf("46043133857");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getCpf());
		
		
		g1.setSenha(2222);
		
		boolean autentica  = g1.autentica(2222);
		System.out.println(autentica);
		System.out.println(g1.getBonificacao());
		
		System.out.println(g1.getBonificacao());
		
		

	}

}
