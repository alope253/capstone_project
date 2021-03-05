<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add a User</title>

</head>
<body>
    <div>
        <form:form id="form" >
            <h1 ></h1>
                <label for="username" >Username:</label>
                <input type="text" id="username" name="username" class="form-control">
            <br />
            <br />
                <label for="first_name" >First Name::</label>
                <input type="text" id="first_name" name="first_name" class="form-control">
            <br />
            <br />
                <label for="last_name" >Last Name:</label>
                <input type="text" id="last_name" name="last_name" class="form-control">
            <br />
            <br />
                <label for="email" >Email:</label>
                <input type="text" id="email" name="email" class="form-control">
            <br />
            <br />
                <label for="role" >Role:</label>
                <select name="role" id="role" class="form-control">
                    <option value="ADMIN">admin</option>
                    <option value="USER">user</option>
                </select>
            <br />
            <br />
                <input type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>