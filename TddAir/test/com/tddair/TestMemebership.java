package com.tddair;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestMemebership {

	@Test
	public void initialmembershipCountShouldBeZero(){
		Membership members =  new Membership(); 
		assertEquals(0,members.getMembershipCount());
	}
}
