package com.tddair;


public class TddAirApplication {
	private Membership mbr = new Membership();
	private FlightDao flights = new FlightDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
	
	public boolean registerTraveller(String userId, String email){
		return mbr.addMember(userId,email);
	}
	
	public boolean isMember(String userId){
		return mbr.isMember(userId);
	}
}
