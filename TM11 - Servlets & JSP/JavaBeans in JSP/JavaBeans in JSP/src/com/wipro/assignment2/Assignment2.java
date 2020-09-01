package com.wipro.assignment2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Assignment2 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		int number = Integer.parseInt(req.getParameter("number"));
		
		// pass object from servlet to jsp
		// https://www.programmergate.com/pass-data-servlet-jsp/
		// https://www.javatpoint.com/requestdispatcher-in-servlet
		req.setAttribute("number", number);
		
		if (number < 10)
			req.getRequestDispatcher("page1.jsp").forward(req, resp);
		else if (number >= 10 && number < 99)
			req.getRequestDispatcher("page2.jsp").forward(req, resp);
		else
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		
		out.close();
	}
}