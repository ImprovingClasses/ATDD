	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.Given;
	import cucumber.api.PendingException;
	import com.tddair.*;
	import static org.junit.Assert.*;

public class TestPointPlan {
	TddAirApplication TddAirController = new TddAirApplication();
	boolean success = false;
	String username = "";
	int milesForYear = 0;
	int points = 0;
	String currentStatus = "Red";
	String email = "bob@abc.com";
	

@Given("^member \"([^\"]*)\" flew (\\d+) this year$")
public void member_flew_this_year(String arg1, int arg2) throws Throwable {
	//success = TddAirController.addNewMembers(arg1, "bob@abc.com");
	//success = TddAirController.addMileageToMember(arg1, arg2);
	//int mileage = TddAirController.getMileage(arg1);
	//assertEquals(arg2, mileage);
	username = arg1;
	milesForYear = arg2;
}

@Given("^member finished with (\\d+)$")
public void member_finished_with(int arg1) throws Throwable {
      points = arg1;	
  
}

@Given("^current status is \"([^\"]*)\"$")
public void current_status_is(String arg1) throws Throwable {
    currentStatus = arg1;
	success = TddAirController.addCurrentMembers(username, email, currentStatus, points);
	success = TddAirController.addMileageToMember(username, milesForYear);
	assertTrue(success);
}

@Then("^new status is \"([^\"]*)\"$")
public void new_status_is(String arg1) throws Throwable {
     success = TddAirController.downgradeMemberStatus(username);
     String status = TddAirController.getMemberStatus(username);
     assertEquals(arg1, status);
     assertEquals(TddAirController.getMileage(username),0);
     assertEquals(TddAirController.getMemberPoints(username), points + milesForYear);
}
}
