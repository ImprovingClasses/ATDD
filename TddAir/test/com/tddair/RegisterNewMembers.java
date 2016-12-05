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
		Member testMember = new Member("testId", "test@email.com");
		membership.addNewMember(testMember);
		assertEquals(1, membership.getEnrollmentCount());
	}
	
	@Test
	public void cannotAddMemberWithInvalidEmail() {
		Member badMember = new Member("validId", "invalid@email");
		int beforeAdd = membership.getEnrollmentCount();
		membership.addNewMember(badMember);
		int afterAdd = membership.getEnrollmentCount();
		
		assertEquals(beforeAdd, afterAdd);
	}
	
	@Test
	public void cannotAddMemberWithDuplicateUserId() {
		Member badMember = new Member("testId", "test@email.com");
		int beforeAdd = membership.getEnrollmentCount();
		membership.addNewMember(badMember);
		int afterAdd = membership.getEnrollmentCount();
		
		assertEquals(beforeAdd, afterAdd);
	}
}