package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;
import com.tddair.Membership;

public class JunitTestMembership {

	@Test
	public void initialMemberCountShouldBeZero() {
		Membership newMember = new Membership();
		
		//Check for zero membership size.
		assertEquals("Error Membership is 0",0,newMember.getMemebersCount());
	}
	
	@Test
	public void whenOneMemberAddedCountShouldBeOne() {
		Membership newMembership = new Membership();
		Member chrisMember = new Member("Chris", "Chris@Email.com");
		newMembership.addMember(chrisMember);
		
		assertEquals("Error Membership is not 1",1,newMembership.getMemebersCount());
	}
	
/*	@Test(expected=IllegalArgumentException.class)
	public void userIdIsNotNull() {
		Membership myMembership = new Membership();
		Member nullMember = new Member();
		
		//We should get an exception thrown here.
		myMembership.addMember(nullMember);
		
	}*/

}
