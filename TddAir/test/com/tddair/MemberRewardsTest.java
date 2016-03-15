package com.tddair;

import org.junit.Assert;
import org.junit.Test;

public class MemberRewardsTest {

	
	@Test
	public void VerifyNewMemberStatus() {
	
		Member member = new Member("bob@test.com", "bob");		
		Assert.assertEquals("Red", member.getStatus());
		
		
	}
}
