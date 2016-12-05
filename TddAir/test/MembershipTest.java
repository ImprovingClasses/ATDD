import org.junit.Test;

import com.tddair.*;

public class MembershipTest {

	@Test public void initialMembershipCountShouldBeZero()
	{
		Membership testObj = new Membership();
		assertEquals(testObj.getNumMembers(),0);
	}
	
	@Test 
}
