import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert.*;

public class registraterMember {
	
	@When("^user \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void user_and_email(String arg1, String arg2) throws Throwable {
		assert( ! arg1.isEmpty() );
		assert( ! arg2.isEmpty() );
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" is added$")
	public void is_added(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" is not added$")
	public void is_not_added(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user is not added$")
	public void user_is_not_added() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}