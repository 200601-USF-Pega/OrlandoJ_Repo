package com.revature.servletexample.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletThree extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2808263815333589163L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       System.out.println("Welcome to the get in ServletThree");
       
       res.setContentType("text/html");
       res.getWriter().write(""
       		+ "<html> "
       		+ "<body> "
       		+ "<p> Welcome to ServletThree </p>"
       		+ "</body>"
       		+ "</html>");
   }
}
