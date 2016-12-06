package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class FlightDao {

	private Map<String, Flight> flights = new HashMap<>();
	
	public FlightDao() {
		//addFlight("DFW", "ORD", 924, "AA", 242);
		//addFlight("LGA", "CDG", 3620, "AF", 38);
		//addFlight("LAX", "SYD", 7490, "QF", 191);
	}
	
	public Flight getFlightBy(String flightNumber) {
		return flights.get(flightNumber);
	}
	
	public void addFlight(String flightNumber, int mileage) {
		Flight flight = new Flight(flightNumber, mileage);
		flights.put(flightNumber, flight);
	}
	
	public int getMileage(String flightNumber)
	{
		Flight flight = flights.get(flightNumber);
		return flight.getMileage();
	}
}
