<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INGRESA LA INFORMACION DE LA PAGINA</title>
<!--AGREGA EL LINK PARA INJECTAR BOOSTRAP, AGREGAR A TODO JSP -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<!-- AGREGA EL CONTAINER PARA PODER MANTENER DENTRO DE UN MARCO -->
	<div class="container">
		<!-- LLAMA A LA FUNCION DE MENSAJE DE ERROR IF -->
		<c:if test="${msgError != null}">
			<c:out value="${msgError}"></c:out>
		</c:if>
		<!-- CREA UN INPUT DE TIPO FORMULARIO -->
		<form:form action="/pagina/guardar" method="post" modelAttribute="pagina">
			<!-- AGREGANDO ETIQUETAS DESDE BOOSTRAP -->
			<form:label path="url" class="form-label">URL:</form:label>
			<form:input type="text" path="url" class="form-control" />
			<br>
			<form:label path="nombre" class="form-label">NOMBRE:</form:label>
			<form:input type="text" path="nombre" class="form-control" />
			<br>
			<form:label path="tipo" class="form-label">TIPO:</form:label>
			<!-- EFVITAR TRABAJAR CON NUMBER A MENOS QUE SEA NECESARIO -->
			<form:input type="text" path="tipo" class="form-control" />
			<br>
			<form:label path="idioma" class="form-label">IDIOMA:</form:label>
			<form:input type="text" path="idioma" class="form-control" />
			<br>
			<!-- CREA EL BOTON SUBMIT PARA EL ENVIO DE INFORMACION A LA BASE DE DATOS USANDO ESTILOS DESDE BOOSTRAP-->
			<button type="submit" class="btn btn-outline-primary">GUARDAR
				PAGINA</button>
		</form:form>
	</div>

</body>
</html>