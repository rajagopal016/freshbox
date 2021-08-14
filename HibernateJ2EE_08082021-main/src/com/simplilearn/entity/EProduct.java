package com.simplilearn.entity;

public class EProduct {
	private int id;
	private String name;
	private Double price;
	
	public EProduct() {
	}
	
	public EProduct( String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
