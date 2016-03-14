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
		Assert.assertEquals(member, membership.GetMemberById(member.getId()));
	}
	
	@Test
	public void CheckForNotExistsMemberInCollection() {
		
		Membership membership = new Membership();
		Member member = new Member();
		member.setId("User1");
		membership.AddMember(member);
		Assert.assertEquals(null, membership.FindMemberById("User2"));
		
	}
	

}
