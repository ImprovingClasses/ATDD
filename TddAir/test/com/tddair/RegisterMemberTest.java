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
		
	}
	
	
	

}
