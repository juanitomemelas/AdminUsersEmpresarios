<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="res/jsp/header.jsp"></jsp:include>
<jsp:include page="res/jsp/menu.jsp"></jsp:include>
<div class="container-fluid text-center">
	<div class="row content">
		<c:if test="${not empty userName}"><jsp:forward page="/jsp/Home.jsp"/></c:if>
<%-- 		<c:if test="${empty userName}"> --%>
  <%--     	<jsp:forward page="mx.org.infonavit.portal.patrones.login.Login/servlets/login.jsp"/> --%>
	<div class="col-sm-12 text-center">
			<div style="text-align: center">
				<h1>Administración de usuarios</h1>
			</div>
			<br>
			<form name="form" action="LoginServlet" method="post" class="form-horizontal" onsubmit="return validate()">
				<div class="form-group">
				<div class="col-sm-2"></div>
					<label class="control-label col-sm-2"  for="username" >Username</label>
					<div class="col-sm-6">
						<input type="text" name="username" id="username" class="form-control" required/>
					</div>
					<div class="col-sm-2"></div>
				</div>
				<div class="form-group">
									<div class="col-sm-2"></div>
					<label class="control-label col-sm-2" for="password">Password</label>
					<div class="col-sm-6">
					<input type="password" name="password" id="password" class="form-control" required/>
					</div>
					<div class="col-sm-2"></div>
				</div>
				<div class="col-sm-2"></div>
				<div class="col-sm-8">
				<span style="color: red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span>
				</div>
				<div class="col-sm-2"></div>
				<br>
				<div class="col-sm-2"></div>						
				<div class="col-sm-8">
				<input class="btn btn-default" type="submit" value="Login"></input>
				<input class="btn btn-default" type="reset" value="Reset"></input>			
				</div>
				<div class="col-sm-2"></div>
			</form>
		</div>
<%-- </c:if> --%>
		
	</div>
</div>
<jsp:include page="res/jsp/footer.jsp"></jsp:include>