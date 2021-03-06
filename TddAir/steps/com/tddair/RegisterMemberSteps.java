package com.tddair;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RegisterMemberSteps {

	Membership membership = new Membership();
	String userName;
	String email;
	boolean memberAdded;

	@When("^the traveler registeres with a username \"([^\"]*)\" and the email \"([^\"]*)\"$")
	public void the_traveler_registeres_with_a_username_and_the_email(String userName, String email) throws Throwable {
		this.userName = userName;
		this.email = email;

		memberAdded = membership.enroll(userName, email);
	}

	@Then("^the traveler is \"([^\"]*)\" as a member$")
	public void the_traveler_is_as_a_member(String outcome) throws Throwable {
		assertTrue(memberAdded == "registered".equals(outcome));
	}

	@Then("^the traveler is \"([^\"]*)\" to email list$")
	public void the_traveler_is_to_email_list(String added) throws Throwable {
		assertTrue("added".equals(added) == membership.isEmailRecorded(email));
	}

}
