package com.vwits.register;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter({"/TeacherRegistrationServlet"})
public class TeacherRegiValidationFilter implements Filter {

    public TeacherRegiValidationFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String tfname=request.getParameter("tfirstname");
        String tlname=request.getParameter("tlastname");
        String tpass=request.getParameter("tpassword");
        String tconpass=request.getParameter("tconfirmpass");
        String temail=request.getParameter("temailid"); 
        
        if(tfname.length()<=1 && tpass.length()<=1 &&tlname.length()<=1 &&tconpass.length()<=1&&temail.length()<=1)
		{
			response.getWriter().println("Validation failed..");
		}else {
		chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
