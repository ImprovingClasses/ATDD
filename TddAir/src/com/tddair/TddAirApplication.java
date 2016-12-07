package com.tddair;


public class TddAirApplication {
	// add comment
	private FlightDao flights = new FlightDao();
	private Membership membership = new Membership();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
	
	public boolean registerMember(String userID, String email)
	{
		return membership.addMember(userID, email);
	}
	
	public void addMemberMiles(String userID, int miles)
	{
		membership.addMemberMiles(userID, miles);
	}
	
	public String getMemberStatus(String userID)
	{
		return membership.getMemberStatus(userID);
	}
	
	public void bookFlight(String userID, String flight)
	{
		membership.bookFlight(userID, flights.getFlightBy(flight));
	}
	
	public void yearOver()
	{
		membership.yearOver();
	}
	
	public int getMemberMiles(String userID)
	{
		return membership.getMemberMiles(userID);
	}
	
	public int getMemberCurrentMiles(String userID)
	{
		return membership.getMemberCurrentMiles(userID);
	}
	
	public void setMemberStatus(String user, String status)
	{
		membership.setMemberStatus(user, status);
	}
}
