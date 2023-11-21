package com;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sub")
public class SubServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int c = a-b;
		
		// Approach 1 (Using RequestDispatcher)
		req.setAttribute("c", c);
		RequestDispatcher rd = req.getRequestDispatcher("double");
		rd.forward(req, res);
		
		// Approach 2 (Using SendRedirect)
//		res.sendRedirect("double?c="+c);
		
		// Approach 3 (Using HttSession)
//		HttpSession session = req.getSession();
//		session.setAttribute("c", c);
//		res.sendRedirect("double");
	
		// Approach 4 (Using Cookies)
//		Cookie cookie = new Cookie("c",c+"");
//		res.addCookie(cookie);		
//		res.sendRedirect("double");
		
//		ServletContext sc = req.getServletContext();
//		String s = sc.getInitParameter("name");
		
//		ServletConfig sc = getServletConfig();
//		String s = sc.getInitParameter("name");
//		res.getWriter().println("Hello " + s);
		
	}
}
