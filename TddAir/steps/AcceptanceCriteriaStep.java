import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import com.tddair.TddAirApplication;

import cucumber.api.PendingException;

public class AcceptanceCriteriaStep {
	
	TddAirApplication controller = new TddAirApplication();
	boolean result;

	@When("^the traveler registers with a username \"([^\"]*)\" and the email \"([^\"]*)\"$")
	public void the_traveler_registers_with_a_username_and_the_email(String arg1, String arg2) throws Throwable {
	    result = controller.addMember(arg1, arg2);
	}
	
	@Then("^were travelers \"([^\"]*)\"$")
	public void were_travelers(String arg1) throws Throwable {
		if ("recorded".equalsIgnoreCase(arg1) != result) {
			throw new AssertionError("test");
		}
	}
}
