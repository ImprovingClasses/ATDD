import com.tddair.Member;
import com.tddair.StatusEnum;
import com.tddair.TddAirApplication;

import static org.junit.Assert.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpiringMilesSteps {
	
	private final TddAirApplication controller = new TddAirApplication();
	private Member bob = null;
	private static final String USER_ID = "bob";
	private static final String EMAIL = "bob@abc.com";

	@Given("^I have \"([^\"]*)\" and my miles flown current year (\\d+)$")
	public void i_have_and_my_miles_flown_current_year(String status, int currentYearMilesFlown) throws Throwable {
		 controller.addMember(USER_ID, EMAIL, StatusEnum.valueOf(status));
		 bob = controller.getMember(USER_ID, EMAIL);
		 bob.addMiles(currentYearMilesFlown);
	}

	@When("^One year passes$")
	public void one_year_passes() throws Throwable {
	    controller.rollYear();
	}

	@Then("^my new year status is \"([^\"]*)\"$")
	public void my_new_year_status_is(String newYearStatus) throws Throwable {
	    assertEquals(newYearStatus, bob.getStatus());
	    assertEquals(0, bob.getYrMiles());
	}
}
