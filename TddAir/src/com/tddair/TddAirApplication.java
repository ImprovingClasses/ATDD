package com.tddair;


public class TddAirApplication {
	
	private FlightProvider flights;
	private MembershipManagementCollection membershipCollection = new MembershipManagementCollection();
	
	//The default Constructor is provided for the Classroom only 
	//to give easy starter file for TddAirApplication
	//Not classroom code would not make TddAirApplication dependent on a concrete FlightProvider
	//and instead would use the other constructor to pass in the FlightProvider
	//Otherwise violates open/close, and dependency inversion principles
	TddAirApplication() {
        this.flights = new FlightDao();
    }
    
	public TddAirApplication( FlightProvider flights) {
	    this.flights = flights;
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
	
	public boolean enroll(String identifier, String email) {
	    return membershipCollection.enroll(identifier, email);
	}
	
	public Member getMember(String identifier){
	    return membershipCollection.getMember(identifier);
	}

    public void addMemberFlightMiles(String identifier, int miles) {
        membershipCollection.addMemberFlightMiles(identifier, miles);
        
    }

    public String getStatusFor(String identifier) {
        return membershipCollection.getStatusFor(identifier);
    }

    public int getMilesFor(String identifier) {
        return membershipCollection.getMilesFor(identifier);
    }

    void setMemberStatus(String identifier, String status) {
        membershipCollection.setMemberStatus(identifier, status);
        
    }

    public void yearExpires() {
        membershipCollection.yearExpires();
    }
}
