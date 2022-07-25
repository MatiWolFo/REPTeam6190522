<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PESTAÑA REGISTRO USUARIO</title><form:form action="/home/registro/completo" method="post"
												  modelAttribute="usuario">
	<form:label path="nombre">Nombre:</form:label>
	<form:input type="text" path="nombre" />
	<br>
	<form:label path="apellido">Apellido:</form:label>
	<form:input type="text" path="apellido" />
	<br>
	<form:label path="edad">Edad:</form:label>
	<form:input type="number" path="edad" />
	<br>
	<form:label path="email">Email:</form:label>
	<form:input type="email" path="email" />
	<br>
	<form:label path="password">Contraseña:</form:label>
	<form:input type="password" path="password" />
	<br>
	<form:label path="passwordConfirm">Confirmar Contraseña:</form:label>
	<form:input type="password" path="passwordConfirm" />
	<br>
	<form:label path="username">Usuario:</form:label>
	<form:input type="text" path="username" />
	<br>
	<form:label path="rut">RUT:</form:label>
	<form:input type="text" path="rut" />
	<br>
	<form:select  path = "rol">
		<form:option value="0">Seleccione su tipo de usuario</form:option>
		<c:forEach var = "rol" items = "${listaRoles}">
			<form:option value="${rol.id}">${rol.nombre}</form:option>
		</c:forEach>
	</form:select>
	<input type="submit" value="Registrar">
</form:form>
</head>
<body>
	<div>
		<c:if test="${msgError != null}">
			<c:out value="${msgError}"></c:out>
		</c:if>
		<%--@elvariable id="usuario" type=""--%>

	</div>
</body>
</html>