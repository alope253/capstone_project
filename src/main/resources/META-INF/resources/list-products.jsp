<%@page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Task List</title>
</head>
<body>

	<h1>Product listing</h1>
	<br />

	<table>
	    <tr>
    	    <th>Title</th>
    	    <th>Artist</th>
    	    <th>Albums</th>
    	    <th>Release Date</th>
    	    <th>Description</th>
    	    <th>Price</th>
    	    <th>Genres</th>
		</tr>
    
		<c:forEach items="${products}" var="product">
		<tr>
			<td>${product.product_type}</td>
			<td>${product.title}</td>
			<td>${product.artist}</td>
			<td><fmt:formatDate type = "date" value = "${song.release_date}" /></td>
			<td>${song.description}</td>
			<td>${song.price}</td>
			
			<td>${song.genres}</td>
            
            <td> <a href="/edit-song/${task.id}">Edit</a></td>
            <td> <a href="/delete-song/${task.id}">Delete</a></td>
        </tr>
    	</c:forEach>
	</table>

	<br />
	<h4><a href="/add-song">Add a new song</a></h4>
	<br />

</body>
</html>