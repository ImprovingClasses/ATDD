import com.tddair.TddAirApplication;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterUserSteps {

	TddAirApplication testApp = new TddAirApplication();
	boolean result;
	
	@Given("^there is no registered user named \"([^\"]*)\" with email \"([^\"]*)\"$")
	public void there_is_no_registered_user_named_with_email(String arg1, String arg2) throws Throwable {
		// No-op. This is a precondition of no previous data available.
	}

	@When("^I register with UserID \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void i_register_with_UserID_and_email(String arg1, String arg2) throws Throwable {
	    result = testApp.registerMember(arg1, arg2);
	}

	@Then("^a new User will be \"([^\"]*)\"$")
	public void a_new_User_will_be(String arg1) throws Throwable {
	    boolean testVal = "Registered".equalsIgnoreCase(arg1);
	    assert(result == testVal);
	}

	@Given("^there is a registered user named \"([^\"]*)\" with email \"([^\"]*)\"$")
	public void there_is_a_registered_user_named_with_email(String arg1, String arg2) throws Throwable {
		testApp.registerMember(arg1, arg2);
	}
}
