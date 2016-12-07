package memberships;

import com.tddair.AppManager;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpiringMilesSteps extends AppManager
{
	public ExpiringMilesSteps() {
		super();
	}
	
	@Given("^the Traveler enters a unique combination of a valid userId \"([^\"]*)\" and a valid emailAddress \"([^\"]*)\" and has flown (\\d+) miles with status of \"([^\"]*)\"$")
	public void the_Traveler_enters_a_unique_combination_of_a_valid_userId_and_a_valid_emailAddress_and_has_flown_miles_with_status_of(String arg1, String arg2, int arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^(\\d+) year has passed$")
	public void year_has_passed(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the Traveler has a status of \"([^\"]*)\" and (\\d+) miles flown for that year$")
	public void the_Traveler_has_a_status_of_and_miles_flown_for_that_year(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
