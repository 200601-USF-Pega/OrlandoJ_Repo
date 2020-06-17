package com.revature.servletexample.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRedirect extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3902179763885433371L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("In the get method of ServletRedirect");
        System.out.println(req.getParameter("servletnum"));
        String optionNum = req.getParameter("servletnum");
        if (optionNum.equals("2")) {
        	res.sendRedirect(req.getContextPath() + "/servlettwo");
        } else {        	
        	res.sendRedirect(req.getContextPath() + "/servletthree");
        }
    }
}
