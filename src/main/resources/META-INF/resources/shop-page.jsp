<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<div class="container">

 <div class="panel panel-primary">
        <div class="panel-body">
           <h1>Songs</h1>
           ${test}
           ${songs}

           <h2>Order Song:</h2>
            
            <form:form  method="post" action="/shop-page.jsp">
                Select a Song:&nbsp;
                <label> Products</label>
                
                
                <select name="song">
                    <c:forEach items="${productList}" var="product">
                        <option value="${product.key}">${product.value} file</option>
                    </c:forEach>
                </select>
                <br/><br/>
                <input type="submit" name="action" value="Add-to-cart" />
                <input type="submit" name="action" value="go-to-cart"/>
                <h3>Order for ${return-message} submitted</h3>
            </form:form>
        </div>
     </div>
 </div>