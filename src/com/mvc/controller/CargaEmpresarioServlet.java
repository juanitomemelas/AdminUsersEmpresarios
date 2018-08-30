package com.mvc.controller;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.org.infonavit.msrf.patron.web.ws.ControlWSPortProxy;
import mx.org.infonavit.msrf.patron.web.ws.UsuarioWSProxy;

import com.google.gson.Gson;
import com.mvc.util.UtilPropiedades;
import com.mvc.util.Utilidades;

public class CargaEmpresarioServlet extends HttpServlet{

	private static final long serialVersionUID = 607152226081708103L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (Utilidades.sesionInvalida(request)){
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			response.getWriter().flush();
			response.getWriter().close();
		}
		if (validaPeticion(request)) {
			String correo = request.getParameter("mail").trim();
			String passwordNew = request.getParameter("contrasenia");
			//Inicializamos servicio
			//Nos conectamos al servicio de control de MSRF patrón
			ControlWSPortProxy con = new ControlWSPortProxy();
			Properties prop = UtilPropiedades.propiedades();
			UsuarioWSProxy conUno = new UsuarioWSProxy();
			conUno.setEndpoint(prop.getProperty("msrf.endpoint"));
					
			response.setStatus(HttpServletResponse.SC_OK);
//			response.getWriter().write(new Gson().toJson(conUno.cambiarPassword(correo, con.getAccessInfo(correo).getPass(), passwordNew)));			
			response.getWriter().flush();
			response.getWriter().close(); 
		}else {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().flush();
			response.getWriter().close();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/Home.jsp").forward(request, response);
	}
	
	/*
	 * Para validar que el correo y el NRP vengan dentro de la petición
	 */
	private boolean validaPeticion(HttpServletRequest request) {
			return  (!"".equalsIgnoreCase(request.getParameter("userMail"))
					&& !"".equalsIgnoreCase(request.getParameter("userNRP")));		
	}
}
