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
	
	@Test
	public void whenOneMemberAddedCountShouldBeOne() {
		Membership subject = new Membership();
		
		subject.enroll("bob", "bob@abc.com");
		
		assertEquals(1, subject.enrollmentCount());
				 
	}
	@Test
	public void whenMemberRetrievedByMemberThenMemberAttributesShouldMatch() {
		Membership subject = new Membership();

		subject.enroll("bob", "bob@abc.com");
		
		assertEquals("bob@abc.com", subject.getEmail("bob"));
				 
	}
	@Test
	public void whenTwoMembersAddedThenRetrieveMemberAttributeShouldMatch() {
		Membership subject = new Membership();

		subject.enroll("bob", "bob@abc.com");
		subject.enroll("sue", "bob@abc.com");
		
		assertEquals("bob@abc.com", subject.getEmail("sue"));
		assertEquals("bob@abc.com", subject.getEmail("bob"));
				 
	}
	
	@Test
	public void givenAnExistingMemberIdWhenMemberWithMatchingIdIsEnrolledThenTheyAreNotAdded() {
		Membership subject = new Membership();

		subject.enroll("bob", "bob@abc.com");
		subject.enroll("sue", "bob@abc.com");
		
		assertEquals("bob@abc.com", subject.getEmail("sue"));
		assertEquals("bob@abc.com", subject.getEmail("bob"));
				 
	}
}
