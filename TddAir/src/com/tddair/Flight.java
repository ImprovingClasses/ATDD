package com.tddair;


public class Flight {
	
	private String flightNumber;
	private int mileage;

	public Flight(String flightNumber, int mileage) {
		
		this.flightNumber = flightNumber;
		this.mileage = mileage;
		
	}	
	
	public String getFlightNumber() {
		return flightNumber;
	}

	public int getMileage() {
		return mileage;
	}
	
}
