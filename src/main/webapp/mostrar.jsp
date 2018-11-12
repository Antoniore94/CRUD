<%@page import="modelo.POJO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% ArrayList<POJO> lista = (ArrayList<POJO>)request.getAttribute("lista"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabla</title>
<link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"/>
</head>
<body>
	<div class="container">
	<h1 class="text-center">Participantes: </h1>
	<table class="table table-hover">
		<thead  class="thead-dark">
			<tr>
				<th>id</th>
				<th>Nombre</th>
				<th>Edad</th>
			</tr>
		</thead>
		<tbody>
			<% 
				for(POJO aux : lista){
					out.println("<tr>");
					out.println("<td>");
					out.println(aux.getId());
					out.println("</td>");
					out.println("<td>");
					out.println(aux.getNombre());
					out.println("</td>");
					out.println("<td>");
					out.println(aux.getEdad());
					out.println("</td>");
					out.println("</tr>");
				}
			%>
		</tbody>
	</table>
	</div>
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>