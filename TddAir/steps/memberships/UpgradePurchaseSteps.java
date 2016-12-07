package memberships;

import static org.junit.Assert.assertEquals;

import com.tddair.AppManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpgradePurchaseSteps extends AppManager {
	
	int actualPurchasesMade;
	int actualRemainingCurrency;
	
	public UpgradePurchaseSteps() {
		super();
	}
	
	@Given("^the Traveler enters a unique combination of a valid userId \"([^\"]*)\" and a valid emailAddress \"([^\"]*)\" and has accumulated (\\d+) currency miles with status of \"([^\"]*)\"$")
	public void the_Traveler_enters_a_unique_combination_of_a_valid_userId_and_a_valid_emailAddress_and_has_accumulated_currency_miles_with_status_of(String userId, String emailAddress, int currencyMiles, String initialStatus) throws Throwable {
		app.registerMember(userId, emailAddress, currencyMiles);
		app.setMemberStatus(userId, initialStatus);
	}

	@When("^the Traveler \"([^\"]*)\" purchases (\\d+) upgrades$")
	public void the_Traveler_purchases_upgrades(String userId, int numberOfPurchases) throws Throwable {
	    actualPurchasesMade = app.memberMakesPurchase(userId, numberOfPurchases);
	    actualRemainingCurrency = app.getCurrencyMileage(userId);
	}

	@Then("^the Traveler successfully purchases (\\d+) and has (\\d+) remaining currency miles$")
	public void the_Traveler_successfully_purchases_and_has_remaining_currency_miles(int expectedSuccessfulPurchases, int expectedRemainingCurrency) throws Throwable {
		assertEquals(expectedSuccessfulPurchases, actualPurchasesMade);
		assertEquals(expectedRemainingCurrency, actualRemainingCurrency);
	}		
}
