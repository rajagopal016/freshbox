package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernateutil.UserDAO;



@WebServlet("/passwordchange")
public class passwordchange extends HttpServlet {
    private static final long serialVersionUID = 1;
    private UserDAO passwordchangeDao;

    public void init() {
    	passwordchangeDao = new UserDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("password.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            passwordchange(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void passwordchange(HttpServletRequest request, HttpServletResponse response)
    throws Exception {
        String username = request.getParameter("username");
        String pass1 = request.getParameter("pass1");
        String pass2 = request.getParameter("pass2");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        if (passwordchangeDao.changepassword(username, pass1) && pass1.equals(pass2)) {
        	out.print("Password changed successfully");
        	//out.print("</br>");
        	//out.print("<html><a href=\"home.html\">Home</a></html>");
        	
        } else {
        	out.print("Password change NOT successfull");
        	//out.print("</br>");
        	//out.print("<html><a href=\"home.html\">Home</a></html>");
        }
    }
}