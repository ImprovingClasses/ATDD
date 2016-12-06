package com.tddair;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Before;


public class MembershipTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void countMemberZero() {
		Membership member = new Membership();
		assertEquals(0, member.getEnrollmentCount());
	}
	
	@Test
	public void oneMemberAddedCountShouldBeOne(){
		Membership member = new Membership();
		
		member.add(new Member());
		assertEquals(1, member.getEnrollmentCount());
	}
	
	@Test
	public void initialEmailOnlyCountShouldBeZero(){
		Membership member = new Membership();
		assertEquals(0, member.getEnrollmentCount());
	}

}
