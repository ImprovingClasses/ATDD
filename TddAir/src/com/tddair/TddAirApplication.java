package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private Membership subject = new Membership();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
	
	public boolean addMember(String userId, String email) {
		boolean isAdded = subject.addNewMember(userId, email);
		return isAdded;
	}
	
}
