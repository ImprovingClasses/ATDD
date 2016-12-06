package com.tddair;

import java.util.ArrayList;

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
	
	public boolean addMember(String userId, String email, int startingMiles) {
		boolean isAdded = subject.addNewMember(userId, email, startingMiles);
		return isAdded;
	}
	
	public Member getMember(String userId, String email) {
		Member response = null;
		
		ArrayList<Member> members = subject.getMember(email);
		for (Member member : members) {
			if (member.getUserId().endsWith(userId)) {
				response = member;
			}
		}
		return response;
	} 
	
}
