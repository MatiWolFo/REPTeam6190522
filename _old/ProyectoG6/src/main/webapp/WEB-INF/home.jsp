<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<meta charset="UTF-8">
<head>

	<title>Pagina principal</title>

</head>
<body>

<div>
	<form:form action="/home/registro" method ="post">
		<input type = "submit" value ="Registrar Usuario">
	</form:form>
</div>
<div>
	<form:form action="/home/login" method ="post">
		<input type = "submit" value ="Login">
	</form:form>
</div>
<div>
	<form:form action="/home/seleccion/asignatura" method ="post">
		<input type = "submit" value ="Selecciona tu asignatura">
	</form:form>
</div>

</body>
</html>