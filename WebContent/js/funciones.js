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
		$('#tituloFormaModal').text('Cambiar contrase�a');
		creaForma(accion,elemento);
		$('#modalBotonEnviar').html("Salvar Cambios").off("click").click(
				function(){
					if($('#contrasenia').val()==$('#contraseniaUno').val()){
					$(this).html('<i class=\"fa fa-spinner fa-spin\"></i> Espere'); cambiaContrasenia($('#'+elemento).data('mail')); 
				}else{
					alert('Las contrase�as no coinciden');
					return false;					
				}
				});
		break;
	case 2:
		$('#tituloFormaModal').text('Renvio de Contrase�a');
		creaForma(accion,elemento);
		$('#modalBotonEnviar').html("Enviar").off("click").click(
				function(){
					$(this).html('<i class=\"fa fa-spinner fa-spin\"></i> Espere'); reenvioCorreo(); 
				});
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
		form.append('<label for="contrasenia">Ingrese la contrase�a a cambiar</label>');
		form.append( 
				$("<input>", 
						{ type:'password', 
					name:'contrasenia', 
					id:'contrasenia',
					class:"form-control"}
				)
		);		
		form.append('<label for="contraseniaUno">Vuelva a ingresar la contrase�a</label>');
		form.append( 
				$("<input>", 
						{ type:'password',  
					name:'contraseniaUno', 
					id:'contraseniaUno',
					class:"form-control"
					})
		);		

		break;
	case 2:
		form.append($("<div>",{class:"container"}).append($("<div>",{class:"row"}).append($("<div>",{class:"col"}).append("<p>Para enviar un correo al usuario con la contrase�a que tiene actualmente,<br>de clic en el bot�n de enviar</p>"))));
		break;
	case 3:
		
		break;
	case 4:
		
		break;
	default:
		$("#modalContenedorForma").empty();
	}
	//agregamos los campos del usuario y password en todos los procesos
	form.append($("<input>",{type:"hidden",value:$("#"+elemento).data("nrp"),name:"nrp"})),form.append($("<input>",{type:"hidden",name:"mail",value:$("#"+elemento).data("mail")}));
	$("#modalContenedorForma").empty().append(form);
}

function cambiaContrasenia(correo){
	$.post('./OperacionesUsuario',
	$("#formaAccionesUsuario").serialize(),
      function(data,status){
	  $("#modalContenedorForma").empty().append($("<div>",{class:"container"}).append($("<div>",{class:"row"}).append($("<div>",{class:"col"}).append("<p>Cambio de Contrase�a exitoso</p>"))));
	  $('#modalBotonEnviar').off().html('Cerrar').click(function(){$('#formaModal').modal('hide');});
		
 
	});
}

function reenvioCorreo(){
	$.post('./ReenvioCorreo',
	$("#formaAccionesUsuario").serialize(),
      function(data,status){
	  $("#modalContenedorForma").empty().append($("<div>",{class:"container"}).append($("<div>",{class:"row"}).append($("<div>",{class:"col"}).append("<p>Reenvio de Contrase�a exitoso</p>"))));
	  $('#modalBotonEnviar').off().html('Cerrar').click(function(){$('#formaModal').modal('hide');});
 	});
}

