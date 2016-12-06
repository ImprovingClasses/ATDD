import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import com.tddair.TddAirApplication;

import cucumber.api.PendingException;

public class MembershipStep {
	
	
	TddAirApplication controller = new TddAirApplication();
	boolean isMemberAdded true;
	
	@When("^the traveler registers with a userid \"([^\"]*)\" and the email \"([^\"]*)\"$")
	public void the_traveler_registers_with_a_userid_and_the_email(String arg1, String arg2) throws Throwable {
	    isMemberAdded = controller.addMember(arg1, arg2);// Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^the traveler is \"([^\"]*)\" as a member$")
	public void the_traveler_is_as_a_member(String arg1) throws Throwable {
	    assertTrue(isMemberAdded);
	    //throw new PendingException();
	}
}
