package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
	
	// note that this test is not represented in the feature file -- Too much an edge case to go there.
	@Test
	public void whenOnlyEmailEnteredRecordAllEmailsAnyway(){
		Membership subject = new Membership();
		
		subject.enroll("bob", "bob@abc.com");
		subject.enroll("", "joe@abc.com");
		subject.enroll("", "sue@abc.com");
	
		assertTrue(subject.isEmailRecorded("sue@abc.com"));
		assertTrue(subject.isEmailRecorded("joe@abc.com"));
		assertFalse(subject.isEmailRecorded("bob@abc.com"));
	}
	
	// nulls should never be sent to the class  -- just throw if they are.
	@Test(expected=IllegalArgumentException.class)
	public void whenIdentifierNull(){
		Membership subject = new Membership();
		
		subject.enroll(null, "bob@abc.com");
	}

	@Test(expected=IllegalArgumentException.class)
	public void whenEmailNull(){
		Membership subject = new Membership();
		subject.enroll("bob", null);
	}
	
	
	@Test
	public void whenExistingMemberIdentifierIsUsedThenDontAddMember(){
		Membership subject = new Membership();
		subject.enroll("bob", "bob@abc.com");
		assertFalse( subject.enroll("bob", "sue@abc.com"));
		
	}
	
}
