package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChangedStatus {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testChangedStatus() {
		Member member = new Member("Bob", "bob@abc.com", 4000);
		Membership membership = new Membership();
		membership.add(member);
		membership.getPreviousStatus();
		membership.getCurrentYearMiles();
		membership.setNextYearStatus();
	}

}
