<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>




<!DOCTYPE html>

<div class="container">

 <div class="panel panel-primary">
        <div class="panel-body">
           <h1>Songs</h1>


			<a href="cart"> go to cart </a><br />
           <h2>Order Song:</h2>
            
            <form action="/shop-page" method="post" >
                Select a Song:&nbsp;
                <label> Products</label>
                <br><br>
                <select name="song">
                    <c:forEach items="${songList}" var="song">
                        <option value="${song.key}"> ${song.value} </option>
                    </c:forEach>
                </select>
                <br/><br/>
                <input type="submit" name="action" value="Add-song-to-cart" />
                <br><br>
                Select a Song:&nbsp;
                <label> Products</label>
                
                
                <select name="album">
                    <c:forEach items="${albumList}" var="album">
                        <option value="${album.key}"> ${album.value} </option>
                    </c:forEach>
                </select>
                <br/><br/>
                <input type="submit" name="action" value="Add-album-to-cart" />
            </form>
        </div>
     </div>
 </div>