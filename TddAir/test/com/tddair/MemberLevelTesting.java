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

	@Test 
	public void whenMemberNewMemberGoesGreen() {
		Membership subject = new Membership();
		subject.enroll("bob", "bob@abc.com");
		subject.addMileage("bob", 25000);
		String level = subject.getLevel("bob");
		assertEquals( "Green", level);
	}

	@Test 
	public void whenMemberNewMemberGoesBlue() {
		Membership subject = new Membership();
		subject.enroll("bob", "bob@abc.com");
		subject.addMileage("bob", 50000);
		String level = subject.getLevel("bob");
		assertEquals( "Blue", level);
	}

}
