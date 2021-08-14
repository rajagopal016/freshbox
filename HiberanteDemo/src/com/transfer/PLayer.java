package com.transfer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class PLayer {
	@Id
	private int id;
	private String name;
	private String team;
	private int age;
	
	public PLayer() {
		
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PLayer [id=" + id + ", name=" + name + ", team=" + team + ", age=" + age + "]";
	}

	public PLayer(int id, String name, String team, int age) {
		super();
		this.id = id;
		this.name = name;
		this.team = team;
		this.age = age;
	}

	
}
