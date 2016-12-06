package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	
	// Membership list variable
	private Membership members = new Membership();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
	
	// Get the number of members
    public int getMembershipCount()
    {
    	return members.getMembershipCount();
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
    
}
