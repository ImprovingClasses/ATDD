	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.Given;
	import cucumber.api.PendingException;
	import com.tddair.*;
	import static org.junit.Assert.*;

public class TestLevel {
	TddAirApplication tddAirController = new TddAirApplication();
	String level = "";

	@Given("^flyer has (\\d+) mileage$")
	public void flyer_has_mileage(int arg1) throws Throwable {
	    tddAirController.addNewMembers("bob", "bob@abc.com");	   
	    tddAirController.addMileageToMember("bob", arg1);
	}

	@When("^flyer travels (\\d+)$")
	public void flyer_travels(int arg1) throws Throwable {
	    tddAirController.addMileageToMember("bob", arg1);
	}

	@Then("^flyer status is \"([^\"]*)\"$")
	public void flyer_status_is(String arg1) throws Throwable {
		level = tddAirController.getMemberLevel("bob");
		assertEquals(arg1, level);
	}
}
