package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloDb {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1");
			
			  Statement stat = con.createStatement(); 
			  ResultSet rs = stat.executeQuery("select * from myjava.users");
			  while(rs.next()) {
			  System.out.println(rs.getInt(1) + " " + rs.getString(2)); 
			  }
			 
			
			
			  //con.setAutoCommit(false);
			  //stat.executeUpdate("INSERT INTO myjava.users VALUES(104, 'Rahini', 30000)");
			  //stat.executeUpdate("INSERT INTO myjava.users VALUES(105, 'Prakash', 40000)");
			  //con.commit();
			 
			con.close();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
