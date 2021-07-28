package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;

/**
 * Servlet implementation class summaryServlet
 */
public class summaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public summaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		
		if(session != null) {
			User u = (User) session.getAttribute("user");
			u.setTel(Long.parseLong(request.getParameter("phone")));
			u.setCity(request.getParameter("city"));
			PrintWriter out = response.getWriter();
			out.println("Hello " + u.getFname() + " " + u.getLname());
			out.println("Details" + u);
			out.println("Session ID : " + session.getId() + "and creted at " + session.getCreationTime());
			session.invalidate();
		}
		
	}

}
