import com.tddair.Member;
import com.tddair.TddAirApplication;

import static org.junit.Assert.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MilageStatusSteps {
	private final TddAirApplication controller = new TddAirApplication();
	private static final String USER_ID = "bob";
	private static final String EMAIL = "bob@abc.com";
	
	
	@Given("^I have (\\d+) in my account$")
	public void i_have_in_my_account(int arg1) throws Throwable {
		controller.addMember(USER_ID, EMAIL, arg1);
	}

	@When("^I travel (\\d+)$")
	public void i_travel(int arg1) throws Throwable {
		Member member = controller.getMember(USER_ID, EMAIL);
		member.addMiles(arg1);
	}

	@Then("^my status is RED$")
	public void my_status_is_RED() throws Throwable {
		Member member = controller.getMember(USER_ID, EMAIL);
		assertEquals("Red", member.getStatus());
	    throw new PendingException();
	}

	@Then("^my milage should be (\\d+)$")
	public void my_milage_should_be(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I have (\\d+),(\\d+) in my account$")
	public void i_have_in_my_account(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^my status is GREEN$")
	public void my_status_is_GREEN() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^my milage should be (\\d+),(\\d+)$")
	public void my_milage_should_be(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^my status is BLUE$")
	public void my_status_is_BLUE() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^my status is GOLD$")
	public void my_status_is_GOLD() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I travel (\\d+),(\\d+)$")
	public void i_travel(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^my status is \"([^\"]*)\"$")
	public void my_status_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
