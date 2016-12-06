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
	
	public boolean addMileageToMember(String username, int mileage)
	{
		return membership_.addMileage(username, mileage);
	}
	
	public String getMemberLevel(String username)
	{
		return membership_.getLevel(username);
	}
	private Membership membership_ = new Membership();
	
}
