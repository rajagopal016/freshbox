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
import com.simplilearn.phase3.dao.PurchaseDAO;

import com.simplilearn.phase3.model.EProduct;
import com.simplilearn.phase3.model.Purchase;

@Controller
public class PurchaseController {
	
	@Autowired
	PurchaseDAO purchasedao;

	@PostMapping("/listPurchase")
	public String listPurchase(Model model) {
		List<Purchase> purchases = purchasedao.getPurchase();
		model.addAttribute("purchases", purchases);
		//return "listProducts";
		return "listPurchases";
	}
	
	

}
