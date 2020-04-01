package herancafuncionarios;

public class TesteSistem {

	public static void main(String[] args) {
		Gerente g = new Gerente ();
		g.setSenha(2222);
		
		Administrador adm = new Administrador ();
		
		adm.setSenha(2222);
		Cliente c1 = new Cliente();
		c1.setSenha(2222);
		
		
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(c1);

	}

}
