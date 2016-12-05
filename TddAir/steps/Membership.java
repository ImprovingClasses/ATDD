import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert.*;

public class Membership {

	@When("^traveler registers with username \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void traveler_registers_with_username_and_email(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
	}

	@Then("^the traveler is \"([^\"]*)\" as a member$")
	public void the_traveler_is_as_a_member(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //  throw new PendingException();
	}


	
}