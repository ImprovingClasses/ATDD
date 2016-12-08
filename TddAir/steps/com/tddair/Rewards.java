package com.tddair;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import junit.framework.Assert;
import cucumber.api.junit.Cucumber;
import org.junit.Assert.*;

import static org.junit.Assert.*;

import com.tddair.TddAirApplication;

public class Rewards {

	
	private TddAirApplication app = new TddAirApplication();
	
	@Given("^User \"([^\"]*)\" with email \"([^\"]*)\" has current miles (\\d+)$")
	public void user_with_email_has_current_miles(String userId, String email, int miles) throws Throwable {
		//TddAirApplication app = new TddAirApplication();
	    app.registerTraveller(userId, email, miles);
	}

	@When("^User \"([^\"]*)\" flies they get additional (\\d+)$")
	public void user_flies_they_get_additional(String userId, int miles) throws Throwable {
		app.addTravelMiles(userId, miles);
	}

	@Then("^The Traveler \"([^\"]*)\" reward level \"([^\"]*)\" is set$")
	public void the_Traveler_reward_level_is_set(String userId, String rewardLevel) throws Throwable {
		String rew = app.getRewardLevel(userId);
		System.out.println("Reward - " + rew + " Test Reward - " + rewardLevel);
	    assertTrue( app.getRewardLevel(userId).equals(rewardLevel));
	}

}
