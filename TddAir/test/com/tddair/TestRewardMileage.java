package com.tddair;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestRewardMileage {

	@Test
	public void initialMilesShouldBeZero(){
		Membership members =  new Membership();
		members.addNewMember("bob", "bob@abc.com");
		assertEquals("Test successful initial miles 0", 0, members.getById("bob").getMiles());
		members.addNewMember("john", "john@abc.com",10000);
		assertEquals("Test successful initial miles 10000", 10000,members.getById("john").getMiles());
	}
}
