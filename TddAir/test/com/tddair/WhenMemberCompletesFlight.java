package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class WhenMemberCompletesFlight {

	private TddAirApplication app;
	private Member member;

	@Before
	public void setup() {
		app = new TddAirApplication();
		app.enroll("bob", "bob@abc.com");
		app.addFlight("DFW", "DFW", 25000, "TEST", 25000);
		member = app.lookupMember("bob");
	}

	@Test 
	public void shouldStartRed(){
		assertEquals(Status.Red, member.getStatus());
	}
	
	@Test
	public void shouldGoFromRedToGreen() {
		app.completeFlight("bob", "TEST25000");
		assertEquals(Status.Green, member.getStatus());
	}

	@Test
	public void shouldGoFromGreenToBlue() {
		app.completeFlight("bob", "TEST25000");
		app.completeFlight("bob", "TEST25000");
		assertEquals(Status.Blue, member.getStatus());
	}

	@Test
	public void shouldGoFromBlueToGold() {
		app.completeFlight("bob", "TEST25000");
		app.completeFlight("bob", "TEST25000");
		app.completeFlight("bob", "TEST25000");
		assertEquals(Status.Gold, member.getStatus());
	}

}
