package com.tddair;

import org.junit.Assert;
import org.junit.Test;

public class RegisterMemberTest {
	
	
	@Test
	public void whenMemberCountIsZero() {
		Membership membership = new Membership();
		Assert.assertEquals(0, membership.getCount());	
	}
	
	@Test
	public void whenMemberCountIsOne() {
		Membership membership = new Membership();
		membership.setCount(1);
		Assert.assertEquals(1, membership.getCount());	
	}
	
	
	@Test
	public void RetrieveByMemberIdentifierReturnsmatch() {
		Membership membership = new Membership();
		Member member = new Member();
		member.setId("bob@test.com");
		membership.addMemberX(member);
		Assert.assertEquals(member, membership.getMemberById(member.getId()));
	}
	
	@Test
	public void CheckForNotExistsMemberInCollection() {
		
		Membership membership = new Membership();
		Member member = new Member();
		member.setId("User1");
		membership.addMemberX(member);
		Assert.assertEquals(null, membership.getMemberById("User2"));
		
	}
	
	
	@Test
	public void checkForDuplicateMemberOnRegister() {
		boolean thrown = false;
		
		try {
			
		Membership membership = new Membership();
		Member member = new Member();
		member.setId("yada");
		membership.addMemberX(member);
		Member member2 = new Member();
		member2.setId("yada");
		membership.addMemberX(member2);
		}
		catch(Exception ex) {
			thrown = true;
		}
		
		Assert.assertTrue(thrown);
	}
	

}
