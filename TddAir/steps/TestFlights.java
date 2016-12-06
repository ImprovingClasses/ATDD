	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.Given;
	import cucumber.api.PendingException;
	import com.tddair.*;
	import static org.junit.Assert.*;
	
	import com.tddair.Flight;

import java.util.Iterator;
import java.util.Vector;
import java.util.List;

public class TestFlights {
	TddAirApplication tddAirController = new TddAirApplication();
	
@Given("^these flights:$")
public void these_flights(List<Flight> flights) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	System.out.println("Printing out given flights");
	Iterator <Flight> it = flights.iterator();
    while(it.hasNext())
	{
	   Flight retrievedFlight = it.next();
	   String flightNumber = retrievedFlight.getFlightNumber();
	   int mileage = retrievedFlight.getMileage();
	   tddAirController.addFlight(flightNumber, mileage);
	}
 }

@Given("^user \"([^\"]*)\" has (\\d+) miles$")
public void user_has_miles(String arg1, int arg2) throws Throwable {
    tddAirController.addNewMembers(arg1, "bob@abc.com");	   
    tddAirController.addMileageToMember(arg1, arg2);
    
}

@When("^user \"([^\"]*)\" takes flights \"([^\"]*)\"$")
public void user_takes_flights(String arg1, String arg2) throws Throwable {
	 tddAirController.addFlightMileage(arg1, arg2);
}

@Then("^user \"([^\"]*)\" will have status \"([^\"]*)\"$")
public void user_will_have_status(String arg1, String arg2) throws Throwable {
	String level = tddAirController.getMemberLevel(arg1);
	System.out.println("MemberLevel = " + level + " Member total miles: " + 
	                   tddAirController.getMileage(arg1));
	assertEquals(arg2, level);
}
}
