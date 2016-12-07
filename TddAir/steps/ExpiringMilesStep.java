import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import java.util.List;

import com.tddair.TddAirApplication;

public class ExpiringMilesStep {
	TddAirApplication controller = new TddAirApplication();
	
	@Given("^Member current miles (\\d+) and Member currentStatus \"([^\"]*)\"$")
	public void member_current_miles_and_Member_currentStatus(int arg1, String arg2) throws Throwable {
		controller.addMember("bob", "bob@abc.com", arg1,arg2);
	}

	@When("^New Year$")
	public void new_Year() throws Throwable {
        controller.newYearMemberUpdate();
	}

	@Then("^Member new status will be \"([^\"]*)\"$")
	public void member_new_status_will_be(String arg1) throws Throwable {
        String status = controller.getMemberStatusById("bob");
        if (!status.equalsIgnoreCase(arg1)){
			throw new AssertionError("Invalid comparison of NewYear upgrades status between :" + status + " and :" + arg1);
		}
	}

	@Then("^Member YTD miles (\\d+)$")
	public void member_YTD_miles(int arg1) throws Throwable {
      int yTDMiles = controller.getMemberYTDMilesById("bob");
      if (yTDMiles != arg1){
			throw new AssertionError("Invalid comparison of NewYear upgrades yTDMiles between :" + yTDMiles + " and :" + arg1);
		}
	}

}
