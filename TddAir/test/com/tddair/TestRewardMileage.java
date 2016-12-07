package com.tddair;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestRewardMileage {

	@Test
	public void initialMilesCheck(){
		Membership members =  new Membership();
		members.addNewMember("bob", "bob@abc.com");
		assertEquals("Test successful initial miles 0", 0, members.getById("bob").getTotalMiles());
		members.addNewMember("john", "john@abc.com",10000);
		assertEquals("Test successful initial miles 10000", 10000,members.getById("john").getTotalMiles());
	}
	
	@Test
	public void initialStatusCheck(){
		Membership members = new Membership();
		members.addNewMember("bob", "bob@abc.com");
		assertEquals("Test successful initial miles ", "Red", members.getById("bob").calcStatus());
		members.addNewMember("john", "john@abc.com",10000);
		assertEquals("Test successful initial miles 10000", "Red",members.getById("john").calcStatus());
	}
	
	@Test
	public void addFlightMiles(){
		Membership members = new Membership();
		members.addNewMember("bob", "bob@abc.com", 10000);
		members.getById("bob").addMiles(25000);
		assertEquals("Test adding miles", 35000, members.getById("bob").getTotalMiles());
		assertEquals("Test transition from red to green", "Green", members.getById("bob").calcStatus());
	}
	
	
}