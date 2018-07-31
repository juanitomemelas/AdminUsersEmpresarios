package com.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.org.infonavit.msrf.patron.web.ws.ContactoDTO;
import mx.org.infonavit.msrf.patron.web.ws.ResponseDTO;
import mx.org.infonavit.msrf.patron.web.ws.UsuarioWS;
import mx.org.infonavit.msrf.patron.web.ws.UsuarioWSProxy;

public class OperacionesUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = -4088643454962540966L;

	public OperacionesUsuarioServlet() {		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		HttpSession session = request.getSession(true);		
//		String usuario = (String) session.getAttribute("userName");
//		System.out.println(usuario);
//		UsuarioEmpresarial userEMP = new UsuarioEmpresarial();
		if (validaPeticion(request)) {
			String nrp = request.getParameter("userNRP").trim();
			String correo = request.getParameter("userMail").trim();
			//Inicializamos servicio
			ResponseDTO respuesta = new ResponseDTO();
			UsuarioWSProxy con = new UsuarioWSProxy();
			con.setEndpoint("http://10.90.1.152/msrf-patron/services/usuario");
			UsuarioWS usuariosWebService = con.getUsuarioWS();
			respuesta = usuariosWebService.validarContacto(nrp.toUpperCase(), correo);
			if ("02".equals(respuesta.getResponseCode())) {
				ContactoDTO[] contactosDTO = new ContactoDTO[1];
			for (ContactoDTO contacto:con.getContactos(nrp.toUpperCase())) {	
				if (correo.equalsIgnoreCase(contacto.getCorreo().trim())) {					
					contactosDTO[0] = contacto;
					}
				}
			request.setAttribute("contactosDTO", contactosDTO);	
			}
			request.setAttribute("respuestaDTO", respuesta);
			request.getRequestDispatcher("/jsp/piece/operacionesUsuarioDAO.jsp").forward(request, response);
			
		}else {
			//Por si no envían el correo o el NRP, se van de puntitas
			request.getRequestDispatcher("/jsp/piece/sinDatos.jsp").forward(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/valida.jsp").forward(request, response);
	}
	
	/*
	 * Para validar que el correo y el NRP vengan dentro de la petición
	 */
	private boolean validaPeticion(HttpServletRequest request) {
			return  (!"".equalsIgnoreCase(request.getParameter("userMail")) 
					&& 11 == request.getParameter("userNRP").length());		
	}
}
