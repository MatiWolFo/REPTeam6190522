<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PESTAÑA REGISTRO USUARIO</title>
</head>
<body>
	<div>
		<c:if test="${msgError != null}">
			<c:out value="${msgError}"></c:out>
		</c:if>
		<!-- 'modelAttribute="algo" atrapa el objeto enviado desde el Controller.java -->
		<form:form action="/registro/usuario" method="post"
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
			<form:input type="text" path="email" />
			<br>
			<form:label path="password">Password:</form:label>
			<form:input type="text" path="password" />
			<br>
			<form:label path="username">Username:</form:label>
			<form:input type="text" path="username" />
			<br>
			<form:label path="rut">RUT(sin DV):</form:label>
			<form:input type="text" path="rut" />
			<br>
			<form:label path="rutdv">DV:</form:label>
			<form:input type="text" path="rutdv" />
			<input type="submit" value="Registro">
		</form:form>
	</div>
</body>
</html>