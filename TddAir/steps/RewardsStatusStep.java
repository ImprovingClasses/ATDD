import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import com.tddair.TddAirApplication;

public class RewardsStatusStep {

	TddAirApplication controller = new TddAirApplication();
	String status = "";

	@Given("^Initial miles (\\d+)$")
	public void initial_miles(int arg1) throws Throwable {
		controller.addMember("bob", "bob@abc.com", arg1);
		status = controller.getMemberStatusById("bob");
	}
	
	@When("^flying miles (\\d+)$")
	public void flying_miles(int arg1) throws Throwable {
		status = controller.addMilesToMember("bob",arg1);
	}	

	@Then("^Memeber status \"([^\"]*)\"$")
	public void memeber_status(String arg1) throws Throwable {
		if (!status.equalsIgnoreCase(arg1)){
			throw new AssertionError("Invalid comparison between :" + status + " and :" + arg1);
		}
	}
}
