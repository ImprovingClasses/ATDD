import cucumber.api.PendingException;

import com.tddair.Member;
import com.tddair.TddAirApplication;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class Steps {
	
	private TddAirApplication tdd = new TddAirApplication();
	private boolean results;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	@When("^the traveler registers with a username \"([^\"]*)\" and the email \"([^\"]*)\"$")
	public void the_traveler_registers_with_a_username_and_the_email(String userid, String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tdd.addMember(userid, email);
	   
	}

	@Then("^the traveler is \"([^\"]*)\" as a member$")
	public void the_traveler_is_as_a_member(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("registerd".equalsIgnoreCase(arg1) == results);
	}
}
