package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private Membership membership = new Membership();
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
	
	public Boolean addMember(String userId, String emailAddress){
		return membership.addMember(new Member(userId, emailAddress));
	}
}
