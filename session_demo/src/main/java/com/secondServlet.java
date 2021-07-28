package com;
import dto.*;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.apache.catalina.connector.Request;

public class secondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public secondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//User u = new User();
		HttpSession session = request.getSession(false);
		if(session != null) {
			User u = (User) session.getAttribute("user");
			u.setAge(Integer.parseInt(request.getParameter("age")));
			u.setEmail(request.getParameter("email"));
			session.setAttribute("user", u);
			response.sendRedirect("3.html");
		}
		
		
	}

}
