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
		Enter Name: <input type="text" name="fname">
		<input type="submit" name="click" value="Click Me!"> <br>
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