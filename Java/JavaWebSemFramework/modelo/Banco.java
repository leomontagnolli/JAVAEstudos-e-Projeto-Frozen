package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaDeUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	
	static {
		Empresa empresa = new Empresa ();
		empresa.setNome("Alura");
		empresa.setDataAbertura(new Date());
		empresa.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa ();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		empresa2.setDataAbertura(new Date());
		lista.add(empresa);
		lista.add(empresa2);
		
		Usuario user1 = new Usuario ();
		user1.setLogin("leomartins");
		user1.setSenha("123456");
		Usuario user2 = new Usuario();
		user2.setLogin("leoleo");
		user2.setSenha("654321");
		
		listaDeUsuarios.add(user1);
		listaDeUsuarios.add(user2);
	}
	
	
	public void adiciona (Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
		
	}
	public List<Empresa> getEmpresas(){
		return Banco.lista;
		
	}
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while( it.hasNext()) {
			
			Empresa emp = it.next();
			if(emp.getId() == id) 
				it.remove();
		}
		
		
	}
	public Empresa buscaEmpresa(Integer id) {
			for (Empresa empresa : lista) {
				if(empresa.getId() == id)
					return empresa;
			}
			return null;
		
	}
	public Usuario existeUsuario(String login, String senha) {
		for (Usuario u : listaDeUsuarios) {
			if(u.autentica(login, senha)) {
				return u;
			}
		}
		return null;
	}
	

}
