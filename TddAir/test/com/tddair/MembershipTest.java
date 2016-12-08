package com.tddair;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MembershipTest {

	@Before
	public void setup() throws Exception{
		
	}
	
	@Test
	public void whenNoMembershipCountIsZero(){
		Assert.assertEquals( 0, new Membership().enrollmentCount() );
	}
	
	@Test
	public void whenMembershipCountIsOne(){
		Membership mbr = new Membership();
		mbr.addMember( "Bob", "bob@abc.com", 100 );
		Assert.assertEquals( 1, mbr.enrollmentCount() );
	}
		
	@Test
	public void whenMemberMatched(){
		Membership mbr = new Membership();
		mbr.addMember( "Bob", "bob@abc.com", 500 );
		Member m = mbr.getmemberByUserId( "Bob" );
		Assert.assertNotNull( m );
	}
	
	@Test
	public void whenMemberAlreadyExistsWithTheGivenId(){
		Membership mbr = new Membership();
		mbr.addMember( "Bob", "bob@abc.com", 1200 );
		//mbr.addMember( "Bob", "bob@abc.com" );
		//Member m = mbr.getmemberByUserId("Bob");
		Assert.assertTrue(mbr.isMember("Bob"));
	}
	
}
