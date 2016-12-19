package com.tddair;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReceiveMilesForFlightsStep {
    
    TddAirApplication app = new TddAirApplication(new FlightDao());
    String identifier = "bob";
    String email = "bob@abc.com";
    
    @Before
    public void before(){
        app.enroll(identifier, email);
    }
    
    
    @Given("^these Flights:$")
    public void these_Flights(List<Flight> flights) throws Throwable {
        for(Flight flight: flights){
            app.addFlight(flight.getOrigin(), 
                    flight.getDestination(), 
                    flight.getMileage(),
                    flight.getAirline(),
                    flight.getNumber() );
        }
    }

    @Given("^A member with (\\d+) miles$")
    public void a_member_with_miles(int miles) throws Throwable {
        app.addMemberFlightMiles(identifier, miles);
    }

    @When("^the member flights are:$")
    public void the_member_flights_are(List<String> flightNumbers) throws Throwable {
        app.addMemberFlights(identifier, flightNumbers);
    }

    @Then("^the members miles are (\\d+)$")
    public void the_members_miles_are(int miles) throws Throwable {
        assertEquals(miles, app.getMilesFor(identifier));
    }

    // alternative if you need to check the status as well.
    @Then("^the members status is \"([^\"]*)\" and miles are (\\d+)$")
    public void the_members_status_is_and_miles_are(String status, int miles) throws Throwable {
        assertEquals(status, app.getStatusFor(identifier));
        assertEquals(miles, app.getMilesFor(identifier));
    }
    
}
