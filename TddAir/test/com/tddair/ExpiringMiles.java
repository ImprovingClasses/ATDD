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


public class ExpiringMiles {
	
                 
	    
	private StatusEnum startingStatus;

    private int currentYearMilage;
    
    private StatusEnum endOfYearStatus;
	
	@Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
	                 { StatusEnum.Gold, 0, StatusEnum.Blue }  
	           });
	    }
	    
	public ExpiringMiles(StatusEnum startingStatus, int currentYearMilage, StatusEnum endOfYearStatus) {
		this.startingStatus = startingStatus;
		this.currentYearMilage = currentYearMilage;
		this.endOfYearStatus = endOfYearStatus;
	}
	
	@Test
	public void checkStatusForEndOfYear() {
		Membership subject = new Membership();
		subject.addNewMember("bob","bob@abc.com",startingStatus);
		addMiles(subject, "bob@abc.com", currentYearMilage);
		subject.rollYear();
		assertTrue(testMemberStatus(subject, "bob@abc.com", "bob", endOfYearStatus ));
	}
	    
	private boolean testMemberStatus(Membership subject, String email, String userId, StatusEnum endOfYearStatus ) {
		boolean result = false;
		
		ArrayList<Member> members = subject.getMember(email);
		for (Member member: members) {
			if (member.getUserId().equals(userId)) {
				result = ( endOfYearStatus.equals(member.getStatus()) );
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
