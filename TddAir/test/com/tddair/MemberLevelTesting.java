package com.tddair;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MemberLevelTesting {
	
	@Before
	public void setUp() throws Exception{
		
	}
	
	@Test 
	public void whenMemberIsRedAndGainsToStayRed() {
		Membership subject = new Membership();
		subject.enroll("bob", "bob@abc.com");
		subject.addMileage("bob", 24999);
		String level = subject.getLevel("bob");
		assertEquals( "Red", level);
	}

}
