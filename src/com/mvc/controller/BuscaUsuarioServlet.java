package com.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import com.mvc.bean.UsuarioEmpresarial;
import mx.org.infonavit.msrf.patron.web.ws.ContactoDTO;
import mx.org.infonavit.msrf.patron.web.ws.ResponseDTO;
import mx.org.infonavit.msrf.patron.web.ws.UsuarioWS;
import mx.org.infonavit.msrf.patron.web.ws.UsuarioWSProxy;

public class BuscaUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 5510204950657350336L;

	/**
	 * Servlet que empieza la búsqueda de usuarios dependiendo el parámetro enviado
	 */

	public BuscaUsuarioServlet() {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		HttpSession session = request.getSession(true);		
//		String usuario = (String) session.getAttribute("userName");
//		System.out.println(usuario); 
//		UsuarioEmpresarial userEMP = new UsuarioEmpresarial();
		if (validaPeticion(request)) {
			String nrp = request.getParameter("userNRP");
			String correo = request.getParameter("userMail");
			//Inicializamos servicio
			ResponseDTO respuesta = new ResponseDTO();
			UsuarioWSProxy con = new UsuarioWSProxy();
			con.setEndpoint("http://10.90.0.155:9081/msrf-patron/services/usuario");
			UsuarioWS usuariosWebService = con.getUsuarioWS();
			respuesta = usuariosWebService.validarContacto(nrp.toUpperCase(), correo);
			if ("02".equals(respuesta.getResponseCode()) || "04".equals(respuesta.getResponseCode())) {
				request.setAttribute("contactosDTO", con.getContactos(nrp.toUpperCase()));

			}
			request.setAttribute("respuestaDTO", respuesta);
			
		}	
		request.getRequestDispatcher("/jsp/piece/usuarioDAO.jsp").forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/valida.jsp").forward(request, response);
	}
	
	private boolean validaPeticion(HttpServletRequest request) {
		if (11 == request.getParameter("userNRP").length()) {
			// Para validar que vengan los campos llenos
			return true;
		}
		else {
			return false;
		}
	}

}
