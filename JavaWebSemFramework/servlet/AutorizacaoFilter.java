package servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AutorizacaoFilter
 */
//@WebFilter("/entrada")
public class AutorizacaoFilter implements Filter {
	
	@Override
	public void destroy() {}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

   
	public void doFilter(ServletRequest servRequest, ServletResponse servResponse, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servRequest;
		HttpServletResponse response = (HttpServletResponse) servResponse;
		
		String paramAcao = request.getParameter("acao");
		
		HttpSession sessao = request.getSession();
		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
		boolean acaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
		
		if(acaoProtegida && usuarioNaoEstaLogado) {
			response.sendRedirect("entrada?acao=LoginForm");
			return;
		
		}
			chain.doFilter(request, response);
		
	

	
	
	
}
	
}
