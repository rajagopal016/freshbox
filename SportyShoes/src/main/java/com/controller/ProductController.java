package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.DAO.ProductDAO;
import com.model.Product;


@Controller
public class ProductController {
	
	@Autowired
	ProductDAO productdao;
	@GetMapping("/listProducts")
	public String listProducts(Model model) {
		List<Product> products = productdao.getProducts();
		model.addAttribute("products", products);
		return "listProducts";
	}

}
