package com;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/double")
public class DoubleServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		// Approach 1 (Using REquestDispatcher)
		int result = (int)req.getAttribute("c");
		
		// Approach 2 (Using SendRedirect)
//		int result =Integer.parseInt(req.getParameter("c"));
		
		// Approach 3 (Using HttSession)
//		HttpSession session = req.getSession();
//		int result = (int)session.getAttribute("c");
		
		// Approach 4 (Using Cookies)
//		int result = 0;
//		Cookie[] cookies = req.getCookies();
//		for(Cookie cookie:cookies) {
//			if(cookie.getName().equals("c")) { 
//				result = Integer.parseInt(cookie.getValue());
//			}
//		}
		
		res.getWriter().println(result*2);
	}
}
