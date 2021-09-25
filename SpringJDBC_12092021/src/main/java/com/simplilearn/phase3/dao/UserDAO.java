package com.simplilearn.phase3.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.persistence.NamedQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.simplilearn.phase3.model.EProduct;
import com.simplilearn.phase3.model.User;



@Repository
public class UserDAO {
	
	@Autowired
	JdbcTemplate template;
	
	public List<User> getUsers(){
		
		return template.query("SELECT * FROM `users`" , new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User();
				u.setIdUsers(rs.getInt(1));
				u.setNameUsers(rs.getString(2));
				u.setEmailUsers(rs.getString(3));
				u.setMobileUsers(rs.getString(4));
				u.setPassUsers(rs.getString(5));
				return u;
			}
			
		});
		
	}

}
