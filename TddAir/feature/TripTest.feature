
Feature: Title of your feature
	I want to use this template for my feature file
Background:
Given these flights:
| flightNumber   | mileage |
| TD1      | 1000  |
| TD2      | 2000  |
| TD3      | 3000  |
| TD4      | 4000  |
| AA1      | 1000  |
| AA2      | 2000  |


Scenario: Bob with 24000 existing miles takes trip {TD1, TD2} 
Given user "bob" has 24000 miles
When user "bob" takes flights "TD1"
Then user "bob" will have status "Green"

Scenario: Bob with 49000 existing miles takes trip {TD3, AA1} 
Given user "bob" has 49000 miles
When user "bob" takes flights "AA1"
And user "bob" takes flights "TD3"
Then user "bob" will have status "Blue"

Scenario: Bob with 49000 existing miles takes trip {TD3, AA1} 
Given user "bob" has 49000 miles
When user "bob" takes flights "AA1"
And user "bob" takes flights "AA2"
Then user "bob" will have status "Green"

Scenario: Bob with 74000 existing miles takes trip {TD3, AA1} 
Given user "bob" has 74000 miles
When user "bob" takes flights "TD1"
Then user "bob" will have status "Golden"

Scenario: Bob with 49000 existing miles takes trip {TD3, AA1} 
Given user "bob" has 0 miles
And user "bob" takes flights "AA2"
Then user "bob" will have status "Red"

Scenario: Bob with 49000 existing miles takes trip {TD3, AA1} 
Given user "bob" has 0 miles
And user "bob" takes flights "TD4"
Then user "bob" will have status "Red"

Scenario: Bob with 49000 existing miles takes trip {TD3, AA1} 
Given user "bob" has 0 miles
When user "bob" takes flights "TD1"
When user "bob" takes flights "TD2"
And user "bob" takes flights "TD3"
Then user "bob" will have status "Red"