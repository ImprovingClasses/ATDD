package com.tddair;

/**
 * This is our Flight object. It represents a flight.
 * @author Who knows!!
 *
 */
public class Flight {
	
	private String origin;
	private String destination;
	private String airline;
	private int mileage;

	public Flight(String origin, String destination, int mileage, String airline) {
		if(origin == null || origin.length() != 3) {
			throw new IllegalArgumentException("Invalid origin code");
		}
		if(destination == null || destination.length() != 3) {
			throw new IllegalArgumentException("Invalid destination code");
		}
		if(mileage < 100) {
			throw new IllegalArgumentException("Mileage muse be greater than 100");
		}
		this.origin = origin;
		this.destination = destination;
		this.mileage = mileage;
		this.airline = airline;
	}
	
	public Flight(String flightNumber, int miles){
		this.airline = flightNumber;
		this.mileage = miles;
	}
	public Flight(String origin, String destination, int mileage) {
		this(origin, destination, mileage, null);
	}
	
	public String getFullFlightNumber() {
		if (airline == null ) {
			return "UNKNOWN";
		}
		return airline;
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
