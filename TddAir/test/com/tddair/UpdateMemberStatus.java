package com.tddair;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)


public class UpdateMemberStatus {
	
	private static final String STATUS_RED = "Red";
	private static final String STATUS_GREEN = "Green";
	private static final String STATUS_BLUE = "Blue";
	private static final String STATUS_GOLD = "Gold";
	
	
	private int startingMiles;

    private int addedMiles;
    
    private String status;
	
	@Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
	                 { 0, 0, STATUS_RED }, { 24999, 2, STATUS_GREEN }, { 49999, 2, STATUS_BLUE }, { 74999, 2, STATUS_GOLD }, 
	                 { 20000, 30000, STATUS_BLUE }, { 20000, 55000, STATUS_GOLD }, { 30000, 45000, STATUS_GOLD }  
	           });
	    }
	    
	public UpdateMemberStatus(int startingMiles, int addedMiles, String status) {
		this.startingMiles = startingMiles;
		this.addedMiles = addedMiles;
		this.status = status;
	}
	
	@Test
	public void checkStatusForMilage() {
		Membership subject = new Membership();
		subject.addNewMember("bob","bob@abc.com",startingMiles);
		addMiles(subject, "bob@abc.com", addedMiles);
		assertTrue(testMemberStatus(subject, "bob@abc.com", "bob", startingMiles+addedMiles, status ));
	}
	    
	private boolean testMemberStatus(Membership subject, String email, String userId, int expectedMiles, String expectedStatus ) {
		boolean result = false;
		
		ArrayList<Member> members = subject.getMember(email);
		for (Member member: members) {
			if (member.getUserId().equals(userId)) {
				result = ( (expectedStatus.equals(member.getStatus())) && (expectedMiles == member.getMileage()));
			}
		}
		
		return result;
	}

	private void addMiles(Membership subject, String email, int miles) {
		ArrayList<Member> members = subject.getMember("bob@abc.com");
		for (Member member: members) {
			if (member.getUserId().equals("bob")) {
				member.addMiles(miles);
			}
		}
	}
	
}
