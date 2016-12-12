package com.tddair;

import java.util.HashMap;
import java.util.Map;

/*This class represents a provider that goes over the network to a database
 * The Sleeps represent the latency of these calls
 * For this class, anything retrieving flights must include a sleep to 
 * simulate the time needed to connect to the database.
 * 
 * Do change the default data set up in the constructor to represent changing information in the database.
 * 
 * Do implement a faster FlightProvider interface to use in your unit tests. 
 * Your new implementation need not include the sleeps 
 */

public class FlightDao implements FlightProvider {

	private Map<String, Flight> flights = new HashMap<>();
	
	public FlightDao() {
		addFlight("DFW", "ORD", 924, "AA", 242);
		addFlight("LGA", "CDG", 3620, "AF", 38);
		addFlight("LAX", "SYD", 7490, "QF", 191);
	}

	@Override
    public Flight getFlightBy(String flightNumber) {
	    
	    try {
	        // do not modify this sleep; Remove it in a test double you create for your unit tests.
	        Thread.sleep(200);
        } catch (InterruptedException e) {}

	    
	    return flights.get(flightNumber);
	}

	@Override
    public void addFlight(String origin, String destination, int mileage, String airline, int number) {
	    try {
	        //do not modify this sleep; Remove it in a test double you create for your unit tests.
            Thread.sleep(50);
        } catch (InterruptedException e) {}
	    
	    
	    Flight flight = new Flight(origin, destination, mileage, airline, number);
		flights.put(flight.getFullFlightNumber(), flight);
	}
}
