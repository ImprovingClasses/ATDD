package com.tddair;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestExpiringMiles {

	@Test
	public void newYearMemberMilesReset(){
		Membership members =  new Membership();
		members.addNewMember("bob", "bob@abc.com");
		members.addNewMember("john", "john@abc.com",10000);
        members.newYearMemberUpdate();
        assertEquals("Test successful NewYear miles reset", 0,members.getById("bob").getyTDMiles());	  
		assertEquals("Test successful NewYear miles reset", 0,members.getById("john").getyTDMiles());	  
	}
	
	@Test
	public void newYearStatusUpdate(){
		Membership members = new Membership();
		members.addNewMember("bob", "bob@abc.com", 10000, "Gold"); // Testing going from Gold to Blue
		members.addNewMember("sue", "sue@abc.com", 30000, "Blue"); // Testing going from Blue to Green
		members.addNewMember("andy", "andy@abc.com", 10000, "Green"); // Testing going from Green to Red
		members.addNewMember("sarah",  "sarah@abc.com", 0, "Red"); // Testing going from Red to REd
		members.addNewMember("hello", "hello@abc.com", 60000, "Blue"); // Testing staying at a status
		members.newYearMemberUpdate();
		assertEquals("Test NewYear status update", "Blue",  members.getById("bob").getStatus());
		assertEquals("Test NewYear status update", "Green", members.getById("sue").getStatus());
		assertEquals("Test NewYear status update", "Red",   members.getById("andy").getStatus());
		assertEquals("Test NewYear status update", "Red",   members.getById("sarah").getStatus());
		assertEquals("Test NewYear status update", "Blue",  members.getById("hello").getStatus());
	}

}
