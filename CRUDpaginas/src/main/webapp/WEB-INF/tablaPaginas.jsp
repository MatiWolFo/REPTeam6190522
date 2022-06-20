<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TABLA DE PAGINAS INGRESADAS</title>
<!--AGREGA EL LINK PARA INJECTAR BOOSTRAP, USANDO ESTE METODO, MOSTRARAUTO.JSP ES REEMPLAZADO -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<!--PARA CONTENER INFORMACION DENTRO DE LA TABLA -->
	<div class="container">
		<!--LOS ENCABEZADOS DE LA TABLA, CON SUS COLUMNAS -->
		<table class="table table-dark">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">URL</th>
					<th scope="col">NOMBRE</th>
					<th scope="col">TIPO</th>
					<th scope="col">IDIOMA</th>
				</tr>
			</thead>
			<!--AGREGA EL METODO PARA IMPIRMIR LA INFORMACION EN SU COLUMNA -->
			<tbody>
				<c:forEach var="pagina" items="${listaPaginas}">
					<!--IMPRIMIR LOS FATOS LLAMADOS DESDE LA ITERACION -->
					<tr>
						<th scope="row">${pagina.id}</th>
						<td>${pagina.url}</td>
						<td>${pagina.nombre}</td>
						<td>${pagina.tipo}</td>
						<td>${pagina.idioma}</td>
						<!-- AGREGA BOTONES DESDE BOOSTRAP PARA FUNCIONALIDAD -->
						<!-- AGREGA DINAMISMO AL PATH USANDO PLACEHOLDER ${auto.id} -->
						<td><a class="btn btn-warning" href="/pagina/editar/${pagina.id}" role="button">EDITAR</a></td>
						<td><a class="btn btn-danger" href="/pagina/eliminar/${pagina.id}" role="button">ELIMINAR</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!-- AGREGAR EL SCRIPT PARA QUE FUNCIONE -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous">	
	</script>
</body>
</html>