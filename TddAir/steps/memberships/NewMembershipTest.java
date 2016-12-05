package memberships;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewMembershipTest {

	@When("^the Traveler enters a unique combination of a valid userId \"([^\"]*)\" and a valid emailAddress \"([^\"]*)\"$")
	public void the_Traveler_enters_a_unique_combination_of_a_valid_userId_and_a_valid_emailAddress(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the Traveler membership status is \"([^\"]*)\"$")
	public void the_Traveler_membership_status_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^the Traveler enters an empty userId \"([^\"]*)\" and a valid emailAddress \"([^\"]*)\"$")
	public void the_Traveler_enters_an_empty_userId_and_a_valid_emailAddress(String userId, String emailAddress) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^the Traveler enters a valid userId \"([^\"]*)\" and an empty emailAddress \"([^\"]*)\"$")
	public void the_Traveler_enters_a_valid_userId_and_an_empty_emailAddress(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^the Traveler enters a duplicate combination of a valid userId \"([^\"]*)\" and a valid emailAddress \"([^\"]*)\"$")
	public void the_Traveler_enters_a_duplicate_combination_of_a_valid_userId_and_a_valid_emailAddress(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}