package com.SportyShoes.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsers;
	private String nameUsers;
	private String emailUsers;
	private String mobileUsers;
	
	public Users(String nameUsers, String emailUsers, String mobileUsers) {
		//this.idUsers = idUsers;
		this.nameUsers = nameUsers;
		this.emailUsers = emailUsers;
		this.mobileUsers = mobileUsers;
	}

	public Users() {

	}

	public int getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(int idUsers) {
		this.idUsers = idUsers;
	}

	public String getNameUsers() {
		return nameUsers;
	}

	public void setNameUsers(String nameUsers) {
		this.nameUsers = nameUsers;
	}

	public String getEmailUsers() {
		return emailUsers;
	}

	public void setEmailUsers(String emailUsers) {
		this.emailUsers = emailUsers;
	}

	public String getMobileUsers() {
		return mobileUsers;
	}

	public void setMobileUsers(String mobileUsers) {
		this.mobileUsers = mobileUsers;
	}

	@Override
	public String toString() {
		return "Users [idUsers=" + idUsers + ", nameUsers=" + nameUsers + ", emailUsers=" + emailUsers
				+ ", mobileUsers=" + mobileUsers + "]";
	}
	
	
	
	
	

}
