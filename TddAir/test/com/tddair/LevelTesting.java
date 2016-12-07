package com.tddair;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LevelTesting {
	
	String username = "bob";
	String email = "bob@abc.com";

	@Before
	public void setUp() throws Exception{
		
	}
	
	@Test 
	public void whenMemberIsRedAndGainsToStayRed() {
		Membership subject = new Membership();
		String currentStatus = "Green";
		int points = 35000;
		int milesFlown = 4000;
        subject.registerCurrent(username, email, currentStatus, points);
    	boolean success = subject.addMileage(username, milesFlown);
    	assertTrue(success);
        success = subject.downgradeMemberStatus(username);
        String status = subject.getLevel(username);
        assertEquals("Red", status);
        assertEquals(subject.getMileage(username),0);
        assertEquals(subject.getPoints(username), points + milesFlown);
	}
}
