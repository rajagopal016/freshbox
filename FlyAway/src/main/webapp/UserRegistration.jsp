<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway.com - User Registration Form</title>

<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
</head>

</head>
<body>
 <div class="container">
 <div class="row text-center" style="color: tomato;">
  <h2>User Registration form for New Users</h2>
 </div>
 <hr>
  

     <form action="<%=request.getContextPath()%>/register" method="post">

      <label for="username">Full Name:</label>
	<input type="text" id="username" name="username" required><br><br>
	<label for="userid">User ID:</label>
	<input type="text" id="userid" name="userid" required><br><br>
	<label for="password">Password:</label>
	<input type="password" id="password" name="password" required><br><br>
	<label for="email">Email:</label>
	<input type="email" id="email" name="email" required><br><br>
	<label for="mobile">Mobile:</label>
	<input type="text" id="mobile" name="mobile" required><br><br>
	<label for="city">City:</label>
	<input type="text" id="city" name="city" required><br><br>
	<label for="dob">DOB:</label>
	<input type="date" id="dob" name="dob" required><br><br>
	<input type="submit" value="Register Now"><br>

      

     </form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>