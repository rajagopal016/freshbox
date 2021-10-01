package com.simplilearn.phase3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idUsers")
	private int idUsers;
	@Column(name="nameUsers")
	private String nameUsers;
	@Column(name="emailUsers")
	private String emailUsers;
	@Column(name="mobileUsers")
	private String mobileUsers;
	@Column(name="passUsers")
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
