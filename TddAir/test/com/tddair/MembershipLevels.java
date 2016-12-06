package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import com.tddair.Membership.Status;

public class MembershipLevels {
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNumMilesZero() {
		Member member = new Member();
		assertEquals(0, member.getMiles());
	}
	
	
	@Test
	public void testNumMilesBlue() {
		Member member = new Member("Bob", "bob@abc.com", 60000);
		assertEquals(60000, member.getMiles());
	}
	
	@Test
	public void testStatusGold() {
		Member member = new Member("Bob", "bob@abc.com", 80000);
		Membership membership = new Membership();
		membership.add(member);
		Status status = Membership.Status.Gold;
		assertEquals(membership.membershipLevel(member), status);
	}
	
	@Test
	public void testStatusBlue() {
		Member member = new Member("Bob", "bob@abc.com", 60000);
		Membership membership = new Membership();
		membership.add(member);
		Status status = Membership.Status.Blue;
		assertEquals(membership.membershipLevel(member), status);
	}
	
	@Test
	public void testStatusRed() {
		Member member = new Member("Bob", "bob@abc.com", 10000);
		Membership membership = new Membership();
		membership.add(member);
		Status status = Membership.Status.Red;
		assertEquals(membership.membershipLevel(member), status);
	}
	
	@Test
	public void testStatusGreen() {
		Member member = new Member("Bob", "bob@abc.com", 30000);
		Membership membership = new Membership();
		membership.add(member);
		Status status = Membership.Status.Green;
		assertEquals(membership.membershipLevel(member), status);
	}

}
