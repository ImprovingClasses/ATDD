import com.tddair.Member;
import com.tddair.Membership;
import com.tddair.TddAirApplication;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TDDAirChangedStatusSteps {
	
	private TddAirApplication airApplication = new TddAirApplication();
	private boolean result;
	
	@Given("^the Gold$")
	public void the_Gold() throws Throwable {
	    Membership membership = new Membership();
		membership.getPreviousStatus();
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    Membership membership = new Membership();
	    membership.getCurrentYearMiles();
	   
	    
	}

	@Then("^I verify the Blue in step$")
	public void i_verify_the_Blue_in_step() throws Throwable {
	  
	}

	@Given("^the Blue$")
	public void the_Blue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I verify the Green in step$")
	public void i_verify_the_Green_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
