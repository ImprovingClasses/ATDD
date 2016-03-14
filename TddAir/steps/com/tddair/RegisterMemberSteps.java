package com.tddair;
import com.tddair.Member;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegisterMemberSteps {
	
	Member member = new Member();
	Membership membership = new Membership();

	
	@When("^Entered username is \"([^\"]*)\"$")
	public void entered_username_is(String arg1) throws Throwable {
		
		member.setUserName(arg1);
	    
	}

	@When("^Entered email is \"([^\"]*)\"$")
	public void entered_email_is(String arg1) throws Throwable {

		member.setEmail(arg1);
	}

	@Then("^\"([^\"]*)\" is \"([^\"]*)\" to our list$")
	public void is_to_our_list(String arg1, String arg2) throws Throwable {

		if(arg2.equals("added")) {
			membership.addMember(member);
			Member addedMember = membership.getMemberById(member.getUserName());
			Assert.assertNotNull(addedMember);
		}
		else {
			Member addedMember = membership.getMemberById(member.getUserName());
			Assert.assertNull(addedMember);
		}

	}

	@Given("^Existing username is \"([^\"]*)\"$")
	public void existing_username_is(String arg1) throws Throwable {
	    
	}

	@Given("^Existing email is \"([^\"]*)\"$")
	public void existing_email_is(String arg1) throws Throwable {
	    
	}
}
