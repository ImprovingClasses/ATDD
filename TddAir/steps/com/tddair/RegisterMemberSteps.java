package com.tddair;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegisterMemberSteps {
	
	Member member = new Member();
	Membership membership = new Membership();

	
	@When("^User registers username \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void user_registers_username_and_email(String arg1, String arg2) throws Throwable {
		try {
			member = new Member();
			member.setUserName(arg1);
			member.setEmail(arg2);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@When("^member is added$")
	public void member_is_added() throws Throwable {
	    try{
	    	membership.addMember(member);
	    }
	    catch(Exception ex) {
	    	System.out.println("Error!" + ex.getMessage());
	    }
	}

	@Given("^Existing username is \"([^\"]*)\" and email is \"([^\"]*)\"$")
	public void existing_username_is_and_email_is(String arg1, String arg2) throws Throwable {
	    member = new Member();
	    member.setUserName(arg1);
	    member.setEmail(arg2);
	    
	    membership.addMember(member);
	}
	
	@Then("^\"([^\"]*)\" is added to our list$")
	public void is_added_to_our_list(String arg1) throws Throwable {
	    Assert.assertNotNull(membership.getMemberById(arg1));
	}

	@Then("^\"([^\"]*)\" is not added to our list$")
	public void is_not_added_to_our_list(String arg1) throws Throwable {
		Assert.assertNull(membership.getMemberById(arg1));
	}
}
