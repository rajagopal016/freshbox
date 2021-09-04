package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernateutil.UserDAO;

/**
 * Servlet implementation class BookingController
 */
@WebServlet("/BookingController")
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO bookingDao;

    public void init() {
        bookingDao = new UserDAO();
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			List <Flight> data = searchFlight(request, response);
		    request.setAttribute("data", data);
		    request.setAttribute("date", request.getParameter("date"));
		    request.setAttribute("source", request.getParameter("source"));
		    request.setAttribute("destination", request.getParameter("destination"));
		    request.setAttribute("number", request.getParameter("numbers"));
		    
		    request.getRequestDispatcher("SearchResult.jsp").forward(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private List<Flight> searchFlight(HttpServletRequest request, HttpServletResponse response)
		    throws Exception {
		try {
		String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String date = request.getParameter("date");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date doj = sdf.parse(date);
        @SuppressWarnings("deprecation")
		int dayOfWeek = doj.getDay();
        int numberOfPassengers = Integer.parseInt(request.getParameter("numbers"));
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        List <Flight> availableFlights = bookingDao.searchTheFlight(source, destination, dayOfWeek, numberOfPassengers);
        return availableFlights;
		}
		catch(Exception e) {
			List <Flight> availableFlights2 = Collections.emptyList();;
			return availableFlights2;
		}
		}

	}
	
