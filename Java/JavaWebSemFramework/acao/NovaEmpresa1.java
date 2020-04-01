package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovaEmpresa1 implements Acao{
	
	public String executa (HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		
		
		return "forward:FormEmpresa.jsp";
	
	}

}
