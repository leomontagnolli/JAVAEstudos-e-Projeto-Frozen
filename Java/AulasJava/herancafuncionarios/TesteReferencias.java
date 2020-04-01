package herancafuncionarios;

public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("leonardo");
		g1.setSalario (5000);
		
		EditorVideo ev = new EditorVideo ();
		
		
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(ev);
		controle.registra(g1);
		
		
		
		System.out.println(controle.getSoma());
		
		
		
		
		

	}

}
