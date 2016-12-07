Feature: Establish a reward level for a Traveler based on the number of miles flown.

  Background: 
    Given flights name and miles:
      | airline | mileage |
      | TDD10  |        5000 |
      | AA20   |        2000 |

  Scenario: A travelor on flight TDD10 gains air miles
    Given User "Bob" with initial miles 19000 and email "Bob@bob.com"
    When User "Bob" flies "TDD10"
    Then user "Bob" status is "RED" and miles are 24000

  Scenario: A travelor on flight TDD10 gains air miles
    Given User "Bob" with initial miles 20000 and email "Bob@bob.com"
    When User "Bob" flies "TDD10"
    Then user "Bob" status is "GREEN" and miles are 25000
    
  Scenario: A travelor on flight TDD10 gains air miles
    Given User "Sam" with initial miles 40000 and email "sam@sam.com"
    When User "Sam" flies "AA20"
    Then user "Sam" status is "GREEN" and miles are 40000
    

    