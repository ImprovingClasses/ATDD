package com.tddair;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestExpiringMiles {

	@Test
	public void newYearMemberMilesReset(){
		Membership members =  new Membership();
		members.addNewMember("bob", "bob@abc.com");
		members.addNewMember("john", "john@abc.com",10000);
        members.newYearMemberUpdate();
        assertEquals("Test successful NewYear miles reset", 0,members.getById("bob").getyTDMiles());	  
		assertEquals("Test successful NewYear miles reset", 0,members.getById("john").getyTDMiles());	  
	}
}
