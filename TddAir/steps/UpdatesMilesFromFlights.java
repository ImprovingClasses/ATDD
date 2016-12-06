import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import java.util.List;

import com.tddair.FlightData;
import com.tddair.TddAirApplication;

public class UpdatesMilesFromFlights {
	TddAirApplication controller = new TddAirApplication();
	String status = "Undefined";
	
	@Given("^these flights:$")
	public void these_flights(List<FlightData> arg1) throws Throwable {
		
		for(FlightData flight: arg1){
			controller.addFlight(flight);
		}
	}
	
	@Given("^Preflight miles (\\d+)$")
	public void preflight_miles(int arg1) throws Throwable {
		controller.addMember("bob", "bob@abc.com", arg1);
	}

	@When("^Flight \"([^\"]*)\"$")
	public void flight(String arg1) throws Throwable {
		status = controller.sendOnFlight("bob",controller.getFlight(arg1));
	}

	@Then("^Member Miles (\\d+)$")
	public void member_Miles(int arg1) throws Throwable {
	    if (controller.getMemberMilesById("bob") != arg1) {
	    	throw new AssertionError("Bad miles comparison: " + (controller.getMemberMilesById("bob")) + " and : " + arg1);
	    }
	}

	@Then("^Member Status \"([^\"]*)\"$")
	public void member_Status(String arg1) throws Throwable {
		if (!status.equalsIgnoreCase(arg1)){
			throw new AssertionError("Invalid comparison between :" + status + " and :" + arg1);
		}
	}
}
