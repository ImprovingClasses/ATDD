	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.PendingException;
	import com.tddair.*;
	import static org.junit.Assert.*;
	
	
public class TestInputs {
	TddAirApplication TddAirController = new TddAirApplication();
	boolean success = false;
	

@When("^user registers with a username \"([^\"]*)\" and the email \"([^\"]*)\"$")
public void user_registers_with_a_username_and_the_email(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	success = TddAirController.addNewMembers(arg1, arg2);
	
}

@Then("^user is \"([^\"]*)\" for reward program$")
public void user_is_for_reward_program(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(success);
}

@Then("^user is not \"([^\"]*)\" for reward program$")
public void user_is_not_for_reward_program(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    assertFalse(success);
}
	

}