<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Artist Control</title>
</head>
<body>
<h1>Artist Control</h1>
<br>
<table>
    <tr>
        <th>Artist</th>
    </tr>
    <c:forEach items="${artists}" var="artist">
        <tr>
            <td>${artist.artist_name}</td>
            <td> <a href="/edit-artist/${artist.id}">Edit</a></td>
            <td> <a href="/delete-artist/${artist.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br>
<h4><a href="/add-artist">Add an artist</a></h4>


</body>
</html>