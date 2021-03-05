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
<h1>Inventory Control</h1>
<br>
<table>
    <tr>
        <th>Title</th>
        <th>Price</th>
        <th>Release Date</th>
        <th>Description</th>
        <th>Type</th>
    </tr>
    <c:forEach items="${products}" var="prod">
        <tr>
            <td>${prod.title}</td>
            <td>${prod.price}</td>
            <td><fmt:formatDate type = "date" value = "${prod.release_date}" /></td>
            <td>${prod.description}</td>
            <td>${prod.product_type}</td>
            <td> <a href="/edit-product/${prod.id}">Edit</a></td>
            <td> <a href="/delete-product/${prod.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br>
<h4><a href="/add-product">Add a Product</a></h4>


</body>
</html>