package com.simplilearn.phase3.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase")
public class Purchase {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idPurchase")
	private int idPurchase;
	@Column(name="itemPurchase")
	private String itemPurchase;
	@Column(name="costPurchase")
	private int costPurchase;
	@Column(name="userPurchase")
	private String userPurchase;
	@Column(name="datePurchase")
	private Date datePurchase;
	@Column(name="categoryPurchase")
	private String categoryPurchase;
	public int getIdPurchase() {
		return idPurchase;
	}
	public void setIdPurchase(int idPurchase) {
		this.idPurchase = idPurchase;
	}
	public String getItemPurchase() {
		return itemPurchase;
	}
	public void setItemPurchase(String itemPurchase) {
		this.itemPurchase = itemPurchase;
	}
	public int getCostPurchase() {
		return costPurchase;
	}
	public void setCostPurchase(int costPurchase) {
		this.costPurchase = costPurchase;
	}
	public String getUserPurchase() {
		return userPurchase;
	}
	public void setUserPurchase(String userPurchase) {
		this.userPurchase = userPurchase;
	}
	public Date getDatePurchase() {
		return datePurchase;
	}
	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}
	
	public String getCategoryPurchase() {
		return categoryPurchase;
	}
	public void setCategoryPurchase(String categoryPurchase) {
		this.categoryPurchase = categoryPurchase;
	}
	public Purchase(String itemPurchase, int costPurchase, String userPurchase, Date datePurchase, String categoryPurchase) {
		this.itemPurchase = itemPurchase;
		this.costPurchase = costPurchase;
		this.userPurchase = userPurchase;
		this.datePurchase = datePurchase;
		this.categoryPurchase = categoryPurchase;
	}
	public Purchase() {

	}
	@Override
	public String toString() {
		return "Purchase [idPurchase=" + idPurchase + ", itemPurchase=" + itemPurchase + ", costPurchase="
				+ costPurchase + ", userPurchase=" + userPurchase + ", datePurchase=" + datePurchase
				+ ", categoryPurchase=" + categoryPurchase + "]";
	}
	
	
	
	
	

}
