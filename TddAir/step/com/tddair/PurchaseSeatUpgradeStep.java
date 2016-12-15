package com.tddair;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PurchaseSeatUpgradeStep {

    TddAirApplication app = new TddAirApplication();
    String identifier = "bob";
    String email = "bob@abc.com";
    
    @Before
    public void before(){
        app.enroll(identifier, email);
    }
    
    @Given("^A member \"([^\"]*)\" member with (\\d+)$")
    public void a_member_member_with(String status, int purchasingMiles) throws Throwable {
        app.addMemberFlightMiles(identifier, purchasingMiles);
        app.setMemberStatus(identifier, status);
    }

    @When("^the member purchases (\\d+) number of upgrade coupons$")
    public void the_member_purchases_number_of_upgrade_coupons(int upgrades) throws Throwable {
        app.memberPuchaseUpgrades(identifier, upgrades);
    }

    @Then("^the member has (\\d+) and (\\d+) is still is \"([^\"]*)\"$")
    public void the_member_has_and_is_still_is(int coupons, int purchasingMiles, String status) throws Throwable {
        
        assertEquals(coupons, app.getMemberUpgrades(identifier));
        assertEquals(purchasingMiles, app.getMilesFor(identifier));
        assertEquals(status, app.getStatusFor(identifier));
        
    }
    
    
}
