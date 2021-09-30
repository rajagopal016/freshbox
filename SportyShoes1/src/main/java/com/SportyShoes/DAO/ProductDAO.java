package com.SportyShoes.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.SportyShoes.Model.Product;

public class ProductDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void persist(Product product) {
		em.persist(product);
	}
	
	public List<Product> getAllProducts(){
		TypedQuery<Product> query = em.createQuery("SELECT g FROM Product g ORDER BY g.idProducts", Product.class);
		return query.getResultList();
		
	}

}
