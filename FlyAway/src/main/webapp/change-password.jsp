<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway.com - Password Change</title>
</head>
<body>
<h2 style="text-align:center">Password Change</h2>
<form action="<%=request.getContextPath()%>/passwordchange" method="post">
	<label for="username">User Name:</label>
	<input type="text" id="username" name="username"><br><br>
	<label for="pass1">New Password:</label>
	<input type="password" id="pass1" name="pass1"><br><br>
	<label for="pass2">Confirm Password:</label>
	<input type="password" id="pass2" name="pass2"><br><br>
	<input type="submit" value="Login">
	
</form>
</body>
</html>