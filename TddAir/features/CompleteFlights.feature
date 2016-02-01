Feature: CompleteFlights
  As a Member
  I want my flights tracked
  So that my balance is increased and status is upgraded

  0-24999 Red
  25000-49999 Green
  50000-74999 Blud
  75000 or more Golden

  Scenario: Red to Red
    Given a customer registers with "bob" and "bob@abc.com"
    When member "bob" takes flight "QF191"
    Then that member has "Red" status
    And that member has 7490 ytd miles
    
  Scenario: Red to Green
    Given a customer registers with "bob" and "bob@abc.com" and has 20000 miles
    When member "bob" takes flight "QF191"
    Then that member has "Green" status
    And that member has 27490 ytd miles

