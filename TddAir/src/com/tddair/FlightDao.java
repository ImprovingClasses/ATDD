package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class FlightDao {

	private Map<String, Flight> flights = new HashMap<>();
	
	public FlightDao() {
		addFlight("DFW", "ORD", 924, "AA242");
		addFlight("LGA", "CDG", 3620, "AF38");
		addFlight("LAX", "SYD", 7490, "QF191");
	}
	
	public Flight getFlightBy(String flightNumber) {
		return flights.get(flightNumber);
	}
	
	public int getFlightMileage(String flightNumber) {
		return getFlightBy(flightNumber).getMileage();
	}
	
	public void addFlight(String origin, String destination, int mileage, String flightNumber) {
		Flight flight = new Flight(origin, destination, mileage, flightNumber);
		flights.put(flight.getFlightNumber(), flight);
	}
}
