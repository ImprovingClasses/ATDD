import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterUserSteps {

	@When("^the user registers with the username \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void the_user_registers_with_the_username_and_email(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the traveller is \"([^\"]*)\" as a member$")
	public void the_traveller_is_as_a_member(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
