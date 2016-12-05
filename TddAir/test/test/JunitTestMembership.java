package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestMembership {

	@Test
	public void initialMemberCountShouldBeZero() {
		Memembership newMemember = new Memembership();
		AssertEquals("Error Memembership is 0",0,newMemember.getMemebersCount());
	}

}
