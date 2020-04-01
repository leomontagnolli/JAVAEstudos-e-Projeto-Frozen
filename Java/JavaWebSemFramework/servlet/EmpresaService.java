package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import modelo.Banco;
import modelo.Empresa;


@WebServlet("/empresas")
public class EmpresaService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Empresa> empresa = new Banco().getEmpresas();
		String valor = request.getHeader("accept");
		
		if (valor.endsWith("xml")){
			XStream xstream = new XStream();
			String xml = xstream.toXML(empresa); 
			
			response.setContentType("application/xml");
			response.getWriter().print(xml);
		}else if (valor.endsWith("json")) {
		
				Gson gson = new Gson();
		String json = gson.toJson(empresa); 
		
		response.setContentType("application/json");
		response.getWriter().print(json);
		} else {
			response.setContentType("application/json");
			response.getWriter().print("{'message': 'no content' }");
		}
		
		
		
	}

}
