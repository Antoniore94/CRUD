<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
<link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"/>
<link rel="stylesheet" href="STYLE/style.css"/>
</head>
<body>
<div class="container">
	<h1 class="text-center">Que deseas hacer hoy?</h1>
	<form action="Controlador" method="post">
		<div class="form-group">
		<p id="id">Id: <input type="text" name="txtId" class="form-control"></p>
		<p id="nombre">Nombre: <input type="text" name="txtNombre" class="form-control"></p>
		<p id="edad">Edad: <input type="text" name="txtEdad" class="form-control"></p>
		<p class="text-center">
			<label for="Agregar">Agregar</label><input type="radio" name="opc" value="Agregar" id="Agregar">
			<label for="Buscar">Buscar</label><input type="radio" name="opc" value="Buscar" id="Buscar">
			<label for="Actualizar">Actualizar</label><input type="radio" name="opc" value="Actualizar" id="Actualizar">
			<label for="Eliminar">Eliminar</label><input type="radio" name="opc" value="Eliminar" id="Eliminar">
			<label for="Mostrar">Mostrar</label><input type="radio" name="opc" value="Mostrar" id="Mostrar">
		</p>
		<center><input type="submit" value="Ejecutar" class="btn btn-outline-success"></center>
		</div>
	</form>
</div>
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="JS/script.js"></script>
</body>
</html>