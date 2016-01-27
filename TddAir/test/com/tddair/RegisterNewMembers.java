package com.tddair;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
	
}
