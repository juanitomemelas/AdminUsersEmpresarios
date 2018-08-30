<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<nav class="navbar navbar-inverse"> 
  <div class="container-fluid">
    <div class="navbar-header margenTop-10">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#"><img alt="logo del infonavit" src="./res/img/infonavit_logo.png"></a>
   
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
<c:if test="${not empty userName}">
<%	String urlContext = request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/") + 1);
	String activ01="Home.jsp".equalsIgnoreCase(urlContext)?"menuActivo":"";
	String activ02="valida.jsp".equalsIgnoreCase(urlContext)?"menuActivo":"";
	String activ03="nuevoPatron.jsp".equalsIgnoreCase(urlContext)?"menuActivo":"";
	%>
      <ul class="nav navbar-nav">
        <li class="<%=activ01%>" ><a href="/AdminUsersEmpresarios">Home</a></li>
        <li class="<%=activ02%>" ><a href="./ValidaUsuariosServlet">Validar Usuarios</a></li>
        <li class="<%=activ03%>" ><a href="./AccionesUsuario">Registrar Usuario</a></li>
      </ul>
      </c:if>
      <ul class="nav navbar-nav navbar-right">    
<c:if test="${not empty userName}"><li><a href="./LogoutServlet"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li></c:if>
<c:if test="${empty userName}"><li><a href="index.jsp"><span class="glyphicon glyphicon-log-in"></span>Login</a></li></c:if> 
      </ul>
    </div>
  </div>
</nav>
  