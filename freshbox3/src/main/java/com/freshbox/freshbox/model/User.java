package com.freshbox.freshbox.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Table_User_Id")
	private int User_Id;
	@Column(name="Table_User_Name")
	private String User_Name;
	@Column(name="Table_User_Mobile")
	private String User_Mobile;
	@Column(name="Table_User_Address")
	private String User_Address;
	@Column(name="Table_User_Age")
	private int User_Age;
	@Column(name="Table_User_Password")
	private String User_Password;
	@Column(name="Table_User_Email")
	private String User_Email;

	public User(int user_Id, String user_Name, String user_Mobile, String user_Address, int user_Age, String user_Password,
			String user_Email) {
		User_Id = user_Id;
		User_Name = user_Name;
		User_Mobile = user_Mobile;
		User_Address = user_Address;
		User_Age = user_Age;
		User_Password = user_Password;
		User_Email = user_Email;
	}
	
	public User() {
	
	}
	
	public int getUser_Id() {
		return User_Id;
	}
	
	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	
	public String getUser_Name() {
		return User_Name;
	}
	
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	
	public String getUser_Mobile() {
		return User_Mobile;
	}
	
	public void setUser_Mobile(String user_Mobile) {
		User_Mobile = user_Mobile;
	}
	
	public String getUser_Address() {
		return User_Address;
	}
	
	public void setUser_Address(String user_Address) {
		User_Address = user_Address;
	}
	
	public int getUser_Age() {
		return User_Age;
	}
	
	public void setUser_Age(int user_Age) {
		User_Age = user_Age;
	}
	
	public String getUser_Password() {
		return User_Password;
	}
	
	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}
	
	public String getUser_Email() {
		return User_Email;
	}
	
	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}

	@Override
	public String toString() {
		return "User [User_Id=" + User_Id + ", User_Name=" + User_Name + ", User_Mobile=" + User_Mobile
				+ ", User_Address=" + User_Address + ", User_Age=" + User_Age + ", User_Password=" + User_Password
				+ ", User_Email=" + User_Email + "]";
	}
	
	


}

