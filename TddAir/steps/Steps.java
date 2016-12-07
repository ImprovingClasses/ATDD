
import cucumber.api.PendingException;

import com.tddair.Flight;
import com.tddair.TddAirApplication;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

import java.util.List;

public class Steps {
	
	private TddAirApplication tdd = new TddAirApplication();
	private boolean results;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	@When("^the traveler registers with a username \"([^\"]*)\" and the email \"([^\"]*)\"$")
	public void the_traveler_registers_with_a_username_and_the_email(String userid, String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		results = tdd.addMember(userid, email);
	   
	}

	@Then("^the traveler is \"([^\"]*)\" as a member$")
	public void the_traveler_is_as_a_member(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		if(arg1.equalsIgnoreCase("registered")) {
			//Registered
			assertTrue(results);
		} else {
			//Not-Registered
			assertFalse(results);
		}
		
	}
	
	@Given("^I want to check miles (\\d+) miles$")
	public void i_want_to_check_miles_miles(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I want to add miles (\\d+)$")
	public void i_want_to_add_miles(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I verify the miles \"([^\"]*)\" group$")
	public void i_verify_the_miles_group(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Given("^these flights$")
	public void these_flights(List<Flight> flightList) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		for(Flight myFlight : flightList){
			tdd.addFlight(myFlight.getOrigin(), myFlight.getDestination(),
					myFlight.getMileage(), myFlight.getFullFlightNumber());
		}
	}

	@When("^\"([^\"]*)\" flies flight \"([^\"]*)\"$")
	public void flies_flight(String userId, String flightNumber) throws Throwable {
		
		//Add member to modify with new miles
	   tdd.addMember("Chris", "Chris@email.com");
	   //Add single flight and update member miles
	   tdd.updateMember(userId, tdd.getFlight(flightNumber));
	   
	   assertEquals(userId, tdd.getMember(userId).getUserId());
	   assertEquals(1000, tdd.getMember(userId).getMiles());
	   
	}

	@Then("^\"([^\"]*)\" has (\\d+) miles and status is \"([^\"]*)\"$")
	public void has_miles_and_status_is(String userId, int milesFlown, String newStatus) throws Throwable {

		   assertEquals(userId, tdd.getMember(userId).getUserId());
		   assertEquals(milesFlown, tdd.getMember(userId).getMiles());
		   assertEquals(newStatus, tdd.getMember(userId).getColorStatus().toString());
	}

	@Given("^Last year status of \"([^\"]*)\"$")
	public void last_year_status_of(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Member accrues (\\d+) points during the current year$")
	public void member_accrues_points_during_the_current_year(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Next year member status is \"([^\"]*)\"$")
	public void next_year_member_status_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
