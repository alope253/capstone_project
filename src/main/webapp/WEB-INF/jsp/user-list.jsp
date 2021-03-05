<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Control</title>
</head>
<body>
<h1>User Control</h1>
<br>
<table>
    <tr>
        <th>Username</th>
        <th>First Name</th>
        <th>Last name</th>
        <th>Email</th>
        <th>Role</th>
    </tr>
    <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.username}</td>
            <td>${u.first_name}</td>
            <td>${u.last_name}</td>
            <td>${u.email}</td>
            <td>${u.role}</td>
            <td> <a href="/delete-user/${u.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br>
<h4><a href="/add-user">Add a User</a></h4>


</body>
</html>