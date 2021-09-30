package com.SportyShoes.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SportyShoes.DAO.ProductDAO;

import com.SportyShoes.Model.Product;

public class ProductController {
	
	@Autowired
	private ProductDAO productDao;
	
	@RequestMapping(value="/Products")
	public ModelAndView ProductsCatalog(HttpServletRequest request) {
		
		String nameProducts = request.getParameter("name");
		String categoryProducts = request.getParameter("category");
		int priceProducts = Integer.getInteger(request.getParameter("price"));
		int availabilityProducts = Integer.getInteger(request.getParameter("availability"));
		
		productDao.persist(new Product(nameProducts, categoryProducts, priceProducts, availabilityProducts));
		
		return new ModelAndView("Products.jsp", "productDao", productDao);
		
	}
	
	

}
