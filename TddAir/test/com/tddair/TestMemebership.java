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
}
