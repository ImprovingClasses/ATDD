package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlightCalculations {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void retrieveFullFlightInformation() {
		
		TddAirApplication app = new TddAirApplication();
		
		Flight flight = app.getFlight("AA242");
		String result  = flight.getFullFlightInfo();
		assertTrue ("| AA242 | DFW-ORD | 924 |".equals(result));
		

	}

}
