package com.tddair;


public class Flight {
	
	private String origin;
	private String destination;
	private String airline;
	private int number;
	private int mileage;
	
	private String flightNumber;
	
	public Flight(String origin, String destination, int mileage, String flightNumber) {
		if(origin == null || origin.length() != 3) {
			throw new IllegalArgumentException("Invalid origin code");
		}
		if(destination == null || destination.length() != 3) {
			throw new IllegalArgumentException("Invalid destination code");
		}
		if(mileage < 100) {
			throw new IllegalArgumentException("Mileage muse be greater than 100");
		}
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.mileage = mileage;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public String getFullFlightNumber() {
		if (airline == null || number == 0) {
			return "UNKNOWN";
		}
		return airline + number;
	}
	
	public String getDestination() {
		return destination;
	}
	public String getOrigin() {
		return origin;
	}
	public int getMileage() {
		return mileage;
	}
}