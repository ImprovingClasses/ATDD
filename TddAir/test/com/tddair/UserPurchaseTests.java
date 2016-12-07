package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserPurchaseTests {

	MemberShip membership = null;
	
	@Before 
	public void setUp() {
		membership = new MemberShip(new FlightDao());
	}
	
	@After
	public void tearDown() {
		membership.cleanUp();
	}
	
	@Test
	public void testOnSuccessfulPurchase() {
		membership.addNewMember("Bob", "bob@abc.com", 10000);
		int numSuccessful = membership.makePurchases("Bob", 1);
		assertEquals(1, numSuccessful);
		assertEquals(0, membership.getCurrencyMiles("Bob"));
	}
	
	@Test
	public void testNonSuccessfulPurchase() {
		membership.addNewMember("Bob", "bob@abc.com", 9999);
		int numSuccessful = membership.makePurchases("Bob", 1);
		assertEquals(0, numSuccessful);
		assertEquals(9999, membership.getCurrencyMiles("Bob"));
	}
	
	@Test
	public void testPartialSuccessfulPurchase() {
		membership.addNewMember("Bob", "bob@abc.com", 29999);
		int numSuccessful = membership.makePurchases("Bob", 28);
		assertEquals(3, numSuccessful);
		assertEquals(2999, membership.getCurrencyMiles("Bob"));
	}
}