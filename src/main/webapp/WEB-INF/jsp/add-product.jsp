<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add a Product</title>

</head>
<body>
    <div>
        <form:form id="form" >
            <h1 ></h1>
                <label for="title" >Title:</label>
                <input type="text" id="title" name="title" class="form-control">
            <br />
            <br />
                <label for="price" >Price:</label>
                <input type="number" min="0" step="0.01" id="price" name="price" class="form-control">
            <br />
            <br />
                <label for="release_date" >Release Date:</label>
                <input type="date" id="release_date" name="release_date" class="form-control">
            <br />
            <br />
                <label for="description" >Description:</label>
                <textarea id="description" name="description" rows="5" cols="33" placeholder="Enter description here..." class="form-control"></textarea>
            <br />
            <br />
                <label for="product_type" >Product Type:</label>
                <select name="product_type" id="product_type" class="form-control">
                    <option value="ALBUM">album</option>
                    <option value="SONG">song</option>
                </select>
            <br />
            <br />
                <input type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>