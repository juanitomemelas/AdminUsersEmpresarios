<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/res/jsp/header.jsp"></jsp:include>
<jsp:include page="/res/jsp/menu.jsp"></jsp:include>
<br/>
<div class="container-fluid">
<div class="panel panel-default">
  <div class="panel-heading">Seleccione una opción sobre el usuario</div>
  <div class="panel-body">  
  <div class="form-group">
    <label for="userNRP">NRP:</label>
    <input type="text" class="form-control" id="userNRP" name="userNRP" required>
  </div>
  <div class="form-group">
    <label for="userMail">Correo electrónico</label>
    <input type="email" class="form-control" id="userMail" name="userMail">
  </div>
  <div class="row text-center">
   <button name="btnBuscar" id="btnBuscar" class="btn btn-danger">Buscar</button>
  </div>
  </div> <!--form-->
</div>
<div>
	<div id="divResultados"></div>
</div>
</div>

<jsp:include flush="true" page="/res/jsp/footer.jsp">
<jsp:param name="codigoJavascript" value="$(document).ready(function(){
    $('#btnBuscar').click(function(){$(this).html('<i class=\"fa fa-spinner fa-spin\"></i> Cargando');
    	$('#divResultados').html('<div class=\"centrar\"><div class=\"loader\"></div><br>Espere...</div>');
        $.post('./OperacionesUsuario',        {
          userNRP:  $.trim($('#userNRP').val()),
          userMail:$.trim($('#userMail').val())
        },
        function(data,status){
	        $('#btnBuscar').html('Buscar');
            $('#divResultados').html(data);
        })
        .fail(function(data) {
        console.log(data);
    $('#btnBuscar').html('Buscar');
            $('#divResultados').html('<div>error</div><br>'+data.responseText);
  	});
    });
});"/>
</jsp:include>