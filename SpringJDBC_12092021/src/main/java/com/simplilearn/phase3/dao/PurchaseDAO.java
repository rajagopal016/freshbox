package com.simplilearn.phase3.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.simplilearn.phase3.model.EProduct;
import com.simplilearn.phase3.model.Purchase;

@Repository
public class PurchaseDAO {
	
	@Autowired
	JdbcTemplate template;
	@Autowired
	NamedParameterJdbcTemplate namedTemplate;

	/*
	 * SessionFactory sessionFactory = new
	 * Configuration().configure().buildSessionFactory(); session =
	 * sessionFactory.openSession();
	 */
	public List<Purchase> getPurchase(){
		
		return template.query("SELECT * FROM `purchase`" , new RowMapper<Purchase>() {

			@Override
			public Purchase mapRow(ResultSet rs, int rowNum) throws SQLException {
				Purchase e = new Purchase();
				e.setIdPurchase(rs.getInt(1));
				e.setItemPurchase(rs.getString(2));
				e.setCostPurchase(rs.getInt(3));
				e.setUserPurchase(rs.getString(4));
				e.setDatePurchase(rs.getDate(5));
				e.setCategoryPurchase(rs.getString(6));
				return e;
			}
			
		});
		
	}
	
	

	
	

	
	

	

	

}
