package com.tddair;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterMemberSteps {
	
	Member member = new Member();
	Membership membership = new Membership();

	
	@When("^User registers username \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void user_registers_username_and_email(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^member is added$")
	public void member_is_added() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" is added to our list$")
	public void is_added_to_our_list(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Existing username is \"([^\"]*)\" and email is \"([^\"]*)\"$")
	public void existing_username_is_and_email_is(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" is not added to our list$")
	public void is_not_added_to_our_list(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
