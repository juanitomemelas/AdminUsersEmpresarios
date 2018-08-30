package com.mvc.controller;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.org.infonavit.msrf.patron.web.ws.ResponseDTO;
import mx.org.infonavit.msrf.patron.web.ws.UsuarioWS;
import mx.org.infonavit.msrf.patron.web.ws.UsuarioWSProxy;

import com.mvc.util.UtilPropiedades;
import com.mvc.util.Utilidades;

public class ValidaEmpresarioServlet extends HttpServlet{

	private static final long serialVersionUID = 607152226081708103L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (Utilidades.sesionInvalida(request)){
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			response.getWriter().flush();
			response.getWriter().close();
			return;
		}
		String laJSP ="/jsp/piece/nrpVinculado.jsp";
		if (validaPeticion(request)) {
			String nrp = request.getParameter("userNRP");
			String correo = request.getParameter("userMail");
			//Inicializamos servicio
			UsuarioWSProxy con = new UsuarioWSProxy();
			Properties prop = UtilPropiedades.propiedades();
			con.setEndpoint(prop.getProperty("msrf.endpoint"));
			UsuarioWS usuariosWebService = con.getUsuarioWS();
			ResponseDTO respuesta = usuariosWebService.validarContacto(nrp.toUpperCase(), correo);
			if("05".equals(respuesta.getResponseCode())){
				laJSP = "/jsp/piece/formaCargaEmpresario.jsp";
			}
			request.setAttribute("respuestaDTO", respuesta);			
		}	
		request.getRequestDispatcher(laJSP).forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/Home.jsp").forward(request, response);
	}
	
	/*
	 * Para validar que el correo y el NRP vengan dentro de la petición
	 */
	private boolean validaPeticion(HttpServletRequest request) {

			return  (!"".equalsIgnoreCase(request.getParameter("userNRP")));		
	}
}
