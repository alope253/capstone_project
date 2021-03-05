<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Product</title>

</head>
<body>
    <div>
        <form:form id="form" method="post">
            <h1 ></h1>
                <label for="title" >Title:</label>
                <input type="text" id="title" name="title" class="form-control" value="${product.title}">
            <br />
            <br />
                <label for="price" >Price:</label>
                <input type="number" min="0" step="0.01" id="price" name="price" class="form-control" value="${product.price}">
            <br />
            <br />
                <label for="release_date" >Release Date:</label>
                <input type="date" id="release_date" name="release_date" class="form-control"value="${product.release_date}">
            <br />
            <br />
                <label for="description" >Description:</label>
                <textarea id="description" name="description" rows="5" cols="33" class="form-control">${product.description}</textarea>
            <br />
            <br />
                <label for="product_type" >Product Type:</label>
                <select name="product_type" id="product_type" class="form-control">
                    <option value="ALBUM" <c:if test="${product.product_type == 'ALBUM'}">selected</c:if>>album</option>
                    <option value="SONG" <c:if test="${product.product_type == 'SONG'}">selected</c:if>>song</option>
                </select>
            <br />
            <br />
                <input type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>