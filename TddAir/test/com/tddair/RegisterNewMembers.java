package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RegisterNewMembers 
{
	
	MemberShip membership = null;
	
	@Before 
	public void setUp()
	{
		membership = new MemberShip();
	}
	
	@Test
	public void initialMembershipCount() {
		assertEquals(0, membership.getEnrollmentCount());
	}
	
	@Test
	public void oneMemberAdded() {
		membership = new MemberShip();
		membership.addNewMember();
		assertEquals(1, membership.getEnrollmentCount());
	}
}