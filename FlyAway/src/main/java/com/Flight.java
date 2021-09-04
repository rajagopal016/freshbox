package com;


import java.util.Date;
import java.time.LocalTime; // import the LocalTime class

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity()
@Table(name="flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="idFlight")
	private int idFlight;
	@Column(name="nameAirline")
	private String nameAirline;
	@Column(name="sourcePlace")
	private String sourcePlace;
	@Column(name="destinationPlace")
	private String destinationPlace;
	@Column(name="costFlight")
	private int costFlight;
	@Column(name="timeFlight")
	private int timeFlight;
	@Column(name="foodAvailability")
	private String foodAvailability;
	@Column(name="dayOfOperation")
	private int dayOfOperation;
	@Column(name="timeOfDeparture")
	private LocalTime timeOfDeparture;
	@Column(name="timeOfArrival")
	private LocalTime timeOfArrival;
	@Column(name="seatsLeft")
	private int seatsLeft;
	
	
	public Flight() {
		
	}

	public Flight(int idFlight, String nameAirline, String sourcePlace, String destinationPlace, int costFlight,
			int timeFlight, String foodAvailability, int dayOfOperation, LocalTime timeOfDeparture, LocalTime timeOfArrival,
			int seatsLeft) {
		this.idFlight = idFlight;
		this.nameAirline = nameAirline;
		this.sourcePlace = sourcePlace;
		this.destinationPlace = destinationPlace;
		this.costFlight = costFlight;
		this.timeFlight = timeFlight;
		this.foodAvailability = foodAvailability;
		this.dayOfOperation = dayOfOperation;
		this.timeOfDeparture = timeOfDeparture;
		this.timeOfArrival = timeOfArrival;
		this.seatsLeft = seatsLeft;
		
	}
	
	public int getIdFlight() {
		return idFlight;
	}
	public void setIdFlight(int idFlight) {
		this.idFlight = idFlight;
	}
	public String getNameAirline() {
		return nameAirline;
	}
	public void setNameAirline(String nameAirline) {
		this.nameAirline = nameAirline;
	}
	public String getSourcePlace() {
		return sourcePlace;
	}
	public void setSourcePlace(String sourcePlace) {
		this.sourcePlace = sourcePlace;
	}
	public String getDestinationPlace() {
		return destinationPlace;
	}
	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}
	public int getCostFlight() {
		return costFlight;
	}
	public void setCostFlight(int costFlight) {
		this.costFlight = costFlight;
	}
	public int getTimeFlight() {
		return timeFlight;
	}
	public void setTimeFlight(int timeFlight) {
		this.timeFlight = timeFlight;
	}
	public String getFoodAvailability() {
		return foodAvailability;
	}
	public void setFoodAvailability(String foodAvailability) {
		this.foodAvailability = foodAvailability;
	}
	public int getDayOfOperation() {
		return dayOfOperation;
	}
	public void setDayOfOperation(int dayOfOperation) {
		this.dayOfOperation = dayOfOperation;
	}
	public LocalTime getTimeOfDeparture() {
		return timeOfDeparture;
	}
	public void setTimeOfDeparture(LocalTime timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}
	public LocalTime getTimeOfArrival() {
		return timeOfArrival;
	}
	public void setTimeOfArrival(LocalTime timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}
	public int getSeatsLeft() {
		return seatsLeft;
	}
	public void setSeatsLeft(int seatsLeft) {
		this.seatsLeft = seatsLeft;
	}

	@Override
	public String toString() {
		return "Flight [idFlight=" + idFlight + ", nameAirline=" + nameAirline + ", sourcePlace=" + sourcePlace
				+ ", destinationPlace=" + destinationPlace + ", costFlight=" + costFlight + ", timeFlight=" + timeFlight
				+ ", foodAvailability=" + foodAvailability + ", dayOfOperation=" + dayOfOperation + ", timeOfDeparture="
				+ timeOfDeparture + ", timeOfArrival=" + timeOfArrival + ", seatsLeft=" + seatsLeft + "]";
	}
	
	

	
	}

	
	
	

