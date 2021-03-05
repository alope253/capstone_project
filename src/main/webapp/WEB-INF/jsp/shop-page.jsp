<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>




<!DOCTYPE html>

<div class="container">

 <div class="panel panel-primary">
        <div class="panel-body">
           <h1>Songs</h1>


           <h2>Order Song:</h2>
            
            <form action="/shop-page" method="post" >
                Select a Song:&nbsp;
                <label> Products</label>
                
                
                <select name="product">
                    <c:forEach items="${productList}" var="product">
                        <option value="${product.key}"> ${product.value} </option>
                    </c:forEach>
                </select>
                <br/><br/>
                <input type="submit" name="action" value="Add-to-cart" />
                <input type="submit" name="action" value="go-to-cart"/>
            </form>
        </div>
     </div>
 </div>