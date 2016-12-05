package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

import cucumber.api.java.Before;

public class RegisterNewMembers {

	private Membership cut = null;

	@Before
	public void setUp() {
		Membership cut = new Membership();
	}


	@Test
	public void whenNoMembershipCountIsZero() {
		Membership subject = new Membership();
		assertEquals (0, subject.enrollmentCount());
	}

}
