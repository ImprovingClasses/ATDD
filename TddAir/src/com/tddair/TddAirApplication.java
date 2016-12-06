package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
	
	public boolean addNewMembers(String username, String email)
	{
		return membership_.enroll(username, email);
	}
	private Membership membership_ = new Membership();
	
}
