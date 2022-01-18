package com.freshbox.freshbox.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

import com.freshbox.freshbox.model.User;

public class UserDAO {
	
		@Autowired
		JdbcTemplate template;
		private JdbcTemplate jdbcTemplateObject;
		
		public List<User> getUsers(String uname, String password){
			
			return template.query("SELECT * FROM `table_user`" , new RowMapper<User>() {
		
				@Override
				public User mapRow(ResultSet rs, int rowNum) throws SQLException {
					User u = new User();
					u.setUser_Id(rs.getInt(1));
					u.setUser_Name(rs.getString(2));
					u.setUser_Mobile(rs.getString(3));
					u.setUser_Address(rs.getString(4));
					u.setUser_Age(rs.getInt(5));
					u.setUser_Password(rs.getString(6));
					u.setUser_Email(rs.getString(7));
					return u;
				}
				
			});
			
		}
	   /*public List<User> getAllUsers();
	   public User getUser(int userid);
	   public void updateUser(User user);
	   public void deleteUser(User user);
	   public static String getUserByUserNameAndPassword(String user, String pass) {
		// TODO Auto-generated method stub
		   final String q = "select * from table_user where table_user_id =?";
		   try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/freshbox?useSSL=false", "root", "1234");

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(q);) {
				preparedStatement.setString(1, user);
				System.out.println(preparedStatement);
				// Step 3: Execute the query or update query
				ResultSet rs = preparedStatement.executeQuery();
				
				// Step 4: Process the ResultSet object.
				while (rs.next()) {
				    String id = rs.getString("table_user_id");
				    String name = rs.getString("table_user_name");
				    String email = rs.getString("table_user_email");
				    String address = rs.getString("table_user_address");
				    String password = rs.getString("table_user_password");
				    String mobile = rs.getString("table_user_mobile");
				    String age = rs.getString("table_user_age");
				    System.out.println(id + "," + name + "," + email + "," + address + "," + password);
			                
			            }
			            return "true";
			        } catch (SQLException e) {
			            System.out.print(e.getMessage());
			        }
				return q;*/
	}

