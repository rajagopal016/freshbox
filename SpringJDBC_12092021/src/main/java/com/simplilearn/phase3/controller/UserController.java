package com.simplilearn.phase3.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.phase3.dao.UserDAO;
import com.simplilearn.phase3.model.EProduct;
import com.simplilearn.phase3.model.User;

@Controller
public class UserController{
		@Autowired
		UserDAO userdao;
		Boolean loginPassed;
		@PostMapping("/userController")
		public String getUsers(Model model) {
			List<User> users = userdao.getUsers();
			model.addAttribute("users", users);
			return "listUsers";
		}
		
		@RequestMapping("/loginController")
		public String getUsers1(@RequestParam(value="email") String email,@RequestParam(value="password") String password, Model model) {
			//System.out.print(email);
			List<User> users = userdao.getUsers();
			//model.addAttribute("users", users);
			for(User user:users) {
				//System.out.print(user.getEmailUsers());
				if(user.getEmailUsers().equals(email) && user.getPassUsers().equals(password)) {
					System.out.print(true);
					return "adminDashboard";
				}
			}
					
			return "index";
		}
		
	
}

