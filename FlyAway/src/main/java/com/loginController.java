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



@WebServlet("/login")
public class loginController extends HttpServlet {
    private static final long serialVersionUID = 1;
    private UserDAO loginDao;

    public void init() {
        loginDao = new UserDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("login-success.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            authenticate(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void authenticate(HttpServletRequest request, HttpServletResponse response)
    throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        if (loginDao.validate(username, password)) {
        	Cookie ck1 = new Cookie("username", UUID.randomUUID().toString());
			ck1.setMaxAge(60*60*24);
			response.addCookie(ck1);
            RequestDispatcher dispatcher = request.getRequestDispatcher("admin-dashboard.jsp");
            dispatcher.forward(request, response);
        	
        } else {
        	out.print("Incorrect Username or Password");
            throw new Exception("Login not successful..");
            
        }
    }
}