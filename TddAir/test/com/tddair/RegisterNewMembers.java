package com.tddair;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import cucumber.api.java.Before;

public class RegisterNewMembers {

	//private Membership cut = null;

	@Before
	public void setUp() {
		//Membership cut = new Membership();
	}


	@Test
	public void whenNoMembershipCountIsZero() {
		Membership subject = new Membership();
		assertEquals (0, subject.enrollmentCount());
	}
	
	@Test
	public void whenOneMemberCountShouldBeOne() {
		Membership subject = new Membership();
		subject.addNewMember("bob","bob@abc.com");
		assertEquals(1, subject.enrollmentCount());
	}

	@Test
	public void whenMemberRetrievedByMemberThenMemberAttributesShouldMatch() {
		Membership subject = new Membership();
		subject.addNewMember("bob","bob@abc.com");
		ArrayList<Member> memberList = subject.getMember("bob@abc.com");
		
		assertEquals(1, subject.enrollmentCount());
	}

}
