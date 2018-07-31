<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="mx.org.infonavit.msrf.patron.web.ws.ResponseDTO,mx.org.infonavit.msrf.patron.web.ws.ContactoDTO, mx.org.infonavit.msrf.patron.web.ws.SistemaDTO"
	    errorPage="/jsp/piece/error.jsp" 
%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 	ResponseDTO respuesta= (ResponseDTO)request.getAttribute("respuestaDTO"); 
	ContactoDTO[] contactosDTO = (ContactoDTO[])request.getAttribute("contactosDTO");	
	String laClase="";
	switch(Integer.parseInt(respuesta.getResponseCode())){
	case 1:
		laClase="bg-danger";
		break;
	case 2:
		laClase="bg-success";
		break;
	case 4:
		laClase="bg-warning";
		break;
	case 5:
		laClase="bg-warning";
		break;
	case 8:
		laClase="bg-danger";
		break;
	default:
		laClase="bg-info";	
	}
// 	contactosDTO[0].getServicios()[0].getDescSistema()
	%>
<div>
el estatus del NRP con correo es:<p class="<%=laClase%>"><%=respuesta.getResponseDescription()%></p>
	 <div class="table-responsive">
	 	<table class="table table-striped table-hover">    
		 <thead>
		 	<tr>
		 	<th>Nombre</th>
		 	<th>Apellido Paterno</th>
		 	<th>Apellido Materno</th>
		 	<th>Correo</th>
		 	<th>Estatus</th>
		 	<th>NRP</th>
		 	<th>Perfil</th>
		 	<th>RFC</th>
		 	<th>CURP</th>
		 	<th>Teléfono</th>
	 		<th>servicios</th>
	 		<th>Aciones</th>
		 	</tr>  
		 </thead>
      <tbody class="text-center">
      <c:forEach items ="${contactosDTO}" var="contacto" >
      <c:choose>
  		  <c:when test="${'INACTIVO' eq contacto.getEstatus()}">
        	<tr class="danger">
  	  	  </c:when>    
	   	 <c:otherwise>
	          <tr > 
	    </c:otherwise>
	</c:choose>	      
      	<td><c:out value = "${contacto.getNombre()}"/>
<input type="hidden" id="hid_nrp" value="<c:out value = "${contacto.getNrp()}"/>">
<input type="hidden" id="hid_correo" value="<c:out value = "${contacto.getCorreo()}"/>">
</td>
		<td><c:out value = "${contacto.getApMaterno()}"/></td>
		<td><c:out value = "${contacto.getApPaterno()}"/></td>
		<td><c:out value = "${contacto.getCorreo()}"/></td>		
		<td><c:out value = "${contacto.getEstatus()}"/></td>		
		<td><c:out value = "${contacto.getNrp()}"/></td>
		<td><c:out value = "${contacto.getPerfil().getDescPerfil()}"/></td>
		<td><c:out value = "${contacto.getRfc()}"/></td>
		<td><c:out value = "${contacto.getCurp()}"/></td>
		<td><c:out value = "${contacto.getTelefono()}"/></td>
		<td> 
		<c:forEach items ="${contacto.getServicios()}" var="servicios" >
				<p class="text-capitalize"><c:out value = "${servicios.getDescSistema()}"/></p>
			</c:forEach>
		</td>
		<td>botones</td>
      </tr>
      </c:forEach>
      </tbody>
      </table>
	</div>

    <div class="form-group">
    <label for="operacion">Seleccione la operación a realizar</label>
    <select class="custom-select form-control" name="operacion" id="operacion" required>
      <option value="">Seleccione una opción</option>
      <option value="1">Reinicio de contraseña</option>
      <option value="2">Two</option>
      <option value="3">Three</option>
    </select>
  </div>
  
<div class="container">
  <h2>Seleccione una operación a realizar</h2>
  <button type="button" class="btn btn-warning" onClick="RecuperaPassword()">Recuperar Password</button>
  <button class="btn warning">Recuperar Password</button>
  <input type="button" class="btn btn-primary" value="Input Button">
  <input type="submit" class="btn btn-primary" value="Submit Button">
</div>

  
</div>
