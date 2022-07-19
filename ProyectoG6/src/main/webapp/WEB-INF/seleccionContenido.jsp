<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Seleccion de Contenido</title>
</head>
<body>
<h1>Selecciona tu contenido</h1>
<div>
    <form:form action="/home/seleccion/etapas" method ="post">
        <input type = "submit" value ="Contenido 1">
    </form:form>
</div>
<div>
    <form:form action="/home/seleccion/etapas" method ="post">
        <input type = "submit" value ="Contenido 2">
    </form:form>
</div>
<div>
    <form:form action="/home/seleccion/etapas" method ="post">
    <input type = "submit" value ="Contenido 3">
    </form:form>
</body>
</html>
