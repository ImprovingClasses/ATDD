#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Flight status
	As a user I want to add miles based on flights

@tag1	
Scenario Outline: Update Mileage

Background: 
	Given these Flights:
| flightNumber | miles |
| TD749        | 500   |
| AA1096       | 1000  |
| US4332       | 250   |

Given I have <email> and <userId> and <starting miles> in my account 
When I take flight <flights> 
Then my status is <status>
And my milage should be <total miles> 



Examples: Trips 
| email        | userId | starting miles | Flights | status | total milage |
|"bob@abc.com" | "bob"  | 0              | "TD749" | "Red"  | 500          |
