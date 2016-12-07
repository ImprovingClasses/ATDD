package memberships;

import com.tddair.AppManager;
import com.tddair.MemberStatus;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ExpiringMilesSteps extends AppManager
{
	public ExpiringMilesSteps() {
		super();
	}
	
	String userId;
	
	@Given("^the Traveler enters a unique combination of a valid userId \"([^\"]*)\" and a valid emailAddress \"([^\"]*)\" and has flown (\\d+) miles with status of \"([^\"]*)\"$")
	public void the_Traveler_enters_a_unique_combination_of_a_valid_userId_and_a_valid_emailAddress_and_has_flown_miles_with_status_of(String userId, String emailAddress, int mileageFlown, String initialStatus) throws Throwable {
		this.userId = userId;
		app.registerMember(userId, emailAddress, mileageFlown);
		app.setMemberStatus(userId, initialStatus);
		
	}

	@When("^(\\d+) year has passed$")
	public void year_has_passed(int arg1) throws Throwable {
	    app.updateStatusAfterOneYear(this.userId);
	}
	
	@Then("^the Traveler has a status of \"([^\"]*)\"$")
	public void the_Traveler_has_a_status_of(String expectedStatus) throws Throwable {
		assertEquals(expectedStatus, app.getMemberStatus(this.userId));
	}
	
}
