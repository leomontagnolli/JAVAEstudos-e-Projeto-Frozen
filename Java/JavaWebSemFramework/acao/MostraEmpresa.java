package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Banco;
import modelo.Empresa;

public class MostraEmpresa  implements Acao {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresa(id);
		
		req.setAttribute("empresa", empresa);
		
		return "forward:FormAlteraEmpresa.jsp";

				
				//		RequestDispatcher rd = req.getRequestDispatcher("/FormAlteraEmpresa.jsp");
//		rd.forward(req, res);
//		
	}

}
