package com.tddair;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.tddair.Membership.Status;

@RunWith(Parameterized.class)
public class ParameterizedMembershipStatus {
	
	public enum userStatus {
		Red, 
		Green, 
		Blue, 
		Gold
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 10000, 5000, userStatus.Red}
		});
	}
	
	private int currentMiles;
	private int miles;
	private String status;
	
	// Constructor
	public ParameterizedMembershipStatus(int currMiles, int uMiles, String membStatus){
		currentMiles = currMiles;
		miles = uMiles;
		status = membStatus;
	}
	
	@Test
	public void test() {
		
		Membership membership = new Membership();
		Member m = new Member("bob", "bob@abc.com", currentMiles);
		membership.add(m );
		membership.addMiles("bob", miles);
		Status s = membership.membershipLevel(m);
		
		assertEquals(s, status);
	}
	

}
