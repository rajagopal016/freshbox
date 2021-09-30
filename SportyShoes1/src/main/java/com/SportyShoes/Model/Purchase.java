package com.SportyShoes.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPurchase;
	private int itemPurchase;
	private int costPurchase;
	private int userPurchase;
	private Date datePurchase;
	
	public Purchase(int itemPurchase, int costPurchase, int userPurchase, Date datePurchase) {
		//this.idPurchase = idPurchase;
		this.itemPurchase = itemPurchase;
		this.costPurchase = costPurchase;
		this.userPurchase = userPurchase;
		this.datePurchase = datePurchase;
	}

	public Purchase() {
	}

	public int getIdPurchase() {
		return idPurchase;
	}

	public void setIdPurchase(int idPurchase) {
		this.idPurchase = idPurchase;
	}

	public int getItemPurchase() {
		return itemPurchase;
	}

	public void setItemPurchase(int itemPurchase) {
		this.itemPurchase = itemPurchase;
	}

	public int getCostPurchase() {
		return costPurchase;
	}

	public void setCostPurchase(int costPurchase) {
		this.costPurchase = costPurchase;
	}

	public int getUserPurchase() {
		return userPurchase;
	}

	public void setUserPurchase(int userPurchase) {
		this.userPurchase = userPurchase;
	}

	public Date getDatePurchase() {
		return datePurchase;
	}

	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}

	@Override
	public String toString() {
		return "Purchase [idPurchase=" + idPurchase + ", itemPurchase=" + itemPurchase + ", costPurchase="
				+ costPurchase + ", userPurchase=" + userPurchase + ", datePurchase=" + datePurchase + "]";
	}
	
	
	
	
	
	

}
