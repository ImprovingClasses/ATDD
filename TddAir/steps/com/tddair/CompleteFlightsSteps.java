package com.tddair;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class CompleteFlightsSteps {

	private TddAirApplication app;
	private Member member;
	
	@Before
	public void setup(){
		app = new TddAirApplication();
		app.addFlight("DFW", "DFW", 25000, "TEST", 25000);
		member = app.lookupMember("bob");
	}
	
	@Given("^a customer registers with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void a_customer_registers_with_and(String arg1, String arg2) throws Throwable {
		app.enroll("bob", "bob@abc.com");
	}

	@When("^member \"([^\"]*)\" takes flight \"([^\"]*)\"$")
	public void member_takes_flight(String memberIdentifier, String flight) throws Throwable {
		member = app.lookupMember(memberIdentifier);
		app.completeFlight(member.getIdentifier(), flight);
	}

	@Then("^that member has \"([^\"]*)\" status$")
	public void that_member_has_status(String status) throws Throwable {
		assertTrue(member.getStatus() == Status.valueOf(status));
	}

	@Then("^that member has (\\d+) ytd miles$")
	public void that_member_has_ytd_miles(int miles) throws Throwable {
		assertEquals(member.getYearToDateMiles(), miles);
	}


	@Given("^a customer registers with \"([^\"]*)\" and \"([^\"]*)\" and has (\\d+) miles$")
	public void a_customer_registers_with_and_and_has_miles(String identifier, String email, int miles) throws Throwable {
		app.enroll(identifier, email, miles);
	}
	
}
