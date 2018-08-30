<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><jsp:include page="/res/jsp/header.jsp"></jsp:include><jsp:include page="/res/jsp/menu.jsp"></jsp:include>
<br/><div class="container-fluid">
<div class="panel panel-default">
  <div class="panel-heading">Ingrese los datos del nuevo usuario</div>
  <div class="panel-body">  
  <div class="form-group">
    <label for="userNRP">NRP:</label>
    <input type="text" class="form-control" id="userNRP" name="userNRP" required maxlength="11">
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
        $.post('./ValidaEmpresario',        {
          userNRP:  $.trim($('#userNRP').val())
        },
        function(data,status){
	        $('#btnBuscar').html('Buscar');
            $('#divResultados').html(data);
        })
        .fail(function(httpObj,data) {
                        if(httpObj.status==500){
                            $('#btnBuscar').html('Buscar');
                            $('#divResultados').html('<div>error</div><br>'+data.responseText);
                            console.log(data);
               } else{
                    window.location.replace('./');
 			}

    });
});
});"/>
</jsp:include>