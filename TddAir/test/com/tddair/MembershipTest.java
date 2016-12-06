package com.tddair;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Before;


public class MembershipTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void countMemberZero() {
		Membership member = new Membership();
		assertEquals(0, member.getEnrollmentCount());
	}
	
	@Test
	public void oneMemberAddedCountShouldBeOne(){
		Membership membership = new Membership();
		Member member = new Member("bob@abc.com", "bob");
		//membership.setMemberList(member);
		membership.add(member);
		assertEquals(1, membership.getEnrollmentCount());
	}
	
	@Test
	public void initialEmailOnlyCountShouldBeZero(){
		Membership member = new Membership();
		assertEquals(0, member.getEnrollmentCount());
	}
	
	@Test
	public void twoMembersAddedRetrieveMemberMatch() {
		Membership membership = new Membership();
		
		Member member = new Member("bob@abc.com", "sue");
		membership.add(member);
		
		member = new Member("bob@abc.com", "bob");
		//membership.setMemberList(member);
		membership.add(member);
		assertEquals(1, membership.getEnrollmentCount());
		
	}
	
	@Test
	public void oneMemberAddedNoUserID(){
		Membership membership = new Membership();
		Member member = new Member("bob@abc.com", "");
		//membership.setMemberList(member);
		membership.add(member);
		assertEquals(1, membership.getEnrollmentCount());
	}
	
	@Test
	public void oneMemberAddedNoEmail(){
		Membership membership = new Membership();
		Member member = new Member("", "bob");
		//membership.setMemberList(member);
		membership.add(member);
		assertEquals(0, membership.getEnrollmentCount());
	}
	
	@Test
	public void oneMemberAddedNumericUserID(){
		Membership membership = new Membership();
		Member member = new Member("bob@abc.com", "123");
		//membership.setMemberList(member);
		membership.add(member);
		assertEquals(1, membership.getEnrollmentCount());
	}
	
	@Test
	public void oneMemberAddedinvalidEmail(){
		Membership membership = new Membership();
		Member member = new Member("abc.com", "sk");
		//membership.setMemberList(member);
		membership.add(member);
		assertEquals(1, membership.getEnrollmentCount());
	}
	
	@Test
	public void oneMemberAddedN0UserIDEmail(){
		Membership membership = new Membership();
		Member member = new Member("", "");
		//membership.setMemberList(member);
		membership.add(member);
		assertEquals(0, membership.getEnrollmentCount());
	}

}
