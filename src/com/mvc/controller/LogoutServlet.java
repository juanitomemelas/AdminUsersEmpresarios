//LogoutServlet.java
package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = -3028991031823145475L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		HttpSession session = request.getSession(false); //Fetch session object
		if(session!=null) { //If session is not null
			session.invalidate(); //removes all session attributes bound to the session
			request.setAttribute("errMessage", "Cerraste exitosamente tu sesi�n");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}