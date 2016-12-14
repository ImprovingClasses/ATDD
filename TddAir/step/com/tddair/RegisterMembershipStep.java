package com.tddair;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterMembershipStep {

    TddAirApplication app = new TddAirApplication();
    boolean recorded = false;
    Member member;
    
    @When("^Traveler selects identifier \"([^\"]*)\" and email \"([^\"]*)\" when registering$")
    public void traveler_selects_identifier_and_email_when_registering(String identifier, String email) throws Throwable {
        recorded = app.enroll(identifier, email);
    }
    
    @Then("^The traveler information is \"([^\"]*)\"$")
    public void the_traveler_information_is(String result) throws Throwable {
        assertTrue("recorded".equalsIgnoreCase(result)==recorded);
    }
    
    @When("^Traveler retrieves identifier \"([^\"]*)\" information$")
    public void traveler_retrieves_identifier_information(String identifier) throws Throwable {
       member = app.getMember(identifier);
    }
    
    @Then("^The traveler information retrieved is \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_traveler_information_retrieved_is_and(String identifier, String email) throws Throwable {
        assertEquals(identifier, member.getIdentifier());
        assertEquals(email, member.getEmail());
    }

}