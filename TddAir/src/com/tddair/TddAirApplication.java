package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights_ = new FlightDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String flightNumber, int mileage) {
		System.out.println("Called TddAirApplication.addFlight(" + flightNumber +", " + mileage);
		flights_.addFlight(flightNumber, mileage);
	}
	
	public boolean addNewMembers(String username, String email)
	{
		return membership_.enroll(username, email);
	}
	
	public boolean addCurrentMembers(String username, String email, String currentStatus, int points)
	{
		return membership_.registerCurrent(username, email, currentStatus, points);
	}
	
	public boolean addMileageToMember(String username, int mileage)
	{
		return membership_.addMileage(username, mileage);
	}
	
	public String getMemberLevel(String username)
	{
		return membership_.getLevel(username);
	}
	public boolean addFlightMileage(String username, String flightNumber){
		
		int mileage = flights_.getMileage(flightNumber);
		return membership_.addFlightMileage(username, flightNumber, mileage);
	}
	
	public int getMileage(String username)
	{
		return membership_.getMileage(username);
	}
	private Membership membership_ = new Membership();
	
	public boolean downgradeMemberStatus(String username)
	{
		return membership_.downgradeMemberStatus(username);
	}
	
	public String getMemberStatus(String username)
	{
		return membership_.getLevel(username);
	}
	
	public int getMemberPoints(String username)
	{
		return membership_.getPoints(username);
	}
	
}
