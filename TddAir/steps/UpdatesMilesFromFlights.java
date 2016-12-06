import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import java.util.List;

import com.tddair.FlightData;
import com.tddair.TddAirApplication;

public class UpdatesMilesFromFlights {
	TddAirApplication controller = new TddAirApplication();
	
	@Given("^these flights:$")
	public void these_flights(List<FlightData> arg1) throws Throwable {
		
		for(FlightData flight: arg1){
			controller.addFlight(flight);
		}
	}

	@When("^Flight \"([^\"]*)\"$")
	public void flight(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Member Miles (\\d+)$")
	public void member_Miles(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Member Status \"([^\"]*)\"$")
	public void member_Status(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
