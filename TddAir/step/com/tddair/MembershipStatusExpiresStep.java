package com.tddair;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MembershipStatusExpiresStep {

    TddAirApplication app = new TddAirApplication();
    String identifier = "bob";
    String email = "bob@abc.com";
    
    @Before
    public void before(){
        app.enroll(identifier, email);
    }
    
    
    @Given("^A member flew (\\d+) with \"([^\"]*)\" level$")
    public void a_member_flew_with_level(int miles, String status) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the year passes$")
    public void the_year_passes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the members has \"([^\"]*)\"$")
    public void the_members_has(String status) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
}
