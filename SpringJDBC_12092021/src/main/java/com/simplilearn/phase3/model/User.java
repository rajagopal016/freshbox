package com.simplilearn.phase3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class User {
	private int idUsers;
	
	private String nameUsers;
	
	private String emailUsers;
	
	private String mobileUsers;
	
	private String passUsers;
	
	public User(String nameUsers, String emailUsers, String mobileUsers, String passUsers) {
		//this.idUsers = idUsers;
		this.nameUsers = nameUsers;
		this.emailUsers = emailUsers;
		this.mobileUsers = mobileUsers;
		this.passUsers = passUsers;
	}

	public User() {

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
	public String getPassUsers() {
		return passUsers;
	}

	public void setPassUsers(String passUsers) {
		this.passUsers = passUsers;
	}

	@Override
	public String toString() {
		return "Users [idUsers=" + idUsers + ", nameUsers=" + nameUsers + ", emailUsers=" + emailUsers
				+ ", mobileUsers=" + mobileUsers + ", passUsers=" + passUsers + "]";
	}

}
