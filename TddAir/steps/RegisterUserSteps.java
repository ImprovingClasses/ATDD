import com.tddair.TddAirApplication;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class RegisterUserSteps {

	TddAirApplication controller = new TddAirApplication();
	boolean isMemberAdded = true;
	
	
	@When("^the traveler registers with a userid \"([^\"]*)\" and the email \"([^\"]*)\"$")
	public void the_traveler_registers_with_a_userid_and_the_email(String arg1, String arg2) throws Throwable {
		isMemberAdded = controller.addMember(arg1, arg2);
	}

	@Then("^the traveler is \"([^\"]*)\" as a member$")
	public void the_traveler_is_as_a_member(String arg1) throws Throwable {
		assertEquals(isMemberAdded,true);
	}
}
