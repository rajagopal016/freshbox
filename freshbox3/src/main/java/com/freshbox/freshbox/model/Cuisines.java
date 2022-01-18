package com.freshbox.freshbox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_cuisines")

public class Cuisines {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Table_Cuisine_Id")
	private int Cuisine_Id;
	@Column(name="Table_Cuisine_Name")
	private String Cuisine_Name;
	public Cuisines(int cuisine_Id, String cuisine_Name) {
		Cuisine_Id = cuisine_Id;
		Cuisine_Name = cuisine_Name;
	}
	public Cuisines() {
	}
	@Override
	public String toString() {
		return "Cuisines [Cuisine_Id=" + Cuisine_Id + ", Cuisine_Name=" + Cuisine_Name + "]";
	}
}


