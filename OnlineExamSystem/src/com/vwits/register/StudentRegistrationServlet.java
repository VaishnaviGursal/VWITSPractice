package com.vwits.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import sun.net.NetworkServer;


@WebServlet("/StudentRegistrationServlet")
public class StudentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public StudentRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		//out.println("welcome");
		
		String fname=request.getParameter("firstn");
		String lname=request.getParameter("lastn");
		String password=request.getParameter("pass");
		String conpass=request.getParameter("confirmpass");
		String email=request.getParameter("emailid");
		
		//String phone=request.getParameter("phoneno");
		
		
		Student s=new Student();
		s.setFirstn(fname);
		s.setLastn(lname);
		s.setPass(password);
		s.setConfirmpass(conpass);
		s.setEmail(email);
		
		//s.setPhoneno(Integer.parseInt(phone));
		
		StudentRepo.Insert(s);
		
		
		  
        RequestDispatcher r=request.getRequestDispatcher("login.jsp");
		  r.forward(request, response);
		  
		//out.println("inserted successfulyy..");
		
		
	}

}
