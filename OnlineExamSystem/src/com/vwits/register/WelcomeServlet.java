package com.vwits.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*
		PrintWriter out = response.getWriter();
		RequestDispatcher r=request.getRequestDispatcher("takeexam.jsp");
		r.forward(request, response);
		*/
		
		
			PrintWriter out = response.getWriter();
					MyDBConnection con= new MyDBConnection();
					Statement st=con.getStatement();
					
							//out.println("Welcome");
							String sql;
							sql=("SELECT firstname , password , marks from MARKS");
							
							try {
								ResultSet rs=st.executeQuery(sql);
								while(rs.next())
								{
									String firstname=rs.getString("firstname");
									String password=rs.getString("password");
									String marks = rs.getString("marks");
									
									/*out.println("name :" + firstname);
									out.println("password:" + password);
									out.println("marks : " + marks);
									*/
									
								
									
									out.println("|" + firstname + "|" + password + "|" + marks

									+ "|");
									
									
									
								}
								con.closeConnection();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					
							} 
			 

		
		
		
		
		
		
	}


