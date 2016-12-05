import java.util.HashMap;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TDDAirAddMembershipSteps {
	private String userID;
	private String email;
	HashMap<String, String> members = new HashMap<String, String>();
	
	
	@When("^I have a traveller with userID \"([^\"]*)\" and email of \"([^\"]*)\"$")
	public void i_have_a_traveller_with_userID_and_email_of(String arg1, String arg2) throws Throwable {
	    userID = arg1;
	    email = arg2;
	    throw new PendingException();
	}

	@Then("^the traveller is \"([^\"]*)\" as a member$")
	public void the_traveller_is_as_a_member(String arg1) throws Throwable {

	    throw new PendingException();
	}

}
