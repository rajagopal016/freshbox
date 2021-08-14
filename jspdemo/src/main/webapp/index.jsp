<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo</title>
<meta http-equiv="refresh" content="1">
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
	<%= "<br>" %>
	<%= "<br>" %>
	<%= "<br>" %>
	<%= "<br>" %>
	<%= "<br>" %>
	<%= "<br>" %>
	<%
		if(request.getParameter("click") != null){
			out.print("Hello " + request.getParameter("fname") + "<br>");
		}
	%>
	<%
		int x  = 10;
	%>
	<input type="text" value="<%= x %>">
	<%
		out.print("<br/>");	
		for(int i=0;i<5;i++){
			out.print("i = " + i + "<br/>");
			
		}
	%>
	The Current date is <%= new Date()%> <br>
	<%= "<br>" %>
	<%= "<br>" %>
	<%= "<br>" %>
	<%= "<br>" %>
	<%= "<br>" %>
	<%= "<br>" %>
	<%@include file="footer.html" %>
	<%---
		This is comment
	 --%>
	 
	 
</body>
</html>