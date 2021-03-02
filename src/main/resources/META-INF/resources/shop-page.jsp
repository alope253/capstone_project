<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="container">

 <div class="panel panel-primary">
     <div class="panel-heading">Store Page</div>
        <div class="panel-body">
           <h1>Songs</h1>
           ${songs}

           <h2>Order Song:</h2>
            <form action="list" method="post">
                Select a Song:&nbsp;
                <select name="song">
                    <c:forEach items="${listSong}" var="song">
                        <option value="${song.id}">${song.name}</option>
                    </c:forEach>
                </select>
                <br/><br/>
                <input type="submit" value="Submit" />
                <h3>Order for ${return-message} submitted</h3>
            </form>
        </div>
     </div>
 </div>