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
	
	@Test
	public void whenMemberRetrievedByMemberThenMemberAttributesShouldMatch() throws Exception{
		Membership ourMembership = new Membership();
		ourMembership.addMember(new Member("Chris", "Chris@Email.net"));
		Member chrisMember = ourMembership.getMemberById("Chris");
		
		assertEquals("Chris", chrisMember.getUserId());
		assertEquals("Chris@Email.net", chrisMember.getEmail());
		 
	}
	
	@Test
	public void whenTwoMembersAddedThenRetrieveMemberAttributesShouldMatch()throws Exception{
		Membership ourMembership = new Membership();
		
		//Add two Members
		ourMembership.addMember(new Member("Chris", "Chris@Email.net"));
		ourMembership.addMember(new Member("Nick", "Nick@Email.net"));
		
		
		Member chrisMember = ourMembership.getMemberById("Chris");
		Member nickMember = ourMembership.getMemberById("Nick");
		 
		assertEquals("Chris", chrisMember.getUserId());
		assertEquals("Chris@Email.net", chrisMember.getEmail());
		assertEquals("Nick", nickMember.getUserId());
		assertEquals("Nick@Email.net", nickMember.getEmail());
	}
	
	@Test
	public void givenAnExistingMemberIdWhenMemberWithMatchingIdIsEnrolledThenTheyAreNotAdded(){
		Membership ourMembership = new Membership();
		
		//Add two Members
		assertTrue(ourMembership.addMember(new Member("Chris", "Chris@Email.net")));
		assertFalse(ourMembership.addMember(new Member("Chris", "Chris@Email.net")));
		assertEquals(1,ourMembership.getMemebersCount());
	}
	
	@Test
	public void verifyUserRedStatus(){
		Membership ourMembership = new Membership();
		ourMembership.addMember(new Member("Chris", "Chris@Email.com", 0));
		
		assertEquals(ColorStatusEnum.RED, ourMembership.getMemberById("Chris").getColorStatus());
	}

}
