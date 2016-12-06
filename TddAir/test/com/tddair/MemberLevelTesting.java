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
	@Test 
	public void whenNewMemberFliesFiveHundredMiles() {
		Membership subject = new Membership();
		subject.enroll("bob", "bob@abc.com");
		subject.addMileage("bob", 500);
		String level = subject.getLevel("bob");
		assertEquals( "Red", level);
	}
	@Test 
	public void whenMemberNewMemberGoesGolden() {
		Membership subject = new Membership();
		subject.enroll("bob", "bob@abc.com");
		subject.addMileage("bob", 75000);
		String level = subject.getLevel("bob");
		assertEquals( "Golden", level);
	}
	@Test 
	public void whenMemberNewMemberFlies49999() {
		Membership subject = new Membership();
		subject.enroll("bob", "bob@abc.com");
		subject.addMileage("bob", 49999);
		String level = subject.getLevel("bob");
		assertEquals( "Green", level);
	}
	@Test 
	public void whenMemberNewMemberFlies74999() {
		Membership subject = new Membership();
		subject.enroll("bob", "bob@abc.com");
		subject.addMileage("bob", 74999);
		String level = subject.getLevel("bob");
		assertEquals( "Blue", level);
	}
	@Test 
	public void whenExistingMemberGoesFromRedToGreen() {
		Membership subject = new Membership();
		subject.enroll("bob", "bob@abc.com");
		subject.addMileage("bob", 24999);
		String level = subject.getLevel("bob");
		assertEquals( "Red", level);
		subject.addMileage("bob", 13000);
		level = subject.getLevel("bob");
		assertEquals( "Green", level);
	}

}
