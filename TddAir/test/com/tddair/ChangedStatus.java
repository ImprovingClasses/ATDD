package com.tddair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.tddair.Member.Status;

public class ChangedStatus {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testChangedStatus() {
		Member member = new Member("Bob", "bob@abc.com", 40000);
		Membership membership = new Membership();
		membership.add(member);
		List<Flight> uFlights = new ArrayList<Flight>();
		Flight flight1 = new Flight ("DFW", "ALB", 40000, "TD", 100);
		
		Flight flight2 = new Flight ("ALB", "LAX", 2000, "TD", 100);
		uFlights.add(flight1);
		uFlights.add(flight2);
		member.userFlightMiles( uFlights);
		//membership.getNextYearStatus("Bob");
		Status status = Member.Status.Gold;
		assertEquals(member.getNextStatus(), (status));
	}
	
	@Test
	public void testChangedStatusRed() {
		Member member = new Member("Bob", "bob@abc.com", 4000);
		Membership membership = new Membership();
		membership.add(member);
		List<Flight> uFlights = new ArrayList<Flight>();
		Flight flight1 = new Flight ("DFW", "ALB", 8000, "TD", 100);
		
		Flight flight2 = new Flight ("ALB", "LAX", 2000, "TD", 100);
		uFlights.add(flight1);
		uFlights.add(flight2);
		member.userFlightMiles( uFlights);
		//membership.getNextYearStatus("Bob");
		Status status = Member.Status.Red;
		assertEquals(member.getNextStatus(), (status));
	}
	
	@Test
	public void testChangedStatusGreen() {
		Member member = new Member("Sue", "sue@abc.com", 60000);
		Membership membership = new Membership();
		membership.add(member);
		List<Flight> uFlights = new ArrayList<Flight>();
		Flight flight1 = new Flight ("DFW", "ALB", 8000, "TD", 100);
		
		Flight flight2 = new Flight ("ALB", "LAX", 2000, "TD", 100);
		uFlights.add(flight1);
		uFlights.add(flight2);
		member.userFlightMiles( uFlights);
		//membership.getNextYearStatus("Bob");
		Status status = Member.Status.Blue;
		assertEquals(member.getNextStatus(), (status));
	}
	
	@Test
	public void testChangedStatusRedToGold() {
		Member member = new Member("Sue", "sue@abc.com", 6000);
		Membership membership = new Membership();
		membership.add(member);
		List<Flight> uFlights = new ArrayList<Flight>();
		Flight flight1 = new Flight ("DFW", "ALB", 70000, "TD", 100);
		
		Flight flight2 = new Flight ("ALB", "LAX", 2000, "TD", 100);
		uFlights.add(flight1);
		uFlights.add(flight2);
		member.userFlightMiles( uFlights);
		//membership.getNextYearStatus("Bob");
		Status status = Member.Status.Gold;
		assertEquals(member.getNextStatus(), (status));
	}
	
	@Test
	public void testChangedStatusBlue() {
		Member member = new Member("Ray", "ray@abc.com", 40000);
		Membership membership = new Membership();
		membership.add(member);
		List<Flight> uFlights = new ArrayList<Flight>();
		Flight flight1 = new Flight ("DFW", "ALB", 7000, "TD", 100);
		
		Flight flight2 = new Flight ("ALB", "LAX", 7000, "TD", 100);
		uFlights.add(flight1);
		uFlights.add(flight2);
		member.userFlightMiles( uFlights);
		//membership.getNextYearStatus("Bob");
		Status status = Member.Status.Blue;
		assertEquals(member.getNextStatus(), (status));
	}

}
