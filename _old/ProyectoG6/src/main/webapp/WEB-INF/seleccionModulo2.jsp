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
		<form>
		<%--@elvariable id="modulo" type=""--%>
		<form:form action="/home/selecccion/contenido" method="post" modelAttribute="modulo">
			<form:select  path = "id">
				<form:option value="0">Seleccione su asignatura</form:option>
				<c:forEach var = "modulo" items = "${listaModulo}">
						<form:option value="${modulo.id}">${modulo.nombre}</form:option>
				</c:forEach>
			</form:select>
			<input type="submit" value="Seleccion">
		</form:form>
	</div>
</body>
</html>