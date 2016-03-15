package com.tddair;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MemberRewardsSteps {
	
	Member member;
	Membership membership;
	
	@Given("^Existing Member \"([^\"]*)\" has (\\d+) miles$")
	public void existing_Member_has_miles(String arg1, int arg2) throws Throwable {
		Member member = new Member(arg1, "");
		member.addMiles(arg2);
	    membership = new Membership();
	    membership.addMember(member);
	}
	
	@When("^Member registers username \"([^\"]*)\" yada$")
	public void member_registers_username_yada(String arg1) throws Throwable {
	    Member member = new Member(arg1, "");
	    membership = new Membership();
	    membership.addMember(member);
	}
	
	@When("^Member \"([^\"]*)\" flies <flightMiles>$")
	public void member_flies_flightMiles(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	@When("^Member \"([^\"]*)\" flies (\\d+)$")
	public void member_flies(String arg1, int arg2) throws Throwable {
	    member = membership.getMemberById(arg1);
	    member.addMiles(arg2);
	}
	
	@Then("^Member status is \"([^\"]*)\" and miles are equal to \"([^\"]*)\"$")
	public void member_status_is_and_miles_are_equal_to(String arg1, String arg2) throws Throwable {
		Assert.assertEquals(arg1, member.getStatus().toString());
	    Assert.assertEquals(arg2, String.valueOf(member.getMiles()));
	}

	@Then("^Member status is \"([^\"]*)\" and miles are equal to (\\d+)$")
	public void member_status_is_and_miles_are_equal_to(String arg1, int arg2) throws Throwable {
		Assert.assertEquals(arg1, member.getStatus().toString());
	    Assert.assertEquals(arg2, member.getMiles());
	}
	
	
}
