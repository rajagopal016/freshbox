<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.Flight" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>


<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>

<script language="JavaScript">
    function showInput() {
        document.getElementById('display').innerHTML = 
                    document.getElementById("flight").value;
        id = document.getElementById("flight").value;
    }
  </script>

<head>
<meta charset="ISO-8859-1">
<title>Search Result</title>
</head>
<body>
	<p>Showing Flights for ${number} passengers from ${source} to ${destination} on ${date}</p>
	<% List <Flight> available = (List<Flight>)request.getAttribute("data");
	   int len = available.size(); %>
	<% if(len>0) { %>
		
			<form action="callee.jsp" method="post">
			<% for(int i = 0; i < len; i+=1) { %>
				
				  <input type="radio" id="<%=available.get(i).getIdFlight()%>" name="flight" value="<%=available.get(i).getIdFlight()%>" required>
				  <label for="<%=available.get(i).getIdFlight()%>">Airline:<%=available.get(i).getNameAirline()%><br>Departure:<%=available.get(i).getTimeOfDeparture()%><br>Arrival:<%=available.get(i).getTimeOfArrival()%><br>CostPerHead:<%=available.get(i).getCostFlight()%></label><br><br>
				  
				  <input type="text" hidden="true" name=<%= "costPerHead_" + available.get(i).getIdFlight()%> hidden="true" value=<%=available.get(i).getCostFlight()%>>
	        <% } %>
	        <input type="text" name="doj" hidden="true" value=${date}>
	        <input type="text" name="number" hidden="true" value=${number}>
	        <input type="text" name="source" hidden="true" value=${source}>
	        <input type="text" name="destination" hidden="true" value=${destination}>
	        
	        <input type="submit" onclick="showInput()" value="Book">
			</form>
	        
	<% } else { %>
	<p>No Flights for your search criteria</p>
	<a href="home.jsp">Home</a>
	<% } %>
</body>
</html>