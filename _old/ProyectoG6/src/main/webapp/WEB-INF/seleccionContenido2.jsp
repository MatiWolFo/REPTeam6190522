<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Seleccion de Contenido</title>
</head>
<body>

<h1>Selecciona tu contenido</h1>

<div>
        <%--@elvariable id="contenido" type=""--%>
        <form action="/home/seleccion/etapas" method="post">
        <select  name = "id">
           <option value="0">Selecciona tu contenido</option>
            <c:forEach var = "contenido" items = "${listaContenido}">
            <option value = "${contenido.id}">${contenido.nombre}</option>
            </c:forEach>
        </select>
        <input type="submit" value="Seleccion">
        </form>
</div>
</body>
</html>
