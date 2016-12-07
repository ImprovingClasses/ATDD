package com.tddair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void testStatusFlights() {
		Member member = new Member("Bob", "bob@abc.com", 24000);
		Membership membership = new Membership();
		membership.add(member);
		List<Flight> uFlights = new ArrayList<Flight>();
		Flight flight1 = new Flight ("DFW", "ALB", 1000, "TD", 100);
		
		Flight flight2 = new Flight ("ALB", "LAX", 2000, "TD", 100);
		uFlights.add(flight1);
		uFlights.add(flight2);
		Status status = Membership.Status.Green;
		membership.userFlightMiles(member.getUserID(), uFlights);
		assertEquals(membership.membershipLevel(member), status);
	}
	
	@Test
	public void testStatusFlightsGold() {
		Member member = new Member("Bob", "bob@abc.com", 74000);
		Membership membership = new Membership();
		membership.add(member);
		List<Flight> uFlights = new ArrayList<Flight>();
		Flight flight1 = new Flight ("DFW", "ALB", 1000, "TD", 100);
		
		Flight flight2 = new Flight ("ALB", "LAX", 2000, "TD", 100);
		uFlights.add(flight1);
		uFlights.add(flight2);
		Status status = Membership.Status.Gold;
		membership.userFlightMiles(member.getUserID(), uFlights);
		assertEquals(membership.membershipLevel(member), status);
	}
	
	@Test
	public void testStatusFlightsRed() {
		Member member = new Member("Bob", "bob@abc.com", 4000);
		Membership membership = new Membership();
		membership.add(member);
		List<Flight> uFlights = new ArrayList<Flight>();
		Flight flight1 = new Flight ("DFW", "ALB", 1000, "TD", 100);
		
		Flight flight2 = new Flight ("ALB", "LAX", 2000, "TD", 100);
		uFlights.add(flight1);
		uFlights.add(flight2);
		Status status = Membership.Status.Red;
		membership.userFlightMiles(member.getUserID(), uFlights);
		assertEquals(membership.membershipLevel(member), status);
	}
	

}
