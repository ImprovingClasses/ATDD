import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import java.util.List;

import com.tddair.TddAirApplication;

public class ExpiringMiles {

	@Given("^Member current miles (\\d+) and Member currentStatus \"([^\"]*)\"$")
	public void member_current_miles_and_Member_currentStatus(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^New Year$")
	public void new_Year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Member new status will be \"([^\"]*)\"$")
	public void member_new_status_will_be(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Member YTD miles (\\d+)$")
	public void member_YTD_miles(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
