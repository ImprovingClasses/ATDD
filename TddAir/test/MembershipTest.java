import static org.junit.Assert.*;

import org.junit.Test;

import com.tddair.*;

public class MembershipTest {

	@Test public void initialMembershipCountShouldBeZero()
	{
		Membership testObj = new Membership();
		assertEquals(testObj.getNumMembers(),0);
	}
	
	@Test public void whenOneMemberAddedCountShouldBeOne()
	{
		Membership testObj = new Membership();
		testObj.addMember("userID", "email");
		assertEquals(testObj.getNumMembers(),1);
	}
	
	@Test public void whenMemberRetrievedByMemberThenMemberAttributesShouldMatch()
	{
		Membership testObj = new Membership();
		testObj.addMember("userID", "email");
		Member member = testObj.getMember("userID");
		assertEquals(member.getUserID(), "userID");
		assertEquals(member.getEmail(), "email");
	}
}
