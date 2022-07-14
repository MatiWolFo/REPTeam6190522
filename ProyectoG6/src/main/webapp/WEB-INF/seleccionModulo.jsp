<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seleccion de Modulo</title>
</head>
<body>
<h1>Selecciona tu modulo</h1>
<div>
	<form:form action="/home/seleccion/contenido" method ="post">
		<input type = "submit" value ="Modulo 1">
	</form:form>
</div>
<div>
	<form:form action="/home/seleccion/contenido" method ="post">
		<input type = "submit" value ="Modulo 2">
	</form:form>
</div>
<div>
	<form:form action="/home/seleccion/contenido" method ="post">
		<input type = "submit" value ="Modulo 3">
	</form:form>
</div>
</body>
</html>