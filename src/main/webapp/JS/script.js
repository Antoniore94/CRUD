/**
 * 
 */
var agregar = document.getElementById("Agregar");
var buscar = document.getElementById("Buscar");
var eliminar = document.getElementById("Eliminar");
var actualizar = document.getElementById("Actualizar");
var mostrar = document.getElementById("Mostrar");
var id = document.getElementById("id");
var nombre = document.getElementById("nombre");
var edad = document.getElementById("edad");

agregar.addEventListener('change', function(){
	if(this.checked){
		id.classList.add("oculto");
		id.classList.remove("visible");
		nombre.classList.add("visible");
		nombre.classList.remove("oculto");
		edad.classList.add("visible");
		edad.classList.remove("oculto");
	}
});

buscar.addEventListener('change', function(){
	if(this.checked){
		id.classList.add("visible");
		id.classList.remove("oculto");
		nombre.classList.add("oculto");
		nombre.classList.remove("visible");
		edad.classList.add("oculto");
		edad.classList.remove("visible");
	}
});

eliminar.addEventListener('change', function(){
	if(this.checked){
		id.classList.add("visible");
		id.classList.remove("oculto");
		nombre.classList.add("oculto");
		nombre.classList.remove("visible");
		edad.classList.add("oculto");
		edad.classList.remove("visible");
	}
});

actualizar.addEventListener('change', function(){
	if(this.checked){
		id.classList.add("visible");
		id.classList.remove("oculto");
		nombre.classList.add("visible");
		nombre.classList.remove("oculto");
		edad.classList.add("visible");
		edad.classList.remove("oculto");
	}
});

mostrar.addEventListener('change', function(){
	if(this.checked){
		id.classList.add("oculto");
		id.classList.remove("visible");
		nombre.classList.add("oculto");
		nombre.classList.remove("visible");
		edad.classList.add("oculto");
		edad.classList.remove("visible");
	}
});



