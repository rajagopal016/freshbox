package com.simplilearn.phase3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.phase3.dao.EProductDAO;
import com.simplilearn.phase3.model.EProduct;

@Controller
public class EProductController {
	
	@Autowired
	EProductDAO eproductdao;
	@GetMapping("/listProducts")
	public String listProducts(Model model) {
		List<EProduct> products = eproductdao.getProducts();
		model.addAttribute("products", products);
		return "listProducts";
	}

}
