package com.tddair;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert.*;

import com.tddair.TddAirApplication;

public class RegisterMembers {
	private TddAirApplication app = new TddAirApplication();
	
	@When("^user \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void user_and_email(String userId, String email) throws Throwable {
		app.registerTraveller(userId, email, 1000);
	}

	@Then("^\"([^\"]*)\" is added$")
	public void is_added(String userId) throws Throwable { 
		assertTrue(app.isMember(userId));
	}

	@Then("^\"([^\"]*)\" is not added$")
	public void is_not_added(String userId) throws Throwable {
		assertFalse(app.isMember(userId));
	}

}