package servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter ("/entrada")
public class MonitoramentoFilter implements Filter {

	@Override
	public void destroy() {}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		long antes = System.currentTimeMillis();
		
		//executa
		String acao = req.getParameter("acao");
		
		 chain.doFilter(req, res);
		
		
		
		
		long depois = System.currentTimeMillis();
		System.out.println("Tempo de execução da acao : " + acao + " -- > " + (depois - antes));
	}
	

}
