<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 22-06-2022
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>PESTAÑA EDITAR USUARIO</title>
</head>
<body>
<div>
    <c:if test="${msgError != null}">
        <c:out value="${msgError}"></c:out>
    </c:if>
    <%--@elvariable id="usuario" type=""--%>
    <%--@elvariable id="user" type="com.sun.org.apache.xml.internal.security.signature.SignatureProperty"--%>
    <form:form action="/home/registro/actualizar/${usuario.id}" method="post"
               modelAttribute="usuario">
        <form:label path="nombre">Nombre:</form:label>
        <form:input type="text" path="nombre" />
        <br>
        <form:label path="apellido">Apellido:</form:label>
        <form:input type="text" path="apellido" />
        <br>
        <form:label path="edad">Edad:</form:label>
        <form:input type="number" path="edad" />
        <br>
        <form:label path="email">Email:</form:label>
        <form:input type="text" path="email" />
        <br>
        <form:label path="password">Contraseña:</form:label>
        <form:input type="text" path="password" />
        <br>
        <form:label path="username">Usuario:</form:label>
        <form:input type="text" path="username" />
        <br>
        <form:label path="rut">RUT:</form:label>
        <form:input type="text" path="rut" />
        <br>
        <form:select  path = "rolesUsuarios">
            <form:option value="0">Seleccione su tipo de usuario</form:option>
        </form:select>
        <input type="submit" value="Editar">
    </form:form>
</div>
</body>
</html>