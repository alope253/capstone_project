<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Content Administration</h1>
	<br />
	
	<h3>Welcome ${first_name}</h3>
	<br />
	
	<div>
		<h4>Manage Content</h4>
		<ul>
			<li><a href="/product-list">Products</a></li> <!-- link to album list page -->
			<li><a href="/artist-list">Artists</a></li> <!-- link to artist list page -->
			<li><a href="/genre-list">Genres</a></li> <!-- link to genre list page -->
			<li><a href="/user-list">Users</a></li> <!-- link to order list page -->
			<li><a href="/order-list">Orders</a></li> <!-- link to order list page -->
		</ul>
	</div>
	
	<!-- list pages list the content in order of ID -->
		<!-- can sort by other variables - JS, do later-->
		<!-- each element has a "edit" and "delete" next to it -->
			<!-- redirects to a data filled form page for edit -->
			<!-- removes item from database if Deleted (cascade) -->
		<!-- Button for "add" at bottom of page -->
			<!-- Redirect to form page with drop-downs for many of the fields, plain text for the remainder -->	
	
	
	<!-- new pages needed -->
		<!-- artist list -->						<!--  -->
			<!-- artist add/edit -->				<!--  -->
		<!-- song/album list -->						<!-- Done -->		<!-- Build controller and test these two -->
			<!-- song/album add/edit -->				<!-- Done -->		<!-- before moving onto the remaining pages -->
		<!-- Genre list -->							<!--  -->
			<!-- genre add/edit -->					<!--  -->
		<!-- user list -->							<!--  -->
			<!-- user edit -->						<!--  -->
		<!-- order list w/ edit status dropdown-->	<!--  -->
		

</body>
</html>