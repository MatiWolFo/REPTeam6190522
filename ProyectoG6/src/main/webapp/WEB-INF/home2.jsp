<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<meta charset="UTF-8">
<head>
	<script>

		function FuncionSeleccion() {
			var x = document.getElementById("id").selectedIndex;
			var y = document.getElementById("id").options;
			var form = document.getElementById("seleccion");
			if (y[x].value = "Registrar") {
				form.action = "registroUsuario.jsp";
			} else if (y[x].value = "Seleccion asignatura") {
				form.action = "/home/seleccion/asignatura";
			}
			return true;
		}
	</script>
<title>Pagina principal</title>

</head>
<body>
<div>
	<form>
		<%--@elvariable id="seleccion" type=""--%>
		<form:form action="" method="post" id="seleccion" modelAttribute="seleccion">
		<form:select path="id">
			<form:option value="1">Registrar</form:option>
			<form:option value="2">Login</form:option>
			<form:option value="3">Seleccione su asignatura</form:option>
		</form:select>
		<input type="submit" value="Seleccion" name="submit" onsubmit="FuncionSeleccion">
		</form:form>

</div>


</body>
</html>