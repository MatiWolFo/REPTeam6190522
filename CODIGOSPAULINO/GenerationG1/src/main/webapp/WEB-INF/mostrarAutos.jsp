<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Auto</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">

</head>
<body>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Marca</th>
            <th scope="col">Nombre</th>
            <th scope="col">Velocidad</th>
            <th scope="col">Acciones</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="auto" items="${listaAutos}">
            <tr>
                <th scope="row">${auto.id}</th>
                <td>${auto.marca}</td>
                <td>${auto.nombre}</td>
                <td>${auto.velocidad}</td>
                <td><a class="btn btn-warning" href="/auto/editar/${auto.id}" role="button">Editar</a><a class="btn btn-danger" href="eliminar/${auto.id}" role="button">Eliminar</a></td>

            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
></script>

</body>
</html>
