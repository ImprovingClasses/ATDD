package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class FlightDao {

	private Map<String, Flight> flights = new HashMap<>();
	
	public FlightDao() {
		addFlight("DFW", "ORD", 924, "AA", 242);
		addFlight("LGA", "CDG", 3620, "AF", 38);
		addFlight("LAX", "SYD", 7490, "QF", 191);
		addFlight("DAL", "LGA", 1500, "TDD", 777);
		addFlight("SAN", "KCG", 2001, "TDD", 902);
		addFlight("ORD", "AXP", 1750, "TDD", 1172);
		addFlight("LAX", "MSP", 25000, "TDD", 25000);
		addFlight("JFK", "JFK", 27000, "TDD", 1);
		addFlight("DFW", "DFW", 200, "TDD", 901);
	}
	
	public Flight getFlightBy(String flightNumber) {
		return flights.get(flightNumber);
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		Flight flight = new Flight(origin, destination, mileage, airline, number);
		flights.put(flight.getFullFlightNumber(), flight);
	}
}
