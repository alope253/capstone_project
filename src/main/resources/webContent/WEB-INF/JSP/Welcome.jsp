<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Register Form</h1>
	<form action="user_register" method="post">
	<table style="with: 20%">
		<tr>
			<td>First Name</td>
			<td><input type="text" name="first_name" /></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="last_name" /></td>
		</tr>
		<tr>
			<td>UserName</td>
			<td><input type="text" name="username" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><input type="text" name="email" /></td>
		</tr>
	</table>
	<input type="submit" value="Submit" /></form>
</body>
</html>