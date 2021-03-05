<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cart</title>


</head>
<body>
	<h1>Cart</h1>
	<br>
	<table>
    <tr>
        <th>Title</th>
        <th>Price</th>
        <th>Release Date</th>
        <th>Description</th>
        <th>Type</th>
    </tr>
    <c:forEach items="${yourCart}" var="item">
        <tr>
            <td>${item.title}</td>
            <td>${item.price}</td>
            <td><fmt:formatDate type = "date" value = "${item.release_date}" /></td>
            <td>${item.description}</td>
            <td>${item.product_type}</td>
            <td><a href="/remove-product/${item.id}"> Delete </a></td>
        </tr>
    </c:forEach>
</table>
	<a href="shop-page"> Return to shopping </a><br />
</body>
</html>