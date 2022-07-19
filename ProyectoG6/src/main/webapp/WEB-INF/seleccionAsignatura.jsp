<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seleccion Asignatura</title>
</head>
<body>
<h1>Selecciona tu asignatura</h1>
<div>
	<form:form action="/home/seleccion/modulo" method ="post">
		<input type = "submit" value ="HTML">
	</form:form>
</div>
<div>
	<form:form action="/home/seleccion/modulo" method ="post">
		<input type = "submit" value ="CSS">
	</form:form>
</div>
<div>
	<form:form action="/home/seleccion/modulo" method ="post">
		<input type = "submit" value ="JavaScript">
	</form:form>
</div>
</body>
</html>