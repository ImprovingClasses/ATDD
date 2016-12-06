package com.tddair;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestMemebership {

	@Test
	public void initialmembershipCountShouldBeZero(){
		Membership members =  new Membership();
		assertEquals("Test successful count 0", 0, members.getMembershipCount());
	}
	
	@Test
	public void whenOneMemberAddedCountShouldBeOne(){
		Membership members = new Membership();
		members.addNewMember("bob", "bob@abc.com");
		assertEquals("Test successful count 1",  1, members.getMembershipCount());
	}

	@Test
	public void whenMemberRetreavedByMemberThenMemberAttributesShouldMatch(){
		Membership members = new Membership();
		members.addNewMember("bob", "bob@abc.com");
		Member m = members.getById("bob");
		assertEquals("Test successful member match",  "bob", m.getId());
		assertEquals("Test successful email match", "bob@abc.com", m.getEmail());
		Member n = members.getByEmail("bob@abc.com");
		assertEquals("Test successful member match",  "bob", n.getId());
		assertEquals("Test successful email match", "bob@abc.com", n.getEmail());
	}
	
	@Test
	public void whenTwoMembersAddedThenRetrieveMemberAttributesShouldMatch(){
		Membership members = new Membership();
		members.addNewMember("bob", "bob@abc.com");
		members.addNewMember("Sue", "sue@abc.com");
		Member bob1 = members.getById("bob");
		Member bob2 = members.getByEmail("bob@abc.com");
		assertEquals("Test successful member match", "bob", bob1.getId());
		assertEquals("Test successful email match", "bob@abc.com", bob1.getEmail());
		assertEquals("Test successful member match", "bob", bob2.getId());
		assertEquals("Test successful email match", "bob@abc.com", bob2.getEmail());
		Member sue1 = members.getByEmail("sue@abc.com");
		Member sue2 = members.getByEmail("sue@abc.com");
		assertEquals("Test successful member match", "Sue", sue1.getId());
		assertEquals("Test successful email match", "sue@abc.com", sue1.getEmail());
		assertEquals("Test successful member match", "Sue", sue2.getId());
		assertEquals("Test successful email match", "sue@abc.com", sue2.getEmail());
	}
	
}
