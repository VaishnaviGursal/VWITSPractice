package com.vwits.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TeacherRegistrationServlet")
public class TeacherRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public TeacherRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			PrintWriter out = response.getWriter();
					String tfname=request.getParameter("tfirstname");
			        String tlname=request.getParameter("tlastname");
			        String tpass=request.getParameter("tpassword");
			        String tconpass=request.getParameter("tconfirmpass");
			        String temail=request.getParameter("temailid"); 
			        
			        Teacher t= new Teacher();
			        t.setTfirstname(tfname);
			        t.setTlastname(tlname);
			        t.setTpassword(tpass);
			        t.setTconfirmpass(tconpass);
			        t.setTemailid(temail);
			    
			        
			        TeacherRepo.Insert(t);
			        
			     /*   RequestDispatcher r=request.getRequestDispatcher("login.jsp");
			        r.forward(request, response);*/
			        
			        
			        RequestDispatcher r=request.getRequestDispatcher("login.jsp");
					  r.forward(request, response);
			        
			        //out.println("inserted successfully"); 
			 

		
		
		
		
		
		
	}

}
