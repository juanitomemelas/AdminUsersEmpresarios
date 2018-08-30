package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.util.Utilidades;


public class ValidaUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = -4618373652115575915L;
	public ValidaUsuariosServlet() {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (Utilidades.sesionInvalida(request)){
			//Enviamos al usuario a la página de inicio para que inicie sesión
			request.getRequestDispatcher("index.jsp").forward(request, response);// forwarding the request
		}

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (Utilidades.sesionInvalida(request)){
			request.getRequestDispatcher("index.jsp").forward(request, response);// forwarding the request
		}
		request.getRequestDispatcher("/jsp/valida.jsp").forward(request, response);
	}
	
	
}
