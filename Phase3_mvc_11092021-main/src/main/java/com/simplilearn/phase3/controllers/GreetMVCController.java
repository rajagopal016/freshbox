package com.simplilearn.phase3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetMVCController {

	@GetMapping("/greet")
	public String greet(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		System.out.println("Invoked");
		
		model.addAttribute("name", name);
		// Business logic can be written here

		return "hello";
	}

}
