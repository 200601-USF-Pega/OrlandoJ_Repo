package com.revature.servletexample.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletForward extends HttpServlet {

	private static final long serialVersionUID = -7010150309242741207L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("forwarding through this servlet to servlet three");
        RequestDispatcher dispatcher = getServletContext()
        	      .getRequestDispatcher("/servletthree");
        	    dispatcher.forward(req, res);
    }
	
}
