package com.tddair;

public class FlightData {

	String number; // flight number
	int miles;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String flightId) {
		this.number = flightId;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public FlightData(String number, int miles){
		this.number = number;
		this.miles = miles;
	}
	
	
}
