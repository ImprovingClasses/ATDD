package com.tddair;


public class TddAirApplication {
	// add comment
	private FlightDao flights = new FlightDao();
	private Membership membership = new Membership();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
	
	public boolean registerMember(String userID, String email)
	{
		return membership.addMember(userID, email);
	}
}
