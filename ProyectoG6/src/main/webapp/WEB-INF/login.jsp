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
<form action="/home/registro/login" method="post" modelAttribute="usuario">
    <label>Correo:</label>
    <input type="email" name ="email" />
    <br>
    <label>Contraseña:</label>
    <input type="text" name="password" />
    <br>

    <input type="submit" value="Ingresar">
</form>

</body>
</html>
