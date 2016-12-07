package com.tddair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;

import com.tddair.Membership;

@RunWith(Parameterized.class)
public class JunitTestMembership {
	private String userId;
	private String email;
	private int miles;
	private ColorStatusEnum expectedStatus = null;
	private Member newMember;
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{"James", "James@Email.com", 0, ColorStatusEnum.RED}, {"Tom", "Tom@Email.com", 25000, ColorStatusEnum.GREEN},
			{"Tina", "Tina@Email.com", 50000, ColorStatusEnum.BLUE}, {"Kim", "Kim@Email.com", 75000, ColorStatusEnum.GOLD}
		});
	}
	
	public JunitTestMembership(String userid, String email, int miles, ColorStatusEnum expectedStatus){
		this.userId = userid;
		this.email = email;
		this.miles = miles;
		this.expectedStatus = expectedStatus;
	}
	
	@Test
	public void testPassedInValues() throws Exception{
		Membership ourMembership = new Membership();
		ourMembership.addMember(new Member(userId, email, miles));
		
		assertEquals(expectedStatus, ourMembership.getMemberById(userId).getColorStatus());
	}
	
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
	public void verifyUserRedStatus() throws Exception{
		Membership ourMembership = new Membership();
		ourMembership.addMember(new Member("Chris", "Chris@Email.com", 0));
		
		assertEquals(ColorStatusEnum.RED, ourMembership.getMemberById("Chris").getColorStatus());
	}
	
	@Test
	public void verifyUserGreenStatus() throws Exception{
		Membership ourMembership = new Membership();
		ourMembership.addMember(new Member("Chris", "Chris@Email.com", 25000));

		assertEquals(ourMembership.getMemberById("Chris").getColorStatus(), ColorStatusEnum.GREEN );
		
	}
	
	@Test
	public void verifyUserBlueStatus() throws Exception{
		Membership ourMembership = new Membership();
		ourMembership.addMember(new Member("Chris", "Chris@Email.com", 50000));

		assertEquals(ColorStatusEnum.BLUE, ourMembership.getMemberById("Chris").getColorStatus());
	}
	 
	@Test
	public void verifyUserGoldStatus() throws Exception{
		Membership ourMembership = new Membership();
		ourMembership.addMember(new Member("Chris", "Chris@Email.com", 75000));

		assertEquals(ColorStatusEnum.GOLD, ourMembership.getMemberById("Chris").getColorStatus());
		
	}
	@Test
	public void verifyMemberMilesUpdateSingleFlight() throws Exception{
		Membership ourMembership = new Membership();
		List<Flight> flightPlan = new ArrayList<>();
		
		Flight flight1 = new Flight("DEX", "HOU", 5000, "TD101");
		flightPlan.add(flight1);
		
		Member tempMember = new Member("Chris", "Chris@Email.com", 0);
		ourMembership.addMember(tempMember);
		
		
		ourMembership.updateMember("Chris", flightPlan);
		
		assertEquals(5000, tempMember.getMiles());
	}

	@Test
	public void verifyMemberMilesUpdateMultiFlight() throws Exception{
		Membership ourMembership = new Membership();
		List<Flight> flightPlan = new ArrayList<>();
		
		Flight flight1 = new Flight("DEX", "HOU", 5000, "TD101");
		Flight flight2 = new Flight("DEX", "HOU", 5000, "AA101");
		Flight flight3 = new Flight("DEX", "HOU", 7000, "TD101");
		flightPlan.add(flight1);
		flightPlan.add(flight2);
		flightPlan.add(flight3);
		
		Member tempMember = new Member("Chris", "Chris@Email.com", 0);
		ourMembership.addMember(tempMember);
		
		
		ourMembership.updateMember("Chris", flightPlan);
		
		assertEquals(12000, tempMember.getMiles());
	}
}
