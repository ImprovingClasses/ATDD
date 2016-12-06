package com.tddair;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;




public class UpdateMemberStatus {
	
	private static final String STATUS_RED = "Red";
	private static final String STATUS_GREEN = "Green";
	private static final String STATUS_BLUE = "Blue";
	private static final String STATUS_GOLD = "Gold";

	@Test
	public void whenUserHasZeroMilesAnddAddsZeroMilesStatusIsRed() {
		Membership subject = new Membership();
		subject.addNewMember("bob","bob@abc.com",0);
		addMiles(subject, "bob@abc.com", 0);
		ArrayList<Member> members = subject.getMember("bob@abc.com");
		for (Member member: members) {
			if (member.getUserId().equals("bob")) {
				assertEquals(STATUS_RED, member.getStatus());
				assertEquals(0, member.getMileage());
			}
		}
		
		
	}
	
	private void addMiles(Membership subject, String email, int miles) {
		ArrayList<Member> members = subject.getMember("bob@abc.com");
		for (Member member: members) {
			if (member.getUserId().equals("bob")) {
				member.addMiles(0);
			}
		}
	}

}
