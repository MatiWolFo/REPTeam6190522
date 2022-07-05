<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PAGINA INICIO PRUEBA BABYDnD</title>
</head>
<body>
	<h1>
		PAGINA INDEX USADA COMO BLANCO BASE DE PROYECTO
	</h1>
	<h1>
		<c:out
			value="${usuario.getNombre()} ${usuario.getApellido()}, edad ${usuario.getEdad()}, email ${usuario.getEmail()}, username ${usuario.getUsername()}, password ${usuario.getPassword()}, rut ${usuario.getRut()}-${usuario.getRutdv()}">
		</c:out>
	</h1>
</body>
</html>