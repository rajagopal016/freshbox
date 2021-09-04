package com;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="booking")

public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="pnrBooking")
	private int pnr;
	@Column(name="userIdBooking")
	private int userId;
	@Column(name="passengerName")
	private String passengerName;
	@Column(name="passengerAge")
	private int age;
	@Column(name="foodOpted")
	private String foodchoice;
	@Column(name="flightIdBooking")
	private int flightId;
	@Column(name="airlineIdBooking")
	private int airlineId;
	@Column(name="dateOfJourney")
	private Date doj;
	@Column(name="numberOfPassengers")
	private int numberOfPassengers;
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFoodchoice() {
		return foodchoice;
	}
	public void setFoodchoice(String foodchoice) {
		this.foodchoice = foodchoice;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public Booking(int pnr, int userId, String passengerName, int age, String foodchoice, int flightId, int airlineId,
			Date doj, int numberOfPassengers) {
		super();
		this.pnr = pnr;
		this.userId = userId;
		this.passengerName = passengerName;
		this.age = age;
		this.foodchoice = foodchoice;
		this.flightId = flightId;
		this.airlineId = airlineId;
		this.doj = doj;
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public Booking() {

	}
	@Override
	public String toString() {
		return "Booking [pnr=" + pnr + ", userId=" + userId + ", passengerName=" + passengerName + ", age=" + age
				+ ", foodchoice=" + foodchoice + ", flightId=" + flightId + ", airlineId=" + airlineId + ", doj=" + doj
				+ ", numberOfPassengers=" + numberOfPassengers + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
