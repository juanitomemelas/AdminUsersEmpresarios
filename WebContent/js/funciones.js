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
		creaForma(accion);
		$('#modalBotonEnviar').off("click");
		$('#modalBotonEnviar').click(function(){ cambiaContrasenia($('#'+elemento).data('mail')); });
		break;
	case 2:
		$('#tituloFormaModal').text('Renvio de Contraseña');
		creaForma(accion);
		break;
	case 3:
		$('#tituloFormaModal').text('XXXXXXXXXXXXXXXXXXXXXX');
		creaForma(accion);
		break;
	case 4:
		$('#tituloFormaModal').text('Activar usuario');
		creaForma(accion);
		break;
	default:
		$('#tituloFormaModal').text('Accion sin Definir');
		creaForma(accion);
	}
	console.log($('#'+elemento).data('nrp'));
	console.log($('#'+elemento).data('mail'));
	$('#formaModal').modal('show');
	//$(this).data("id", "321") para asgnar data internamente
}

function creaForma(cual){	
	var form = $("<form/>", 
            { name:'formaAccionesUsuario',
			  id:'formaAccionesUsuario'
            }
       );
	switch (cual){
	case 1:
		form.append($("<div>",{class:"container"}).append($("<div>",{class:"row"}).append($("<div>",{class:"col"}).append("<p>ingrese el nuevo password para cambiar</p>"))));
	form.append( 
	$("<input>", 
	    { type:'text', 
	      placeholder:'Password', 
	      name:'contrasenia', 
	      style:'width:65%' }
	)
	);
	form.append( 
	$("<input>", 
	     { type:'submit', 
	       value:'Search', 
	       style:'width:30%' }
	  )
	);

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
	console.log("el valor del cambia contrasenia: "+correo);
	console.log("forma serializada "+ $("#formaAccionesUsuario").serialize());
	$.post('./OperacionesUsuario',
			$("#formaAccionesUsuario").serialize(),
      function(data,status){
	  console.log(data);
      });
	
}