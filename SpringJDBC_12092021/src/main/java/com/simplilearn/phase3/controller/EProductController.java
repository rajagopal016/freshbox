package com.simplilearn.phase3.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.simplilearn.phase3.dao.EProductDAO;
import com.simplilearn.phase3.dao.ProductRepository;
import com.simplilearn.phase3.model.EProduct;

@Controller
public class EProductController {
	
	@Autowired
	EProductDAO eproductdao;

	@PostMapping("/listProducts")
	public String listProducts(Model model) {
		List<EProduct> products = eproductdao.getProducts();
		model.addAttribute("products", products);
		return "listProducts";
		
	}
	
	@Autowired
	private ProductRepository productRepository;
	@PostMapping("/saveProducts")
	public String saveProduct(@RequestParam(value="price") int price,@RequestParam(value="availability") int availability, @RequestParam(value="name") String name,@RequestParam(value="category") String category, Model model) {
		//System.out.print(email);
		EProduct p = new EProduct(name, category, price, availability);
		try{
			productRepository.save(p);
			return "Saved";
		}catch (Exception e) {
			
			return "SaveFailed";
		}
		
	}
	
	@PostMapping("/addProducts")
	public String addProduct() {
		return "NewShoe";
	}
	
	@PostMapping("/categorizeProducts")
	public String categorizeProduct(@RequestParam(value="category") String category, Model model) {
		List<EProduct> products = eproductdao.getProducts();
		model.addAttribute("products", products);
		return "listProducts";
		
	}
	

}
