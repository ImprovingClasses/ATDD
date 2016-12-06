package com.tddair;

//this is an update
// THis is another update
public class Flight {

	private String origin;
	private String destination;
	private String airline;
	private String flightNumber;
	private int number;
	private int mileage;

	public Flight(String origin, String destination, int mileage, String airline, int number) {
		if (origin == null || origin.length() != 3) {
			throw new IllegalArgumentException("Invalid origin code");
		}
		if (destination == null || destination.length() != 3) {
			throw new IllegalArgumentException("Invalid destination code");
		}
		if (mileage < 100) {
			throw new IllegalArgumentException("Mileage muse be greater than 100");
		}
		this.origin = origin;
		this.destination = destination;
		this.mileage = mileage;
		this.airline = airline;
		this.number = number;
	}

	public Flight(String origin, String destination, int mileage) {
		this(origin, destination, mileage, null, 0);
	}

	public Flight(String flightNumber, int mileage) {
		this.mileage = mileage;
		this.flightNumber = flightNumber;
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
