import com.tddair.TddAirApplication;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class RegisterUserSteps {

	TddAirApplication controller = new TddAirApplication();
	boolean isMemberAdded = false;
	
	
	@When("^the traveler registers with a userid \"([^\"]*)\" and the email \"([^\"]*)\"$")
	public void the_traveler_registers_with_a_userid_and_the_email(String arg1, String arg2) throws Throwable {
		isMemberAdded = controller.addMember(arg1, arg2);
	}

	@Then("^the traveler is \"([^\"]*)\" as a member$")
	public void the_traveler_is_as_a_member(String arg1) throws Throwable {
		assertEquals(isMemberAdded,true);
	}
	
	@When("^the traveler registers with a userid \"([^\"]*)\"$")
	public void the_traveler_registers_with_a_userid(String arg1) throws Throwable {
		isMemberAdded = controller.addMember(arg1, null);
	}
	
	@Then("^the traveler is not \"([^\"]*)\" as a member$")
	public void the_traveler_is_not_as_a_member(String arg1) throws Throwable {
		assertEquals(isMemberAdded,false);
	    
	}
	
	@When("^the traveler registers with a null userid and null email$")
	public void the_traveler_registers_with_a_null_userid_and_null_email() throws Throwable {
		isMemberAdded = controller.addMember(null, null);
	}
}
