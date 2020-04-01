package acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Banco;
import modelo.Empresa;

public class NovaEmpresa  implements Acao {
	
	public String executa (HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		String nomeDaEmpresa = req.getParameter("nome");
		String data = req.getParameter("data");
		
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
			dataAbertura = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		
		Empresa empresa = new Empresa ();
		empresa.setNome(nomeDaEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		return "redirect:entrada?acao=ListaEmpresa";
	
	}

}
