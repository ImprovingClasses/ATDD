package com.tddair;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterMembershipStep {

    @When("^Traveler selects identifier \"([^\"]*)\" and email \"([^\"]*)\" when registering$")
    public void traveler_selects_identifier_and_email_when_registering(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    @Then("^The traveler information is \"([^\"]*)\"$")
    public void the_traveler_information_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    @When("^Traveler retrieves identifier \"([^\"]*)\" information$")
    public void traveler_retrieves_identifier_information(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    @Then("^The traveler information retrieved is \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_traveler_information_retrieved_is_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}