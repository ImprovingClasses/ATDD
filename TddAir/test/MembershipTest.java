import static org.junit.Assert.*;

import org.junit.Test;

import com.tddair.*;

public class MembershipTest {

	@Test public void initialMembershipsCountShouldBeZero()
	{
		Memberships testObj = new Memberships();
		assertEquals(testObj.getNumMembers(),0);
	}
	
	@Test public void whenOneMemberAddedCountShouldBeOne()
	{
		Memberships testObj = new Memberships();
		testObj.addMember("userID", "email");
		assertEquals(testObj.getNumMembers(),1);
	}
	
	@Test public void whenMemberRetrievedByMemberThenMemberAttributesShouldMatch()
	{
		Memberships testObj = new Memberships();
		testObj.addMember("userID", "email");
		Membership member = testObj.getMember("userID");
		assertEquals(member.getUserId(), "userID");
		assertEquals(member.getEmail(), "email");
	}
	
	@Test public void whenTwoMembersAddedThenRetrieveMemberAttributesShouldMatch()
	{
		Memberships testObj = new Memberships();
		testObj.addMember("userID", "email");
		testObj.addMember("secondUser", "otherEmail");
		Membership member = testObj.getMember("userID");
		assertEquals(member.getUserId(), "userID");
		assertEquals(member.getEmail(), "email");
	}
	
	@Test public void initialEmailCountShouldBeZero()
	{
		Memberships testObj = new Memberships();
		assertEquals(testObj.getNumEmails(),0);
	}
	
	@Test public void whenOnlyEmailEnteredThenMembershipsCountRemainsTheSame()
	{
		Memberships testObj = new Memberships();
		testObj.addMember("", "email");
		assertEquals(testObj.getNumEmails(),1);
		assertEquals(testObj.getNumMembers(),0);
	}
	
	@Test public void whenTwoOnlyEmailsEnteredBothEmailsRecorded()
	{
		Memberships testObj = new Memberships();
		testObj.addMember("", "email1");
		testObj.addMember("", "email2");
		assertEquals(testObj.getNumEmails(),2);
	}
	
	@Test public void whenUserIDAndEmailAreEmptyThenNoMemberIsAddedAndNoEmailIsRecorded()
	{
		Memberships testObj = new Memberships();
		testObj.addMember("", "");
		assertEquals(testObj.getNumEmails(), 0);
		assertEquals(testObj.getNumMembers(), 0);
	}
}
