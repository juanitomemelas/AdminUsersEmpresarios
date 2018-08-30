package com.mvc.controller;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.mvc.util.UtilPropiedades;
import com.mvc.util.Utilidades;

import mx.org.infonavit.msrf.patron.web.ws.UsuarioWSProxy;

public class ReenvioCorreoServlet extends HttpServlet {
	private static final long serialVersionUID = -4768379609279861474L;
/**
 * Clase que re envía el correo al usuario solicitado
 * Utiliza el servicio web de recuperarPassword dentro del MSRF Patrón
 * 
 * Los parámetros se envían desde post usando AJAX y requiere el correo asociado al NRP
 * 
 * @author Jose Mahonry Lopez
 */
	public ReenvioCorreoServlet() {		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (Utilidades.sesionInvalida(request)){
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			response.getWriter().flush();
			response.getWriter().close();
			return;
		}

		if (validaPeticion(request)) {
			String correo = request.getParameter("mail").trim();
			//Inicializamos servicio
			//Nos conectamos al servicio de control de MSRF patrón
			Properties prop = UtilPropiedades.propiedades();
			UsuarioWSProxy conUno = new UsuarioWSProxy();
			conUno.setEndpoint(prop.getProperty("msrf.endpoint"));
			response.setStatus(HttpServletResponse.SC_OK);
			response.getWriter().write(new Gson().toJson(conUno.recuperarPassword(correo)));
		}else {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		response.getWriter().flush();
		response.getWriter().close(); 
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
