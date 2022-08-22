<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppAnuncio</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-light">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/automovel/lista">Automovel</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/imovel/lista">Imovel</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/servico/lista">Servi�o</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/anuncio/lista">Anuncio</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/responsavel/lista">Responsavel</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container mt-3">
    <h2>AppAnuncio</h2>
    <p>Projeto de Gest�o de An�ncios</p>

    <h3>Classe: Anuncio</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Preco</th>
            <th>Descricao Completa</th>
            <th>Marca</th>
            <th>Km</th>
            <th>Modelo</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="a" items="${listagem}">
            <tr>
                <td>${a.id}</td>
                <td>${a.preco}</td>
                <td>${a.descricaoCompleta}</td>
                <td>${a.marca}</td>
                <td>${a.km}</td>
                <td>${a.modelo}</td>
                <td><a href="/anuncio/${a.id}/excluir">Excluir</a></td>
            </tr>
        </c:forEach>

        <%--        <tr>--%>
        <%--            <td>02</td>--%>
        <%--            <td>Integer</td>--%>
        <%--            <td>Kilometragem do autom�vel</td>--%>
        <%--            <td>marca</td>--%>
        <%--            <td>String</td>--%>
        <%--            <td>Marca do autom�vel</td>--%>
        <%--        </tr>--%>
        <%--        <tr>--%>
        <%--            <td>03</td>--%>
        <%--            <td>String</td>--%>
        <%--            <td>Modelo do autom�vel</td>--%>
        <%--            <td>marca</td>--%>
        <%--            <td>String</td>--%>
        <%--            <td>Marca do autom�vel</td>--%>
        <%--        </tr>--%>
        </tbody>
    </table>
</div>
</body>
</html>