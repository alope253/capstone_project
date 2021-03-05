<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Control</title>
</head>
<body>
<h1>Order Control</h1>
<br>
<table>
    <tr>
        <th>Order ID</th>
        <th>Status</th>
    </tr>
    <c:forEach items="${orders}" var="ord">
        <tr>
            <td>${ord.id}</td>
            <td>${ord.order_status}</td>
            <td> <a href="/delete-order/${ord.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br>


</body>
</html>