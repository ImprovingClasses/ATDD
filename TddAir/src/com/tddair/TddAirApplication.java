package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = null;
	private MemberShip membership = null;
	
	public TddAirApplication() {
		flights = new FlightDao();
		membership = new MemberShip();
	}
	
	public String registerMember(String userId, String emailAddress) {
		return membership.addNewMember(userId, emailAddress);
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
}
