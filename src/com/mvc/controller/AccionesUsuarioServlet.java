package com.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.bean.DoctoBean;
import com.mvc.dao.GuardaDoctoDAO;

public class AccionesUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = -2300004093727876737L;
	public AccionesUsuarioServlet() {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		String usuario = (String) request.getSession(true).getAttribute("userName");		
		DoctoBean documentoInicial = new DoctoBean();
		documentoInicial.setCreador(usuario);
		documentoInicial.setElID(request.getParameter("doctoId"));
		documentoInicial.setTitulo(request.getParameter("doctoNombre"));
		documentoInicial.setFechaInstalacion(request.getParameter("doctoFecInst"));
		documentoInicial.setDuracion(0);
		if(GuardaDoctoDAO.guardaDocto(documentoInicial)) {
			request.getRequestDispatcher("/jsp/nuevoDocto.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/jsp/error.jsp").forward(request, response);
		}
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		HttpSession session = request.getSession(true);		
//		String usuario = (String) session.getAttribute("userName");
		request.getRequestDispatcher("/jsp/nuevoDocto.jsp").forward(request, response);
	}
}
