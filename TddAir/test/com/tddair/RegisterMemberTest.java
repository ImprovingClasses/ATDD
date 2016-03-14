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
	public void whenMemberCountIsOne(){
		try {

			Membership membership = new Membership();
			Member member = new Member();
			member.setUserName("yada");
			member.setEmail("yada@yada.com");
			membership.addMember(member);
			Assert.assertEquals(1, membership.getCount());
		} catch (Exception ex) {

		}
	}
	
	
	@Test
	public void RetrieveByMemberIdentifierReturnsmatch() {
		
		Membership membership = new Membership();
		Member member = new Member();
		member.setUserName("bob@test.com");
		boolean thrown = false;
		try {			
			membership.addMember(member);
		}
		catch(Exception ex) {
			thrown = true;
		}
		Assert.assertEquals(member, membership.getMemberById(member.getUserName()));
		//Assert.assertTrue(thrown);
	}
	
	@Test
	public void CheckForNotExistsMemberInCollection() {
		
		Membership membership = new Membership();
		Member member = new Member();
		member.setUserName("User1");
		boolean thrown = false;
		try {			
			membership.addMember(member);
		}
		catch(Exception ex) {
			thrown = true;
		}
		Assert.assertEquals(null, membership.getMemberById("User2"));
		//Assert.assertTrue(thrown);
		
	}
	
	
	@Test
	public void checkForDuplicateMemberOnRegister() {
		boolean thrown = false;
		
		try {
			
			Membership membership = new Membership();
			Member member = new Member();
			member.setUserName("yada");
			membership.addMember(member);
			Member member2 = new Member();
			member2.setUserName("yada");
			membership.addMember(member2);
		}
		catch(Exception ex) {
			thrown = true;
		}
		
		Assert.assertTrue(thrown);
	}
	

}
