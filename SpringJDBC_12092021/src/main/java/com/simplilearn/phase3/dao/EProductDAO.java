package com.simplilearn.phase3.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.phase3.model.EProduct;

@Repository
public class EProductDAO {
	
	@Autowired
	JdbcTemplate template;
	
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

}
