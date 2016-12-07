import com.tddair.TddAirApplication;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpgradeSteps {
	
	TddAirApplication airApp = new TddAirApplication();

	@Given("^a member with (\\d+) and \"([^\"]*)\"$")
	public void a_member_with_and(int arg1, String arg2) throws Throwable {
	    airApp.registerMember("user", "email");
	    airApp.addMemberMiles("user", arg1);
	    airApp.setMemberStatus("user", arg2);
	}

	@When("^he purchases (\\d+)$")
	public void he_purchases(int arg1) throws Throwable {
	    airApp.buyUpgrades("user", arg1);
	}

	@Then("^he should have (\\d+) tickets, (\\d+) remaining and \"([^\"]*)\"$")
	public void he_should_have_tickets_remaining_and(int arg1, int arg2, String arg3) throws Throwable {
	    assertEquals(airApp.getUpgrades("user"), arg1);
	    assertEquals(airApp.getMemberMiles("user"), arg2);
	    assertEquals(airApp.getMemberStatus("user").getLevel(), arg3);
	}
}
