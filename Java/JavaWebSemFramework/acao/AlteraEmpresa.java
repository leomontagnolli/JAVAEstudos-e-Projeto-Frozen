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

public class AlteraEmpresa  implements Acao {
	
	public String executa (HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		System.out.println("alterando dados da empresa");
		String nomeDaEmpresa = req.getParameter("nome");
		String data = req.getParameter("data");
		String paramId = req.getParameter("id");
		
		Integer id = Integer.valueOf(paramId);
		
		
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
			dataAbertura = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco ();
		Empresa empresa = banco.buscaEmpresa(id);
		empresa.setNome(nomeDaEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		return "redirect:entrada?acao=ListaEmpresa";
		
		//res.sendRedirect("entrada?acao=lista");
	}

}
