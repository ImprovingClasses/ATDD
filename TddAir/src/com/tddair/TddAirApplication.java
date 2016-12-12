package com.tddair;


public class TddAirApplication {
	
	private FlightProvider flights;
	
	
	//The default Constructor is provided for the Classroom only 
	//to give easy starter file for TddAirApplication
	//Better code would not make TddAirApplication dependent on a concrete FlightProvider
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
}
