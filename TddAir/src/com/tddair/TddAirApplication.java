package com.tddair;


public class TddAirApplication {
	
	private FlightProvider flights;
	private MembershipManagmentCollection membershipCollection = new MembershipManagmentCollection();
	
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

    public void addMemberFlight(String identifier, int miles) {
        // TODO Auto-generated method stub
        
    }

    public String getStatusFor(String identifier) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object getMilesFor(String identifier) {
        // TODO Auto-generated method stub
        return null;
    }
}
