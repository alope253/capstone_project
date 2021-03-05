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
    <c:forEach items="${products}" var="prod">
        <tr>
            <td>${prod.title}</td>
            <td>${prod.price}</td>
            <td><fmt:formatDate type = "date" value = "${prod.release_date}" /></td>
            <td>${prod.description}</td>
            <td>${prod.product_type}</td>
            <td> Delete</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>