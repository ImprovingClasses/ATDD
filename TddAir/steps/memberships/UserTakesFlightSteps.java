package memberships;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.tddair.AppManager;
import com.tddair.Flight;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserTakesFlightSteps extends AppManager {

	private int actualMileage =-1;

	public UserTakesFlightSteps() {
		super();
	}
	
	@Given("^these flights:$")
	public void these_flights(DataTable dataTable) throws Throwable {
		List<Flight> flights = dataTable.asList(Flight.class);
		
		for (Flight flight : flights) {
			app.addFlight("FAK", "FAK", flight.getMileage(), flight.getFlightNumber());
		}
	}
	
	@When("^the Traveler \"([^\"]*)\" takes TD(\\d+)$")
	public void the_Traveler_takes_TD(String userId, int mileage) throws Throwable {
		app.userTakesFlight(userId, "TD" + mileage);
		actualMileage = app.getYearlyMemberMileage(userId);
	}
	
	@Then("^the Traveler status be <mileageStatus> and mileage should be (\\d+)$")
	public void the_Traveler_status_be_mileageStatus_and_mileage_should_be(int expectedMileage) throws Throwable {
		assertEquals(expectedMileage, actualMileage);
	}
	
	@When("^the Traveler \"([^\"]*)\" takes AA(\\d+)$")
	public void the_Traveler_takes_AA(String userId, int mileage) throws Throwable {
		app.userTakesFlight(userId, "AA" + mileage);
		actualMileage = app.getYearlyMemberMileage(userId);
	}
	
	@When("^the Traveler \"([^\"]*)\" takes US(\\d+)$")
	public void the_Traveler_takes_US(String userId, int mileage) throws Throwable {
		app.userTakesFlight(userId, "US" + mileage);
		actualMileage = app.getYearlyMemberMileage(userId);
	}
}
