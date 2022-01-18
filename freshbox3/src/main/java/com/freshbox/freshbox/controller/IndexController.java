package com.freshbox.freshbox.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexController {
	

	@GetMapping("/home")
	public String home(Model model) {
		return "index";
	}
	
	@GetMapping("/")
	public String home1(Model model) {
		return "index";
	}
	
	@GetMapping("/index")
	public String home2(Model model) {
		return "index";
	}
	
	@GetMapping("/userlogin")
	public String userlogin(Model model) {
		return "userlogin";
	}
	
	@GetMapping("/userreg")
	public String userreg(Model model) {
		return "userregistration";
	}

	
	
	
}
