<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Task</title>
</head>

<body>
<h1>Update Task</h1>
<br />

<form:form method="post">
        <label for="title">Song Title:</label>
        <input type="text" id="title" name="title" value="${song.title}">
    <br>
    <br>
    	<label for="artists">Artists:</label>
    	<select name="artists" id="artists">
    		<c:forEach items="${artists}" var="artist">
    			<option value="${artist.artist_id}">${artist.artist_name}</option>
    		</c:forEach>
    	</select>
    <br>
    <br>
    	<label for="albums">Albums:</label>
    	<select name="albums" id="albums">
    		<c:forEach items="${albums}" var="album">
    			<option value="${album.album_id}">${album.title}</option>
    		</c:forEach>
    	</select>
    <br>
    <br>
        <label for="release_date">Release Date:</label>
        <input type="date" id="release_date" name="release_date" value=<fmt:formatDate pattern = "yyyy-MM-dd" value = "${song.release_date}" />>
    <br>
    <br>
        <label for="description">Description:</label>
        <textarea id="description" name="description" rows="4" cols="50" >${song.description}</textarea>
    <br>
    <br>
        <label for="price">Price:</label>
        <input type="number" min="0" step="any /" id="price" name="price" value="${song.price}">
    <br>
    <br>
    	<label for="genres">Genres:</label>
    	<select name="genres" id="genres">
    		<c:forEach items="${genres}" var="genre">
    			<option value="${genre.genre_id}">${genre.name}</option>
    		</c:forEach>
    	</select>
    <br>
    <br>
        <input type="submit" value="Submit">
    <br>

</form:form>
</body>
</html>