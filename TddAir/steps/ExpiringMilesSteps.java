import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpiringMilesSteps {
	@Given("^I have \"([^\"]*)\" and my miles flown current year (\\d+)$")
	public void i_have_and_my_miles_flown_current_year(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^One year passes$")
	public void one_year_passes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^my status is <status>$")
	public void my_status_is_status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^my current year milage is (\\d+)$")
	public void my_current_year_milage_is(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
