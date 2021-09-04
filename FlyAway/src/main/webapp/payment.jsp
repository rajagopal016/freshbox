<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final Summary</title>
</head>
<body>
	<form action="bookingComplete.jsp"  method="post">
    	<br>
        <br>
        <%
        String IdFlight=request.getParameter("flight");
        out.println("Your flight Number is "+ IdFlight);
        %>
        <br>
        <%
        String doj=request.getParameter("doj");
        out.println("Your date of Journey is "+ doj);
        %>
        <br>
		<%
        String source=request.getParameter("source");
        out.println("Your source is "+ source);
        %>
        <br>
        <%
        String destination=request.getParameter("destination");
        out.println("Your destination is "+ destination);
        %>
        <br>
        <%
        int number=Integer.parseInt(request.getParameter("number"));
        out.println("Number of Passengers is "+ number);
        %>
        <br>
        <%
        int cost= number * Integer.parseInt(request.getParameter("costPerHead"));
        out.println("Total Cost is "+ cost);
        %>
        <br>
        <br>  
                <h2>Passenger Details</h2>
        <% for(int i = 0; i < number; i+=1) { %>
				
				  Passenger Name : <%= request.getParameter("p_name_" + i)%>
				  || Passenger Age : <%= request.getParameter("p_age_" + i)%>
				  || Passenger Gender : <%= request.getParameter("p_gender_" + i)%> <br>
				 
	        <% } %>
	    
		  <p>Please select your desired payment mode:</p>
		  <input type="radio" id="cc" name="payment" value="Credit Card" required>
		  <label for="cc">Credit Card</label><br>
		  <input type="radio" id="dc" name="payment" value="dc">
		  <label for="dc">Debit Card</label><br>
		  <input type="submit" value="Pay and Complete">

  <br> 
    </form>
</body>
</html>