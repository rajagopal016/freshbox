package com.simplilearn.phase3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class EProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProducts")
	private int idProducts;
	@Column(name="nameProducts")
	private String nameProducts;
	@Column(name="categoryProducts")
	private String categoryProducts;
	@Column(name="priceProducts")
	private int priceProducts;
	@Column(name="availabilityProducts")
	private int availabilityProducts;
		
	public EProduct() {

	}
		
	public EProduct(String nameProducts, String categoryProducts, int priceProducts, int availabilityProducts) {
		//this.idProducts = idProducts;
		this.nameProducts = nameProducts;
		this.categoryProducts = categoryProducts;
		this.priceProducts = priceProducts;
		this.availabilityProducts = availabilityProducts;
	}

	public int getIdProducts() {
		return idProducts;
	}
	public void setIdProducts(int idProducts) {
		this.idProducts = idProducts;
	}
	public String getNameProducts() {
		return nameProducts;
	}
	public void setNameProducts(String nameProducts) {
		this.nameProducts = nameProducts;
	}
	public String getCategoryProducts() {
		return categoryProducts;
	}
	public void setCategoryProducts(String categoryProducts) {
		this.categoryProducts = categoryProducts;
	}
	public int getPriceProducts() {
		return priceProducts;
	}
	public void setPriceProducts(int priceProducts) {
		this.priceProducts = priceProducts;
	}
	public int getAvailabilityProducts() {
		return availabilityProducts;
	}
	public void setAvailabilityProducts(int availabilityProducts) {
		this.availabilityProducts = availabilityProducts;
	}

	@Override
	public String toString() {
		return "Product [idProducts=" + idProducts + ", nameProducts=" + nameProducts + ", categoryProducts="
				+ categoryProducts + ", priceProducts=" + priceProducts + ", availabilityProducts="
				+ availabilityProducts + "]";
	}
	
	
}
