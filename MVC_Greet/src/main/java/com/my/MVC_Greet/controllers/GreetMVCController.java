package com.my.MVC_Greet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetMVCController {
	@RequestMapping("/greet")
	public String greet(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
		System.out.println("Invoked");
		model.addAttribute("name", name);
		return "Hello";
		
	}

}
