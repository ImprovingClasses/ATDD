package memberships;

import static org.junit.Assert.assertEquals;

import com.tddair.AppManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MemberMilesSteps extends AppManager {
	
	private String memberStatus = "";
	
	public MemberMilesSteps() {
		super();
	}

	@Given("^the Traveler enters a unique combination of a valid userId \"([^\"]*)\" and a valid emailAddress \"([^\"]*)\" and mileage of (\\d+)$")
	public void the_Traveler_enters_a_unique_combination_of_a_valid_userId_and_a_valid_emailAddress_and_mileage_of(String userId, String emailAddress, int initialMileage) throws Throwable {
		app.registerMember(userId, emailAddress, initialMileage);
	}

	@When("^the Traveler \"([^\"]*)\" requests their mileage status$")
	public void the_Traveler_requests_their_mileage_status(String userId) throws Throwable {
		memberStatus = app.getMemberStatus(userId);
	}

	@Then("^the Traveler status should be \"([^\"]*)\"$")
	public void the_Traveler_status_should_be(String expectedStatus) throws Throwable {
		assertEquals(expectedStatus, memberStatus);
	}

	@Given("^the Traveler \"([^\"]*)\" gains (\\d+)$")
	public void the_Traveler_gains(String userId, int mileage) throws Throwable {
		app.addMileage(userId, mileage);
	}	
}