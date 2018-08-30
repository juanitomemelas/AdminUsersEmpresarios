<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page
	import="mx.org.infonavit.msrf.patron.web.ws.ResponseDTO,mx.org.infonavit.msrf.patron.web.ws.ContactoDTO, mx.org.infonavit.msrf.patron.web.ws.SistemaDTO"
	errorPage="/jsp/piece/error.jsp"%>
	<%@taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<%
	ResponseDTO respuesta = (ResponseDTO) request.getAttribute("respuestaDTO");
	String laClase = "";
	int responseCode = Integer.parseInt(respuesta.getResponseCode());
	switch (responseCode) {
	case 1:
		laClase = "bg-danger";
		break;
	case 2:
		laClase = "bg-success";
		break;
	case 4:
		laClase = "bg-warning";
		break;
	case 5:
		laClase = "bg-warning";
		break;
	case 8:
		laClase = "bg-danger";
		break;
	default:
		laClase = "bg-info";
	}
%>
<div>
	El NRP ya se encuentra vinculado o no existe::
	<p class="<%=laClase%>"><%=respuesta.getResponseCode()%>/<%=respuesta.getResponseDescription()%></p>	
	</div>	



