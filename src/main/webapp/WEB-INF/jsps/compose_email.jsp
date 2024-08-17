<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body>
<h2>Compose Email</h2>
<form action="sendEmail" method="post">
 To : <input type="text" name="to" value="${email}"/><br><br>
 Subject : <input type="text" name="subject"/><br><br>
 <textarea  name="body" placeholder="write" rows="4" cols="40"></textarea><br><br>
 <input type="submit" value="send_email"/>
</form>
</body>
</html>