<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Seleccion de Etapa</title>
</head>
<body>
<h1>Selecciona tu etapa</h1>
<div>
    <form>
        <%--@elvariable id="etapa" type=""--%>
        <form action="" method="post">
        <select  name = "id">
        <option value="0">Seleccione su etapa</option>
        <c:forEach var = "etapa" items = "${listaEtapas}">
            <option value="${etapa.id}">${etapa.nombre}</option>
        </c:forEach>
        </select>
        <input type="submit" value="Seleccion">
        </form>

        <!--Se captura objeto con form:select-->
        <!--Combo box dependientes-->
</div>
</body>
</html>
