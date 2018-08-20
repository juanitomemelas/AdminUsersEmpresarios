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

import mx.org.infonavit.msrf.patron.web.ws.AccesoDTO;
import mx.org.infonavit.msrf.patron.web.ws.ControlWSPortProxy;
import mx.org.infonavit.msrf.patron.web.ws.ResponseDTO;
import mx.org.infonavit.msrf.patron.web.ws.UsuarioWSProxy;

public class OperacionesUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = -4088643454962540966L;

	public OperacionesUsuarioServlet() {		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (Utilidades.sesionInvalida(request)){
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			response.getWriter().flush();
			response.getWriter().close();
		}

		if (validaPeticion(request)) {
//			String nrp = request.getParameter("nrp").trim();
			String correo = request.getParameter("mail").trim();
			String passwordNew = request.getParameter("contrasenia");
			//Inicializamos servicio
			//Nos conectamos al servicio de control de MSRF patrón
			ControlWSPortProxy con = new ControlWSPortProxy();
			Properties prop = UtilPropiedades.propiedades();
			AccesoDTO usuariosWebService = con.getAccessInfo(correo);
			String passwordOld = usuariosWebService.getPass();		
			UsuarioWSProxy conUno = new UsuarioWSProxy();
			conUno.setEndpoint(prop.getProperty("msrf.endpoint"));
			ResponseDTO cambiocontrasenia = conUno.cambiarPassword(correo, passwordOld, passwordNew);
					
			response.setStatus(HttpServletResponse.SC_OK);
//			response.getWriter().write(new Gson().toJson(usuariosWebService));
			response.getWriter().write(new Gson().toJson(cambiocontrasenia));			
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
