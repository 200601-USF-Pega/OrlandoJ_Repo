package com.revature.servletexample.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTwo extends HttpServlet {
	 /**
	 * 
	 */
	private static final long serialVersionUID = -1009347193877788754L;

	@Override
     protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Welcome to the get in ServletTwo");
        
        res.setContentType("text/html");
        res.getWriter().write(""
        		+ "<html> "
        		+ "<body> "
        		+ "<p> welcome to ServletTwo's get method </p>"
        		+ "</body>"
        		+ "</html>");
    }
}
