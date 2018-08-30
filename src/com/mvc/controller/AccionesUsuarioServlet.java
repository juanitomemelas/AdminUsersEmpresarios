package com.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.util.Utilidades;
 
public class AccionesUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = -2300004093727876737L;
	public AccionesUsuarioServlet() {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/Home.jsp").forward(request, response);		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (Utilidades.sesionInvalida(request)){
			request.getRequestDispatcher("index.jsp").forward(request, response);// forwarding the request
		}else{
		request.getRequestDispatcher("/jsp/nuevoPatron.jsp").forward(request, response);
		}
	}
}
