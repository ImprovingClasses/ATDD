package com.tddair;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExpiringMilesTest 
{
	MemberShip membership = null;
	
	
	@Before 
	public void setUp() {
		membership = new MemberShip(new FlightDao());
	}
	
	@After
	public void tearDown() {
		membership.cleanUp();
	}
	
	@Test
	public void statusAfterOneYearWithoutFlying()
	{
		Member member = new Member("testId", "test@gmail.com", 50000);
		membership.addNewMember(member);
		
		membership.updateStatusAfterOneYear(member.getUserId());
		MemberStatus memberStatusBeforeYearEnds = membership.getMemberStatus(member.getUserId());
		membership.updateStatusAfterOneYear(member.getUserId());
		assertEquals(memberStatusBeforeYearEnds.previous, membership.getMemberStatus(member.getUserId()));
	}
}
