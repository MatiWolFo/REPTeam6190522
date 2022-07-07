<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 05-07-2022
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Login de Usuarios</title>
</head>
<body>
<h1>Ingresa tus datos</h1>


<%--@elvariable id="usuario" type=""--%>
<form:form action="/home" method="post" modelAttribute="usuario">
    <form:label path="email">Correo:</form:label>
    <form:input type="email" path="email" />
    <br>
    <form:label path="password">Contraseña:</form:label>
    <form:input type="text" path="password" />
    <br>

    <input type="submit" value="Ingresar">
</form:form>

</body>
</html>
