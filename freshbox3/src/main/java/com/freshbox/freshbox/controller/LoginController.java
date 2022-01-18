package com.freshbox.freshbox.controller;


	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.freshbox.freshbox.dao.UserDAO;
import com.freshbox.freshbox.model.User;



@Controller
public class LoginController {
	@Autowired
	UserDAO userdao;
	@RequestMapping(value = "/loginaction", method = {RequestMethod.GET,RequestMethod.POST})
	public String home(@RequestParam(value="uname") String uname,@RequestParam(value="psw") String password, Model model) {
		System.out.println(uname);
		System.out.println(password);
		System.out.println(userdao.getUsers(uname, password));
		return "index";
	}
	
	
	
	
}
