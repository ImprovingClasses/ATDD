package com.tddair;

import static org.junit.Assert.assertTrue;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConnectionRewards {

	TddAirApplication app = new TddAirApplication();

	
	@Given("^flights name and miles:$")
	public void flights_name_and_miles(List<Flight> flts) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		// throw new PendingException();
		
		for(Flight fl : flts){
		  app.addFlight( fl );
		}
	}

	@Given("^User \"([^\"]*)\" with initial miles (\\d+) and email \"([^\"]*)\"$")
	public void user_with_initial_miles_and_email(String userId, int miles, String email) throws Throwable {
		app.registerTraveller(userId, email, miles);
	}

	@When("^User \"([^\"]*)\" flies \"([^\"]*)\"$")
	public void user_flies(String userId, String flightNum ) throws Throwable {
	    if( flightNum.contains( "TDD" ) && app.getFlight(flightNum)!= null ){
	      app.addTravelMiles( userId, app.getFlight(flightNum).getMileage() );
	    }
	    else {
	    	System.out.println( "user_files; flight " + flightNum 
	    			+ " is not of type TDD so user " + userId + " does not get miles." );
	    }
	}

	@Then("^user \"([^\"]*)\" status is \"([^\"]*)\" and miles are (\\d+)$")
	public void user_status_is_and_miles_are(String userId, String rewardLevel, int compareMiles) throws Throwable {
	    String rewLevel = app.getRewardLevel(userId);
	    int usrMiles = app.getUserMiles( userId );
	    assertTrue( rewLevel.equals(rewardLevel ) && usrMiles == compareMiles);
	}
}
