package com.mvc.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Utilidades {
	/**
	 * para validar la sesion. Si la sesión es invalida regresa true
	 */
	public static boolean sesionInvalida(HttpServletRequest request){
		HttpSession session = request.getSession(true);		
		return null == session.getAttribute("userName");
}
}
