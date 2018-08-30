package com.mvc.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Utilidades {
	/**
	 * para validar la sesion basado en el atributo username. Si la sesi�n es invalida regresa true
	 * @param request 
	 * <br>     Parametro de donde se va a sacar la sesi�n y validar que el atributo UserName venga, si viene nulo se considera sesi�n invalida
	 * @author Jose Mahonry Lopez
	 * @return true si no hay sesion
	 */
	
	public static boolean sesionInvalida(HttpServletRequest request){
		HttpSession session = request.getSession(true);		
		return null == session.getAttribute("userName");
}
}
