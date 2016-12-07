package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = null;
	private MemberShip membership = null;
	
	public TddAirApplication() {
		flights = new FlightDao();
		membership = new MemberShip(flights);
	}
	
	public String registerMember(String userId, String emailAddress) {
		return membership.addNewMember(userId, emailAddress);
	}
	
	public String registerMember(String userId, String emailAddress, int initialMiles) {
		return membership.addNewMember(userId, emailAddress, initialMiles);
	}
	
	public void addMileage(String userId, int mileage) {
		membership.addMileage(userId, mileage);
	}
	
	public String getMemberStatus(String userId) {
		return membership.getMemberStatus(userId);
	}
	
	public int getMemberMileage(String userId) {
		return membership.getMemberMileage(userId);
	}
	
	public void addFlight(String origin, String destination, int mileage, String flightNumber) {
		flights.addFlight(origin, destination, mileage, flightNumber);
	}
	
	public int getFlightMileage(String flightName) {
		return flights.getFlightMileage(flightName);
	}
	
	public void userTakesFlight(String userId, String flightName) {
		membership.userTakesFlight(userId, flightName);
	}
}
