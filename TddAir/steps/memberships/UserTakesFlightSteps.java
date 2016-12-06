package memberships;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

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
			app.addFlight("FAK", "FAK", flight.getMileage(), flight.getFullFlightNumber(), 0);
		}
	
//		Map<String, String> flights = dataTable.asMap(String.class, String.class);
//		
//		for(String key: flights.keySet()) {
//			System.out.println("+++++++ Key = " + key + ", value = " + flights.get(key) + " +++++++ ");
//			app.addFlight("FAKE", "FAKE", Integer.parseInt(flights.get(key).trim()), key, Integer.parseInt(key.substring(2)));
//		}
	}
	
	@When("^the Traveler \"([^\"]*)\" takes TD(\\d+)$")
	public void the_Traveler_takes_TD(String userId, int flightName) throws Throwable {
		app.addMileage(userId, app.getFlightMileage("TD" + flightName));
		actualMileage = app.getMemberMileage(userId);
	}
	
	@Then("^the Traveler status be <mileageStatus> and mileage should be (\\d+)$")
	public void the_Traveler_status_be_mileageStatus_and_mileage_should_be(int expectedMileage) throws Throwable {
		assertEquals(expectedMileage, actualMileage);
	}
	
	@When("^the Traveler \"([^\"]*)\" takes AA(\\d+)$")
	public void the_Traveler_takes_AA(String arg1, int arg2) throws Throwable {
		// NOOP
	}
	
	@When("^the Traveler \"([^\"]*)\" takes US(\\d+)$")
	public void the_Traveler_takes_US(String arg1, int arg2) throws Throwable {
		// NOOP
	}
}
