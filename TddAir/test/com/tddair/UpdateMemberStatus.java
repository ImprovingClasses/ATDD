package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;




public class UpdateMemberStatus {
	
	private static final String STATUS_RED = "red";
	private static final String STATUS_GREEN = "green";
	private static final String STATUS_BLUE = "blue";
	private static final String STATUS_GOLD = "gold";

	@Test
	public void whenUserHasZeroMilesAnddAddsZeroMilesStatusIsRed() {
		Membership subject = new Membership();
		subject.addNewMember("bob","bob@abc.com",0);
		
	}

}
