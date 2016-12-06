import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import cucumber.api.junit.Cucumber;
import org.junit.Assert.*;

import static org.junit.Assert.*;

import com.tddair.TddAirApplication;

public class Membership {

/*	@When("^traveler registers with username \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void traveler_registers_with_username_and_email(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
	}

	@Then("^the traveler is \"([^\"]*)\" as a member$")
	public void the_traveler_is_as_a_member(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //    throw new PendingException();
	}
*/
	private TddAirApplication app = new TddAirApplication();

@When("^traveler registers with username \"([^\"]*)\" and email \"([^\"]*)\"$")
public void traveler_registers_with_username_and_email(String arg1, String arg2) throws Throwable {
	app.registerTraveller(arg1, arg2);
}

@Then("^the traveler is \"([^\"]*)\" as a member$")
public void the_traveler_is_as_a_member(String arg1) throws Throwable {	
	assertTrue(app.isMember(arg1));

}

@When("^traveler registers with username \"([^\"]*)\" and empty email \"([^\"]*)\"$")
public void traveler_registers_with_username_and_empty_email(String arg1, String arg2) throws Throwable {
	app.registerTraveller(arg1, arg2);
}

@Then("^the traveler \"([^\"]*)\" is not registered as a member$")
public void the_traveler_is_not_registered_as_a_member(String arg1) throws Throwable {
	assertFalse( app.isMember(arg1));
}

@When("^traveler registers with empty username \"([^\"]*)\" and valid email \"([^\"]*)\"$")
public void traveler_registers_with_empty_username_and_valid_email(String arg1, String arg2) throws Throwable {
	 throw new PendingException();
}

@When("^traveler tries to registers with username \"([^\"]*)\" and email \"([^\"]*)\"$")
public void traveler_tries_to_registers_with_username_and_email(String arg1, String arg2) throws Throwable {
	 throw new PendingException();
}


	
}