package com.tddair;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import cucumber.api.junit.Cucumber;
import org.junit.Assert.*;

import static org.junit.Assert.*;

import com.tddair.TddAirApplication;

public class AddMembers {
	
  private TddAirApplication app = new TddAirApplication();

  @When("^traveler registers with username \"([^\"]*)\" , email \"([^\"]*)\" , initial miles (\\d+)$")
  public void traveler_registers_with_username_email_initial_miles(String userId, String email, int miles) throws Throwable {
    app.registerTraveller(userId, email, miles);
  }

  @Then("^the traveler \"([^\"]*)\" is a member$")
  public void the_traveler_is_a_member(String userId) throws Throwable {
	assertTrue(app.isMember(userId));
  }

  @When("^traveler registers with username \"([^\"]*)\" , empty email \"([^\"]*)\" , initial miles (\\d+)$")
  public void traveler_registers_with_username_empty_email_initial_miles(String userId, String email, int miles) throws Throwable {
	  app.registerTraveller(userId, email, miles);
  }

  @Then("^the traveler \"([^\"]*)\" is not a member$")
  public void the_traveler_is_not_a_member(String userId) throws Throwable {
	assertFalse(app.isMember(userId));
  }

	
}