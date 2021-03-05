<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Genre</title>

</head>
<body>
    <div>
        <form:form id="form" method="post">
            <h1 ></h1>
                <label for="title" >Name:</label>
                <input type="text" id="name" name="name" class="form-control" value="${genre.name}">
            <br />
            <br />
                <label for="description" >Description:</label>
                <textarea id="description" name="description" rows="5" cols="33" class="form-control">${genre.description}</textarea>
            <br />
            <br />
                <input type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>