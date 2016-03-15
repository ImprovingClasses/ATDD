package com.tddair;

import org.junit.Assert;
import org.junit.Test;

public class MemberRewardsTest {

	
	@Test
	public void VerifyNewMemberStatus() {
	
		Member member = new Member("bob@test.com", "bob");		
		Assert.assertEquals("Red", member.getStatus());
		Assert.assertEquals(0, member.getMiles());
		
	}
	
	@Test
	public void VerifyAddMiles() {
		Member member = new Member("bob@test.com","bob");
		member.addMiles(1000);
		Assert.assertEquals(1000, member.getMiles());
		
	}
	
	
	@Test
	public void verifyGreenStatus() {
		Member member = new Member("bob@test.com","bob");
		member.addMiles(25000);
		Assert.assertEquals("Green", member.getStatus());
	}
	
	@Test
	public void verifyBlueStatus() {
		Member member = new Member("bob@test.com","bob");
		member.addMiles(25000);
		member.addMiles(25000);
		Assert.assertEquals("Blue", member.getStatus());
	}
}
