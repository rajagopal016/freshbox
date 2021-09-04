package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import hibernateutil.UserDAO;
import com.User;


@WebServlet("/register")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1;
    private UserDAO userDao;

    public void init() {
        UserDAO userDao = new UserDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
			register(request, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, ParseException {
        String fullname = request.getParameter("username");
        String password = request.getParameter("password");
        String username = request.getParameter("userid");
        String email = request.getParameter("email");
        
        String mobile=request.getParameter("mobile");
        long  mobilelong=Long.parseLong(mobile.trim());
        
        String city = request.getParameter("city");
        String dob = request.getParameter("dob");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //surround below line with try catch block as below code throws checked exception
        Date dob_date = sdf.parse(dob);
        

        User user = new User();
        user.setFullname(fullname);
        user.setEmail(email);
        user.setUsername(username);
        user.setCity(city);
        user.setDob(dob_date);
        user.setMobile(mobilelong);
        user.setPassword(password);

        int UserRegistrationStatus = userDao.register(user);
        System.out.println(UserRegistrationStatus);
        if(UserRegistrationStatus > 0) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("register-success.html");
            dispatcher.forward(request, response);
        }else {
        	PrintWriter out = response.getWriter();
        	out.print("Registration Failed");
        }
        
        
    }
}