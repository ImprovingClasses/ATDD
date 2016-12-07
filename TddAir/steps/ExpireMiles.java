import com.tddair.TddAirApplication;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

import com.tddair.Flight;

public class ExpireMiles {
	
	TddAirApplication app = new TddAirApplication();
	
	@Given("^User \"([^\"]*)\" with email \"([^\"]*)\" has current miles (\\d+) with (\\d+) with \"([^\"]*)\" with travel on \"([^\"]*)\" with (\\d+)$")
	public void user_with_email_has_current_miles_with_with_with_travel_on_with(String userId,
			  String email, int currMiles, int points,
			  String currStatus, String flight, int flightMiles) throws Throwable {
		app.registerTraveller( userId, email, currMiles, points, currStatus );
		app.addFlight( new Flight( flight, flightMiles));
	}
	
	@When("^User \"([^\"]*)\" status is recalculated at year end\\.$")
    public void user_status_is_recalculated_at_year_end(String userId) throws Throwable {
        app.recalculateUserStatus( userId );
    }

	@Then("^The Traveler \"([^\"]*)\"  level \"([^\"]*)\" is set$")
	public void the_Traveler_level_is_set(String userId, String expectedStatus) throws Throwable {
		String rewLevel = app.getStatus(userId);
	    assertTrue( rewLevel.equals(expectedStatus) );
	}
}
