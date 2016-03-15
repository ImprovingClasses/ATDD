package com.tddair;

import org.junit.Assert;
import org.junit.Test;

public class MemberRewardsTest {

	
	@Test
	public void VerifyNewMemberStatus() {
	
		Member member = new Member("bob", "bob@test.com");
		Assert.assertEquals(Member.statusCodes.RED, member.getStatus());
		Assert.assertEquals(0, member.getMiles());
		
	}
	
	@Test
	public void VerifyAddMiles() {
		Member member = new Member("bob", "bob@test.com");
		member.addMiles(1000);
		Assert.assertEquals(1000, member.getMiles());
		
	}
	
	
	@Test
	public void verifyGreenStatus() {
		Member member = new Member("bob", "bob@test.com");
		member.addMiles(25000);
		Assert.assertEquals(Member.statusCodes.GREEN, member.getStatus());
	}
	
	@Test
	public void verifyBlueStatus() {
		Member member = new Member("bob", "bob@test.com");
		member.addMiles(25000);
		member.addMiles(25000);
		Assert.assertEquals(Member.statusCodes.BLUE, member.getStatus());
	}
	
	
	@Test
	public void verifyGoldenStatus() {
		Member member = new Member("bob", "bob@test.com");
		member.addMiles(25000);
		member.addMiles(25000);
		member.addMiles(25000);
		Assert.assertEquals(Member.statusCodes.GOLDEN, member.getStatus());
	}
	
	@Test
	public void verifyUnchangedStatus() {
		Member member = new Member("bob", "bob@test.com");
		member.addMiles(25000);
		member.addMiles(24999);
		Assert.assertEquals(Member.statusCodes.GREEN, member.getStatus());
	}
	
	
	
	
}
