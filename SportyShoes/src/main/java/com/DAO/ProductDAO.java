package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository
public class ProductDAO {
	
	@Autowired
	JdbcTemplate template;
	
	public List<Product> getProducts(){
		
		return template.query("SELECT * FROM `Product_data2`" , new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product e = new Product();
				e.setId(rs.getInt(1));
				e.setProduct(rs.getString(2));
				e.setPrice(rs.getBigDecimal(3));
				return e;
			}
			
		});
		
	}

}
