<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="com.SportyShoes.Model.Product.*"%>

<jsp:useBean id="productDao" type="com.SportyShoes.DAO.ProductDAO" scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Add Products - Form </title>
    </head>

    <body>
        <form method="POST" action="Products.html">
            Name: <input type="text" name="name" />
            Category: <input type="text" name="category" />
            Price: <input type="text" name="price" />
            Availability: <input type="text" name="availability" />
            <input type="submit" value="Add" />
        </form>

        <hr><ol> 
        <% for (com.SportyShoes.Model.Product products : productDao.getAllProducts()) { %>
            <li> <%= products %> </li>
        <% } %>
        </ol><hr>

        <iframe src="http://www.objectdb.com/pw.html?spring-eclipse"
            frameborder="0" scrolling="no" width="100%" height="30"> </iframe>
     </body>
 </html>