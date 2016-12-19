package com.tddair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class MembershipStatusByFlightMilesTest {

    private class DefaultFlightProvider implements FlightProvider {

        @Override
        public Flight getFlightBy(String flightNumber) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void addFlight(String origin, String destination, int mileage, String airline, int number) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public int getFlightMilesBy(String flightNumber) {
            // TODO Auto-generated method stub
            return 0;
        }
        
    }
    String identifier = "bob";
    String email = "bob@abc.com";
    
    @Before
    public void before(){
        
    }
    
    @Test
    public void zeroFlightsNoMiles () {
        
        TddAirApplication application = new TddAirApplication(new DefaultFlightProvider());
    
        application.enroll(identifier, email);
        application.addMemberFlights(identifier, Arrays.asList(new String[]{}));

        assertEquals(0, application.getMilesFor(identifier));
        
    }
    @Test
    public void oneFlightAddesMiles () {
        
        TddAirApplication application = new TddAirApplication(new DefaultFlightProvider(){

            @Override
            public int getFlightMilesBy(String flightNumber) {
                // TODO Auto-generated method stub
                return 1000;
            }}
        );
    
        application.enroll(identifier, email);
        application.addMemberFlights(identifier, Arrays.asList(new String[]{"TD1000"}));

        assertEquals(1000, application.getMilesFor(identifier));
        
    }

    @Test
    public void twoFlightAddesMiles () {
        
        TddAirApplication application = new TddAirApplication(new DefaultFlightProvider(){

            @Override
            public int getFlightMilesBy(String flightNumber) {
                if("TD1000".equalsIgnoreCase(flightNumber))
                    return 1000;
                else return 1001;
            }}
        );
    
        application.enroll(identifier, email);
        application.addMemberFlights(identifier, Arrays.asList(new String[]{"TD1000", "TD1001"}));

        assertEquals(2001, application.getMilesFor(identifier));
        
    }
    
    @Test
    public void OneTDAndOneAAFlightAddesMiles () {
        
        TddAirApplication application = new TddAirApplication(new DefaultFlightProvider(){

            @Override
            public int getFlightMilesBy(String flightNumber) {
                if("TD1000".equalsIgnoreCase(flightNumber))
                    return 1000;
                else return 1001;
            }}
        );
    
        application.enroll(identifier, email);
        application.addMemberFlights(identifier, Arrays.asList(new String[]{"TD1000", "AA1001"}));

        assertEquals(1000, application.getMilesFor(identifier));
        
    }
}
