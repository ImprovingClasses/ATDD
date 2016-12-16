package com.tddair;

public interface FlightProvider {

    Flight getFlightBy(String flightNumber);

    void addFlight(String origin, String destination, int mileage, String airline, int number);

    int getFlightMilesBy(String flightNumber);

}