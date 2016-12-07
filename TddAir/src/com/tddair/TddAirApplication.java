package com.tddair;


public class TddAirApplication {
	// add comment
	private FlightDao flights = new FlightDao();
	private Memberships memberships = new Memberships();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
	
	public boolean registerMember(String userID, String email)
	{
		return memberships.addMember(userID, email);
	}
	
	public void addMemberMiles(String userID, int miles)
	{
		memberships.addMemberMiles(userID, miles);
	}
	
	public Status getMemberStatus(String userID)
	{
		return memberships.getMemberStatus(userID);
	}
	
	public void bookFlight(String userID, String flight)
	{
		memberships.bookFlight(userID, flights.getFlightBy(flight));
	}
	
	public void yearOver()
	{
		memberships.yearOver();
	}
	
	public int getMemberMiles(String userID)
	{
		return memberships.getMemberMiles(userID);
	}
	
	public int getMemberCurrentMiles(String userID)
	{
		return memberships.getMemberCurrentMiles(userID);
	}
	
	public void setMemberStatus(String user, String status)
	{
		memberships.setMemberStatus(user, status);
	}
	
	public int buyUpgrades(String user, int count)
	{
		return memberships.buyUpgrades(user, count);
	}
	
	public int getUpgrades(String user)
	{
		return memberships.getUpgrades(user);
	}
}
