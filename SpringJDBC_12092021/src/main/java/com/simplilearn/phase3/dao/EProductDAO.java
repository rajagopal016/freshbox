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

@Repository
public class EProductDAO {
	
	@Autowired
	JdbcTemplate template;
	@Autowired
	NamedParameterJdbcTemplate namedTemplate;

	/*
	 * SessionFactory sessionFactory = new
	 * Configuration().configure().buildSessionFactory(); session =
	 * sessionFactory.openSession();
	 */
	public List<EProduct> getProducts(){
		
		return template.query("SELECT * FROM `products`" , new RowMapper<EProduct>() {

			@Override
			public EProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
				EProduct e = new EProduct();
				e.setIdProducts(rs.getInt(1));
				e.setNameProducts(rs.getString(2));
				e.setCategoryProducts(rs.getString(3));
				e.setPriceProducts(rs.getInt(4));
				e.setAvailabilityProducts(rs.getInt(5));
				return e;
			}
			
		});
		
	}
	
	
	public List<EProduct> categorizeProduct(){
			
			return template.query("SELECT * FROM `products`" , new RowMapper<EProduct>() {
	
				@Override
				public EProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
					EProduct e = new EProduct();
					e.setIdProducts(rs.getInt(1));
					e.setNameProducts(rs.getString(2));
					e.setCategoryProducts(rs.getString(3));
					e.setPriceProducts(rs.getInt(4));
					e.setAvailabilityProducts(rs.getInt(5));
					return e;
				}
				
			});
			
		}
	
	

	
	

	

	

}
