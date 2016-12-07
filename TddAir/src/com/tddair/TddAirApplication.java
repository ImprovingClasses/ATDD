package com.tddair;

import java.util.List;

public class TddAirApplication {
	
//	private FlightDao flights = new FlightDao();
	
	private FlightList flights = new FlightList();
	// Membership list variable
	private Membership members = new Membership();
	
	public TddAirApplication() {
	}

	public void addFlight(FlightData flightData) {
	    flights.addFlight(flightData);
    }
//	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
//		flights.addFlight(origin, destination, mileage, airline, number);
//	}
	
	// Get the number of members
    public int getMembershipCount()
    {
    	return members.getMembershipCount();
    }
    
    // Add a new member
    public boolean addMember(String Id, String email, int miles, String status)
    {
    	return members.addNewMember(Id, email, miles,status);
    }
    // Add a new member
    public boolean addMember(String Id, String email, int miles)
    {
    	return members.addNewMember(Id, email, miles);
    }
    
    // Add a new member
    public boolean addMember(String Id, String email)
    {
    	return members.addNewMember(Id, email);
    }
    
    // Is an ID a member
    public boolean isMember(String Id)
    {
    	return (members.getById(Id) != null) ? true : false;
    }
    
    public String addMilesToMember(String Id, int miles){
    	return members.addMilesToMember(Id, miles);

    }
    
    public String getMemberStatusById(String Id) {
    	return members.getStatusFromId(Id);
    }
    
    public int getMemberMilesById(String Id) {
    	return members.getMilesFromId(Id);
    }
    
    public FlightData getFlight(String flightId) {
    	return flights.getFlight(flightId);
    }
    
    public String sendOnFlight(String memberId, FlightData flight){
    	int tdMiles = 0;
    	if (flight.getNumber().contains("TD")) {
    		tdMiles = flight.getMiles();
    	}
    	return members.addMilesToMember(memberId, tdMiles);
    }
 // New Year update   
    public void newYearMemberUpdate(){
    	members.newYearMemberUpdate();
    }
    
    public int getMemberYTDMilesById(String Id){
    	return members.getYTDMilesFromId(Id);
    }
    
}
