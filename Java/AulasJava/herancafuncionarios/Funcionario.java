package herancafuncionarios;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; //0 - func comum // 1 - func gerente // 2 diretor
	private int senha;
	
	
	public boolean autentica (int senha ) {
		if (this.senha == senha ) {
			return true;
			
		}else {
			return false;
		}
	}
	
	
	
	public abstract double getBonificacao ();
	
	
	public int getTipo () {
		return this.tipo;
	}
	
	public void setTipo (int tipo) {
		this.tipo = tipo;
		
	}
	
	
	public String getNome() {
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public String getCpf() {
		return cpf;
		
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}
	public double getSalario() {
		return salario;
		
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
