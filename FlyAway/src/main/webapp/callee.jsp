<%@ page language="java" contentType="text/html;charset=UTF-8" %>
 



<body>      
    <br/><br/><br/><br/><br/>
    <form  action="payment.jsp"  method="post">
        <br>
        <%
        String IdFlight=request.getParameter("flight");
        out.println("Your flight Number is "+ IdFlight);
        %>
        <br>
        <%
        String costPerHead=request.getParameter("costPerHead_" + request.getParameter("flight"));
        out.println("Cost Per head is "+ costPerHead);
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
        <br>
        <h2>Enter Passenger Details</h2>
        <% for(int i = 0; i < number; i+=1) { %>
				  <label for=<%= "p_name_"+i %>>Passenger Name:</label>
  				  <input type="text" id=<%= "p_name_"+i %> name=<%= "p_name_"+i %> required>
  				  
  				  <label for=<%= "p_age_"+i %>>Passenger Age:</label>
  				  <input type="number" id=<%= "p_age_"+i %> name=<%= "p_age_"+i %> required>
  				  
<%--   				  <label for=<%= "p_gender_"+i %>>Passenger Gender:</label> --%>
<%--   				  <input type="text" id=<%= "p_gender_"+i %> name=<%= "p_gender_"+i %> required> --%>
				<label for=<%= "p_gender_"+i %>>Passenger Gender:</label>
				<select id=<%= "p_gender_"+i %> name=<%= "p_gender_"+i %>>
				  <option value="Male">Male</option>
				  <option value="Female">Female</option>
				  <option value="Third Gender">Third Gender</option>
  
</select>
				  <br>

				 
	        <% } %>
	     <input type="text" name="doj" hidden="true" value=<%=request.getParameter("doj")%>>
	     <input type="text" name="flight" hidden="true" value=<%=request.getParameter("flight")%>>
	     <input type="text" name="number" hidden="true" value=<%=request.getParameter("number")%>>
	     <input type="text" name="source" hidden="true" value=<%=request.getParameter("source")%>>
	     <input type="text" name="destination" hidden="true" value=<%=request.getParameter("destination")%>>
	     <input type="text" name="costPerHead" hidden="true" value=<%=request.getParameter("costPerHead_" + request.getParameter("flight"))%>>
	     <input type="submit" value="Book">
        
    
 </form>
</body>
</html>
