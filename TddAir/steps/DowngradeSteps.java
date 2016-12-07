import com.tddair.TddAirApplication;

import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DowngradeSteps {

	TddAirApplication airApp = new TddAirApplication();
	
	@Given("^a member who has flown (\\d+) and has \"([^\"]*)\"$")
	public void a_member_who_has_flown_and_has(int arg1, String arg2) throws Throwable {
	    airApp.registerMember("user", "email");
	    airApp.addMemberMiles("user", arg1);
	    airApp.setMemberStatus("user", arg2);
	    
	}

	@When("^I reach end of year$")
	public void i_reach_end_of_year() throws Throwable {
	    airApp.yearOver();
	}

	@Then("^he should have (\\d+), (\\d+) and \"([^\"]*)\"$")
	public void he_should_have_and(int arg1, int arg2, String arg3) throws Throwable {
	    assertEquals(airApp.getMemberCurrentMiles("user"), arg1);
	    assertEquals(airApp.getMemberMiles("user"), arg2);
	    assertEquals(airApp.getMemberStatus("user"), arg3);
	}
}
