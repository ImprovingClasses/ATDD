package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class FlightDao {

	private Map<String, Flight> flights = new HashMap<>();
	
	public FlightDao() {
		addFlight("DFW", "ORD", 924, "AA", 242);
		addFlight("LGA", "CDG", 3620, "AF", 38);
		addFlight("LAX", "SYD", 7490, "QF", 191);
		addFlight("DFW", "ALB", 1000, "TD", 100);
		addFlight("ALB", "LAX", 2000, "TD", 200);
	}
	
	public Flight getFlightBy(String flightNumber) {
		return flights.get(flightNumber);
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		Flight flight = new Flight(origin, destination, mileage, airline, number);
		flights.put(flight.getFullFlightNumber(), flight);
	}
}
