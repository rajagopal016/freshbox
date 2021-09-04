package com;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;



@Entity

@Table(name="userdetails")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="idUser")
	private int userID;
	
	@Column(name="nameUser")
	private String fullname;
	
	@Column(name="passwordUser")
	private String password;
	
	@Column(name="UserID")
	private String username;
	
	@Column(name="emailUser")
	private String email;
	
	@Column(name="mobileUser")
	private long mobile;
	
	@Column(name="dobUser")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	@Column(name="cityUser")
	private String city;
	
	
	
	public User() {
		
	}
	
	
	public User(int userID, String fullname, String password, String username, String email, long mobile, Date dob, String city) throws ParseException {
		
		this.fullname = fullname;
		this.password = password;
		this.username = username;
		this.userID = userID;
		this.email = email;
		this.mobile = mobile;
		//DateFormat df = new SimpleDateFormat("dd-MM-yyyy"); 
	    this.dob = dob;  
		this.city = city;
	}


	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "User [userID=" + userID + ", fullname=" + fullname + ", password=" + password + ", username=" + username
				+ ", email=" + email + ", mobile=" + mobile + ", dob=" + dob + ", city=" + city + "]";
	}
	

	
	
}
