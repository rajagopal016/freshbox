
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>
	
	<h1>Hello from HTML</h1>
	<%= "<h1>Hello from JSP</h1>" %>
	<form action="">
		Enter Name: <input type="text" name="fname"/><br/>
		Enter Age: <input type="text" name="age"/><br/>
		Enter Email: <input type="email" name="email"/><br/>
		Enter Password:<input type="password" name="password"/><br/>
		Gender:<input type="radio" name="gender" value="female"/>Female
			<input type="radio" name="gender" value="male"/>Male<br/>
		Hobbies:<input type="checkbox" name="hobby" value="reading"/>Reading
				<input type="checkbox" name="hobby" value="singing"/>Singing
				<input type="checkbox" name="hobby" value="dancing"/>Dancing
				<input type="checkbox" name="hobby" value="swimming"/>Swimming
				<br/>
		Country:<select name="country">
					<option value="select"> Select Country </option>
					<option value="India"> India </option>
					<option value="USA"> USA </option>
					<option value="UK"> UK </option>
					<option value="Others"> Others </option>
					
		
				</select>
		<br/>
		<input type="submit" name="register" value="Register Me!"> <br/>
	</form>
	<%if(request.getParameter("register") != null){%>
			<jsp:useBean id="user" class="com.to.User" scope="request"></jsp:useBean>
			<jsp:setProperty property="*" name="user"/>
			<jsp:forward page="RegisterServlet"></jsp:forward>
		<%}%>
	
	 
	 
</body>
</html>