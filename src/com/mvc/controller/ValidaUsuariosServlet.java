package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ValidaUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = -4618373652115575915L;
	public ValidaUsuariosServlet() {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);		
		String usuario = (String) session.getAttribute("userName");
		System.out.println("doPost de listaDoctosServlet "+usuario);

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/jsp/valida.jsp").forward(request, response);
	}
	
	
}
