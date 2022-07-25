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
		<form>
		<%--@elvariable id="asignatura" type=""--%>
		<form:form action="redirect" method="post" modelAttribute="asignatura">
			<form:select  path = "id">
				<form:option value="0">Seleccione su asignatura</form:option>
				<c:forEach var = "asignatura" items = "${listaAsignatura}">
						<form:option value = "${asignatura.id}">${asignatura.nombre}</form:option>
				</c:forEach>
			</form:select>
			<button><a href="modulo">Aqui!</a></button>
		</form:form>
	</div>
</body>
</html>