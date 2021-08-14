package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.simplilearn.entity.EProduct;
import com.simplilearn.util.HibernateUtil;

/**
 * Servlet implementation class ListProductServlet
 */
@WebServlet("/list-product")
public class ListProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// read products
		List<EProduct> products = session.createQuery("from EProduct WHERE id = 1").list();

		// show data as table
		out.print("<h1> Product List :- </h1>");
		out.print("<style> table,td,th {" + "border:2px solid red;" + "padding: 10px; " + "}</style>");
		out.print("<table >");
		out.print("<tr>");
		out.print("<th> Product Id</th>");
		out.print("<th> Product Name</th>");
		out.print("<th> Product Price</th>");
		out.print("</tr>");
		for (EProduct p : products) {
			out.print("<tr>");
			out.print("<td>" + p.getId() + "</td>");
			out.print("<td>" + p.getName() + "</td>");
			out.print("<td>" + p.getPrice() + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		// 3. close session
		session.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
