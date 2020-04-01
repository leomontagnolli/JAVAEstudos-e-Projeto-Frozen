package acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Banco;
import modelo.Empresa;

public class ListaEmpresa implements Acao {
	
	public String executa (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	
		
		Banco banco = new Banco ();
		List<Empresa> lista = banco.getEmpresas();
		
		req.setAttribute("empresas", lista);
		

		
		
		
		return "forward:listaempresas.jsp";
		
		
	}

}
