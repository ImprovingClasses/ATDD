package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RegisterNewMembers {
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void whenMembershipCountIsZero() {
		Membership subject = new Membership();
		
		assertEquals( 0,  subject.enrollmentCount());
	}

	@Test
	public void whenMembershipCountIsOne(){
		Membership subject = new Membership();
		
		subject.enroll("bob", "bob@abc.com");
		
		assertEquals( 1, subject.enrollmentCount());
		
	}
	
	@Test
	public void thatRetrieveByMemberIdentifierReturnsMatch(){
		Membership subject = new Membership();
		
		subject.enroll("bob", "bob@abc.com");
		Member member = subject.getMember("bob");

		assertTrue("bob".equalsIgnoreCase( member.getIdentifier()));
		assertTrue("bob@abc.com".equalsIgnoreCase(member.getEmail()));
	}
	
}
