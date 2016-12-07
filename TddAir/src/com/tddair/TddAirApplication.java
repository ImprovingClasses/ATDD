package com.tddair;


public class TddAirApplication {
	private Membership mbr = new Membership();
	private FlightDao flights = new FlightDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}
	
	public void addFlight(Flight flt) {
		flights.addFlight(flt);
	}
	
	 public Flight getFlight( String flightNum ) {
		return flights.getFlightBy(flightNum);
	}
	
    public void recalculateUserStatus( String userId ){
    	mbr.recalculateUserStatus( userId );
    }
	public boolean registerTraveller(String userId, String email, int miles){
		System.out.println( "registerTraveller; user " + userId + " with email " + email + " and miles " + miles + " added" );
		return mbr.addMember(userId,email, miles);
	}
	
	public boolean registerTraveller(String userId, 
			            String email, int miles, int points, String initStatus){
		System.out.println( "registerTraveller; user " + userId + " with email " + email + " and miles " + miles + " added" );
		return mbr.addMember(userId,email, miles, points, initStatus);
	}
	
	public void addTravelMiles(String userId, int miles){
		System.out.println( "addTravelMiles; user " + userId + " miles " + miles + " added" );
		mbr.addTravelMiles(userId, miles);
	}
	
	public String getRewardLevel(String userId){
		String retVal = mbr.getRewardLevel(userId);
		System.out.println( "getRewardLevel; user " + userId + " has reward level " + retVal );
		return retVal;
	}
	
	public String getStatus(String userId){
		return mbr.getMemberStatus(userId);
	}
	public int getUserMiles(String userId){
		return mbr.getMemberMiles(userId);
	}
	
	public boolean isMember(String userId){
		return mbr.isMember(userId);
	}
}
