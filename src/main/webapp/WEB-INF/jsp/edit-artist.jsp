<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update artist</title>

</head>
<body>
    <div>
        <form:form id="form" method="post">
            <h1 ></h1>
                <label for="artist_name" >Name:</label>
                <input type="text" id="artist_name" name="artist_name" class="form-control" value="${artist.artist_name}">
            <br />
            <br />
                <input type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>