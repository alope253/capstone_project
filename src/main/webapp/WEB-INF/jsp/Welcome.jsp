<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>
  <h2 class="text-center">Albums in Stock</h2>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
 
    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
       <!-- <c:url value='/src/main/webapp/Web-INF/Deathcab for Cutie - Transatlanticism.jpg'/> -->
         <img src="https://upload.wikimedia.org/wikipedia/en/e/e9/Transatlanticism.jpg" alt="Album by Deathcab for Cutie" style="width:100%;">
      </div>
 
      <div class="item">
        <img src="https://upload.wikimedia.org/wikipedia/en/2/2a/2014ForestHillsDrive.jpg" alt="Album by J. Cole" style="width:100%;">
      </div>
    
      <div class="item">
       <img src="https://upload.wikimedia.org/wikipedia/en/e/e4/Death_of_a_Bachelor.jpg"alt="Album by Panic at the Disco!" style="width:100%;">
      </div>
      <div class="item">
           <img src="https://upload.wikimedia.org/wikipedia/en/c/c1/The_Weeknd_-_After_Hours.png" alt="Album by The Weeknd" style="width:100%;">
    </div>
 
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

<br />
<br />

<table style="margin: auto; padding: 10px;"> <tr>
<td style="padding:10px;"><a href="shop-page"> Want to Shop Now? </a></td>
<td style="padding:10px;"><a href="/admin"> Admin portal can be found here! </a></td>
<td style="padding:10px;"><a href="Registration"> Register now! </a></td>
<td style="padding:10px;"><a href="login"> Login Now !</a></td>
</tr> </table>

</body>
</html>