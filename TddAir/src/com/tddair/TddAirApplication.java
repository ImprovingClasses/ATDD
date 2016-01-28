package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private Membership membership = new Membership();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight getFlight(String flightNumber) {
		return flights.getFlightBy(flightNumber);
	
	}

	public void enroll(Member member) {
		membership.enroll(member);
		
	}

	public void completeFlight(String memberIdentifier, String flight) {
		Flight f = flights.getFlightBy(flight);
		int miles  = f.getMileage();
		membership.completeFlight(memberIdentifier, miles);
	}

	public void enroll(String memberIdentifier, String email) {
		membership.enroll(memberIdentifier, email);
	}

	public void enroll(String memberIdentifier, String email, int miles) {
		membership.enroll(memberIdentifier, email, miles);
		
	}
	public Member lookupMember(String memberIdentifier) {
		return membership.getMember(memberIdentifier);
	}



}
