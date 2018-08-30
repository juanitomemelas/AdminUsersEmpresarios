<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page
	import="mx.org.infonavit.msrf.patron.web.ws.ResponseDTO,mx.org.infonavit.msrf.patron.web.ws.ContactoDTO, mx.org.infonavit.msrf.patron.web.ws.SistemaDTO"
	errorPage="/jsp/piece/error.jsp"%>
	<%@taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<%
	ResponseDTO respuesta = (ResponseDTO) request.getAttribute("respuestaDTO");
	ContactoDTO[] contactosDTO = (ContactoDTO[]) request.getAttribute("contactosDTO");
	
%>

<div>forma de carga de empresario</div>
<div>
	el estatus del NRP es:
	<p class="bg-success"><%=respuesta.getResponseCode()%>
		/
		<%=respuesta.getResponseDescription()%></p>
	
	</div>	



