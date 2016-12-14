package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MembershipStatusStep {

    TddAirApplication app = new TddAirApplication();
    String identifier = "bob";
    String email = "bob@abc.com";
    
    @Before
    public void before(){
        app.enroll(identifier, email);
    }
    
    
    @When("^A traveler earns (\\d+) miles$")
    public void a_traveler_earns_miles(int miles) throws Throwable {
        app.addMemberFlight(identifier, miles);
    }
    
    @Then("^A traveler is status \"([^\"]*)\" and total miles (\\d+)$")
    public void a_traveler_is_status_and_total_miles(String status, int miles) throws Throwable {
        assertTrue(status.equalsIgnoreCase(app.getStatusFor(identifier)));
        assertEquals(miles, app.getMilesFor(identifier));
    }

}
