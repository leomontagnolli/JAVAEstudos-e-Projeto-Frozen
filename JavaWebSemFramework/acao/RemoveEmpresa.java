package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Banco;

public class RemoveEmpresa implements Acao {
	
	public String executa (HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco ();
		banco.removeEmpresa(id);
		
		return "redirect:entrada?acao=ListaEmpresa";
		
		
	}

}
