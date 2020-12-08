package com.vwits.register;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(urlPatterns= {"/StudentLoginServlet"} )
public class ValidationFilter implements Filter {

    
    public ValidationFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String firstname = request.getParameter("name") ;
		String password = request.getParameter("password") ;	
		//String email = request.getParameter("email") ;
		
		if(firstname.length()<=1 && password.length()<=1)
		{
			response.getWriter().println("Validation failed..");
		}else {
		chain.doFilter(request, response);
	} 
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
