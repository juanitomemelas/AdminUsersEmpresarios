/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function muestraOpciones(elemento) {
    $("#"+elemento).toggleClass("show");
}
// Close the dropdown menu if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {

    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
};

function acciones(accion,elemento){

	switch (accion){
	case 1:
		$('#tituloFormaModal').text('Cambiar contraseña');
		creaForma(accion,elemento);
//		$('#btnBuscar').click(function(){$(this).html('<i class=\"fa fa-spinner fa-spin\"></i> Cargando');
		$('#modalBotonEnviar').html("Salvar Cambios").off("click").click(
				function(){
					if($('#contrasenia').val()==$('#contraseniaUno').val()){
					$(this).html('<i class=\"fa fa-spinner fa-spin\"></i> Espere'); cambiaContrasenia($('#'+elemento).data('mail')); 
				}else{
					
				}
				});
		break;
	case 2:
		$('#tituloFormaModal').text('Renvio de Contraseña');
		creaForma(accion,elemento);
		break;
	case 3:
		$('#tituloFormaModal').text('XXXXXXXXXXXXXXXXXXXXXX');
		creaForma(accion,elemento);
		break;
	case 4:
		$('#tituloFormaModal').text('Activar usuario');
		creaForma(accion,elemento);
		break;
	default:
		$('#tituloFormaModal').text('Accion sin Definir');
		creaForma(accion,elemento);
	}
	console.log($('#'+elemento).data('nrp'));
	console.log($('#'+elemento).data('mail'));
	$('#formaModal').modal('show');
	//$(this).data("id", "321") para asgnar data internamente
}

function creaForma(cual, elemento){	
	var form = $("<form/>", 
            { name:'formaAccionesUsuario',
			  id:'formaAccionesUsuario'
            }
       );
	switch (cual){
	case 1:
	//	form.append($("<div>",{class:"container"}).append($("<div>",{class:"row"}).append($("<div>",{class:"col"}).append("<p>Cambio de Password</p>"))));
		form.append($("<div>",{class:"form-group"}));
		form.append('<label for="contrasenia">Ingrese la contraseña a cambiar</label>');
		form.append( 
				$("<input>", 
						{ type:'password', 
					name:'contrasenia', 
					id:'contrasenia',
					class:"form-control"}
				)
		);
		
		form.append('<label for="contraseniaUno">Vuelva a ingresar la contraseña</label>');
		form.append( 
				$("<input>", 
						{ type:'password',  
					name:'contraseniaUno', 
					id:'contraseniaUno',
					class:"form-control"}
				)
		);
		
		form.append($("<input>",{type:"hidden",value:$("#"+elemento).data("nrp"),name:"nrp"})),form.append($("<input>",{type:"hidden",name:"mail",value:$("#"+elemento).data("mail")}));
		break;
	case 2:
		
		break;
	case 3:
		
		break;
	case 4:
		
		break;
	default:
		$("#modalContenedorForma").empty();
	}
	$("#modalContenedorForma").empty().append(form);
}

function cambiaContrasenia(correo){
	$.post('./OperacionesUsuario',
	$("#formaAccionesUsuario").serialize(),
      function(data,status){
	  console.log(data);
	  $("#modalContenedorForma").empty().append($("<div>",{class:"container"}).append($("<div>",{class:"row"}).append($("<div>",{class:"col"}).append("<p>Cambio de Contraseña exitoso</p>"))));
	  $('#modalBotonEnviar').off().html('Cerrar').click(function(){$('#formaModal').modal('hide');});
		
 
	});
	
}