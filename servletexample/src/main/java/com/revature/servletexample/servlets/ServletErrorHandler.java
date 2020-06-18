package com.revature.servletexample.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletErrorHandler extends HttpServlet {

	private static final long serialVersionUID = -2315304916709471867L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("in error handling servlet");
        res.setContentType("text/html");
        res.getWriter().write("<html>"
        		+ "<body>"
        		+ "<p>an error occurred</p>"
        		+ "</body>"
        		+ "</html>");
    }
}
