<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add a Genre</title>

</head>
<body>
    <div>
        <form:form id="form" >
            <h1 ></h1>
                <label for="name" >Name:</label>
                <input type="text" id="name" name="name" class="form-control">
            <br />
            <br />
                <label for="description" >Description:</label>
                <textarea id="description" name="description" rows="5" cols="33" placeholder="Enter description here..." class="form-control"></textarea>
            <br />
            <br />
                <input type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>