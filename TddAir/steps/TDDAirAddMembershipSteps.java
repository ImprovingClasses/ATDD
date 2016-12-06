import static org.junit.Assert.assertEquals;

import com.tddair.Member;
import com.tddair.TddAirApplication;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TDDAirAddMembershipSteps {
	private TddAirApplication airApplication = new TddAirApplication();
	private boolean result;
	
	@When("^I have a traveller with userID \"([^\"]*)\" and email of \"([^\"]*)\"$")
	public void i_have_a_traveller_with_userID_and_email_of(String arg1, String arg2) throws Throwable {		
		Member m = new Member(arg2, arg1);
		result = airApplication.addMembers(m);
	}

	@Then("^the traveller is \"([^\"]*)\" as a member$")
	public void the_traveller_is_as_a_member(String arg1) throws Throwable {
		assertEquals("registered".equalsIgnoreCase(arg1), result);
	}

}
