<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%><%@page import="mx.org.infonavit.msrf.patron.web.ws.ResponseDTO,mx.org.infonavit.msrf.patron.web.ws.ContactoDTO, mx.org.infonavit.msrf.patron.web.ws.SistemaDTO"  errorPage="/jsp/piece/error.jsp" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><% ResponseDTO respuesta= (ResponseDTO)request.getAttribute("respuestaDTO"); 	ContactoDTO[] contactosDTO = (ContactoDTO[])request.getAttribute("contactosDTO");	String laClase="";	switch( Integer.parseInt(respuesta.getResponseCode())){	case 1:		laClase="bg-danger";		break;	case 2:		laClase="bg-success";		break;	case 4:		laClase="bg-warning";		break;	case 5:		laClase="bg-warning";		break;	case 8:		laClase="bg-danger";		break;	default:		laClase="bg-info";	}%><div>el estatus del NRP es:<p class="<%=laClase%>"><%=respuesta.getResponseCode()%> / <%=respuesta.getResponseDescription()%></p><div class="table-responsive"> <table class="table table-striped table-hover"> <thead> <tr> <th>Nombre</th> <th>Correo</th> <th>Estatus</th> <th>NRP</th> <th>Perfil</th> <th>RFC</th> <th>CURP</th> <th>Teléfono</th> <th>servicios</th> <th>Aciones</th> </tr></thead> <tbody class="text-center">
      <c:forEach items ="${contactosDTO}" var="contacto" varStatus="ctr">
      <c:choose>
  		  <c:when test="${'INACTIVO' eq contacto.getEstatus()}">
        	<tr class="danger">
  	  	  </c:when>    
	   	 <c:otherwise>
	          <tr> 
	    </c:otherwise>
	</c:choose>	      
      	<td><c:out value = "${contacto.getNombre()}"/> 
			<c:out value = "${contacto.getApMaterno()}"/> 
			<c:out value = "${contacto.getApPaterno()}"/></td>
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
		<td>
		<div class="dropdown">
  		<button onclick="muestraOpciones('myDropdown<c:out value="${ctr.index}"/>')" class="dropbtn">Acciones</button>
		  <div id="myDropdown<c:out value="${ctr.index}"/>" data-nrp="<c:out value = "${contacto.getNrp()}"/>" data-mail="<c:out value = "${contacto.getCorreo()}"/>" class="dropdown-content">
		  <c:choose>
		  		  <c:when test="${'INACTIVO' eq contacto.getEstatus()}">
        	<a href="javascript:acciones(4,'myDropdown<c:out value="${ctr.index}"/>');">Activar usuario</a>
  	  		  </c:when>    
			</c:choose>    
		    <a href="javascript:acciones(1,'myDropdown<c:out value="${ctr.index}"/>');" >cambiar contraseña</a>
		    <a href="javascript:acciones(2,'myDropdown<c:out value="${ctr.index}"/>');">Reenvio de Password</a>
		    <a href="javascript:acciones(3,'myDropdown<c:out value="${ctr.index}"/>');">Firmarse con este usuario</a>
		  </div>
		</div>
	   </td>
      </tr>
      </c:forEach>
      </tbody>
      </table>
	</div>
</div>
<!-- Modal -->
<div class="modal" id="formaModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h3 class="modal-title text-center" id="tituloFormaModal">Acciones</h3>
        <button type="button" class="close" data-dismiss="modal" aria-label="cerrar">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      <div id="modalContenedorForma">
      </div>

      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
        <button type="button" id="modalBotonEnviar" class="btn btn-primary">Salvar Cambios</button>
      </div>
    </div>
  </div>
</div>
