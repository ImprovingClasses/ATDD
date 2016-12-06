import com.tddair.TddAirApplication;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MileageSteps {

	TddAirApplication airApp = new TddAirApplication();
	
	@Given("^a member with (\\d+) miles$")
	public void a_member_with_miles(int arg1) throws Throwable {
	    airApp.registerMember("Member", "email");
	    airApp.addMemberMiles("Member", arg1);
	}

	@When("^the member flies (\\d+) miles$")
	public void the_member_flies_miles(int arg1) throws Throwable {
	    airApp.addMemberMiles("Member", arg1);
	}

	@Then("^his flyer status should be \"([^\"]*)\"$")
	public void his_flyer_status_should_be(String arg1) throws Throwable {
	    assert(arg1.equals(airApp.getMemberStatus("Member")));
	}
	
}
