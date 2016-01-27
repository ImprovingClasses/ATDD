package com.tddair;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RegisterNewMembers {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void whenNoMembershipCountIsZero() {
		Membership subject = new Membership();
		
		assertEquals( 0,  subject.enrollmentCount());
	}

}
