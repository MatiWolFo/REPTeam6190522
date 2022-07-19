<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 22-06-2022
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">

    <title>ListaUsuarios</title>
</head>
<body>
<div class = "container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Nombre<th>
            <th scope="col">Apellido</th>
            <th scope="col">Edad</th>
            <th scope="col">Rut</th>
            <th scope="col">Email</th>
            <th scope="col">User</th>
            <th scope="col">Acciones</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var= "usuario" items = "${ListaUsuarios}">
            <tr>
                <th scope="row">${usuario.id}</th>
                <td>${usuario.nombre}</td>
                <td>${usuario.apellido}</td>
                <td>${usuario.edad}</td>
                <td>${usuario.rut}</td>
                <td>${usuario.email}</td>
                <td>${usuario.username}</td>
                <td><a class="btn btn-warning" href="/editar/${usuario.id}" role="button">Editar</a></td>
                <td><a class="btn btn-danger" href="/eliminar/${usuario.id}" role="button">Eliminar</a></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
        crossorigin="anonymous"></script>
</body>
</html>