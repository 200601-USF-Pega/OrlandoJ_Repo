package com.revature.servletexample.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = -465940822375880622L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("In the get method of ServletOne");
        
        res.setContentType("text/html");
        res.getWriter().write(""
        		+ "<html> "
        		+ "<body> "
        		+ "<p> welcome to the get method </p>"
        		+ "</body>"
        		+ "</html>");
        
        throw new ServletException("from servlet one");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }
}
