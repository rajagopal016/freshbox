<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
  text-align: center;
}
h2 {
  text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>FlyAway.com - Fly With Us</title>
</head>
<body>
<h1>FlyAway.com Fly - With Us</h1>
<h2>Cheap flights everywhere, from anywhere!</h2>
<p style="text-align:right">
    
   <a href="userlogin.html">SignIn/Register</a>

    ||

   <a href="adminlogin.html">Admin LogIn</a>
</p>
<form action="<%=request.getContextPath()%>/BookingController" method="post">
  <label for="source">Source:</label>
  <input type="text" id="source" name="source" required><br><br>
  <label for="destination">Destination:</label>
  <input type="text" id="destination" name="destination" required><br><br>
  <label for="date">Date(DD-MM-YYYY):</label>
  <input type="date" id="date" name="date" required><br><br>
  <label for="numbers">Number of People:</label>
  <input type="number" id="numbers" name="numbers" required><br><br>
  <input type="submit" value="Submit">
</form>

</body>
</html>