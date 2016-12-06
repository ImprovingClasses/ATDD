package memberships;

import static org.junit.Assert.assertEquals;

import com.tddair.TddAirApplication;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewMembershipSteps {
	
	private TddAirApplication app = null;
	private String registeredStatus = "";

	public NewMembershipSteps() {
		app = new TddAirApplication();
	}
	
	@When("^the Traveler enters a unique combination of a valid userId \"([^\"]*)\" and a valid emailAddress \"([^\"]*)\"$")
	public void the_Traveler_enters_a_unique_combination_of_a_valid_userId_and_a_valid_emailAddress(String userId, String emailAddress) throws Throwable {
		registeredStatus = app.registerMember(userId, emailAddress);
	}

	@When("^the Traveler enters an empty userId \"([^\"]*)\" and a valid emailAddress \"([^\"]*)\"$")
	public void the_Traveler_enters_an_empty_userId_and_a_valid_emailAddress(String userId, String emailAddress) throws Throwable {
		registeredStatus = app.registerMember(userId, emailAddress);
	}
	
	@When("^the Traveler enters a valid userId \"([^\"]*)\" and an empty emailAddress \"([^\"]*)\"$")
	public void the_Traveler_enters_a_valid_userId_and_an_empty_emailAddress(String userId, String emailAddress) throws Throwable {
		registeredStatus = app.registerMember(userId, emailAddress);
	}
	
	@When("^the Traveler enters a duplicate combination of a valid userId \"([^\"]*)\" and a valid emailAddress \"([^\"]*)\"$")
	public void the_Traveler_enters_a_duplicate_combination_of_a_valid_userId_and_a_valid_emailAddress(String userId, String emailAddress) throws Throwable {
		registeredStatus = app.registerMember(userId, emailAddress);
	}
	
	@Then("^the Traveler membership status is \"([^\"]*)\"$")
	public void the_Traveler_membership_status_is(String membershipStatus) throws Throwable {
		assertEquals(membershipStatus, registeredStatus);
	}	
}