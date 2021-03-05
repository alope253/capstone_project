<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inventory Control</title>
</head>
<body>
<h1>Genre Control</h1>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Description</th>
    </tr>
    <c:forEach items="${genres}" var="gen">
        <tr>
            <td>${gen.name}</td>
            <td>${gen.description}</td>
            <td> <a href="/edit-genre/${gen.id}">Edit</a></td>
            <td> <a href="/delete-genre/${gen.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br>
<h4><a href="/add-genre">Add a Genre</a></h4>


</body>
</html>