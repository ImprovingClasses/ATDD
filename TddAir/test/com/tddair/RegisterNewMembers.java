package com.tddair;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RegisterNewMembers {
	@Before
	public void setUp() throws Exception{
		
	}
	
	@Test 
	public void whenNoMembershipCountIsZero() {
		Membership subject = new Membership();
		
		assertEquals( 0, subject.enrollmentCount());
	}
	
	public void whenOneMemberAddedCountShouldBeOne() {
		Membership subject = new Membership();
		
		subject.enroll("bob", "bob@abc.com");
		
		assertEquals(1, subject.enrollmentCount());
				 
	}

}
