package com.tddair;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

	List <FlightData> flights = new ArrayList <FlightData>();
	
	public void addFlight(FlightData flight){
		flights.add(flight);
	}
	
	public FlightData getFlight(String flightId) {
    	for (FlightData flight: flights) {
    		if (flight.getNumber().equals(flightId)){
    			return flight;
    		}
    	}
    	return null;
    }
}
