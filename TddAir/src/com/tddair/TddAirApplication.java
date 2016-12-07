package com.tddair;

import java.util.List;

public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private Membership membership = new Membership();
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline) {
		flights.addFlight(origin, destination, mileage, airline);
	}
	
	public Flight getFlight(String flightNumber){
		return flights.getFlightBy(flightNumber);
	}
	
	public Boolean addMember(String userId, String emailAddress, int miles){
		return membership.addMember(new Member(userId, emailAddress, miles));
	}
	
	public Member getMember(String userId)throws Exception{
		return membership.getMemberById(userId);
	}
	
	public void updateMember(String userId, List<Flight> flightPlan) throws Exception{
		membership.updateMember(userId, flightPlan);
	}
	
	public void updateMember(String userId, Flight flightId) throws Exception{
		membership.updateMember(userId, flightId);
	}
}
