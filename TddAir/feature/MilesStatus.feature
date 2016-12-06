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
Feature: Add Miles
As a User
I want to add received miles
in order to see my membership level

Scenario Outline: Membership levels
Given the <current miles>
When I check for the <miles received> 
Then I verify the <membership level> 

Examples: 
    | current miles | miles received 	| membership level 		|
    | 0 						|  0   						| "Red" 							|
    | 0 						|  10000   				| "Red" 							|
    | 0 						| 25000 					| "Green" 						|
    | 0 						| 50000 					| "Blue" 							|
    | 0 						| 75000 					| "Gold" 							|
		| 10000					| 60000						| "Blue"							|
		| 40000					| 11000						| "Blue"							|
		| 70000					| 10000						| "Gold"							|
		| 20000					| 10000						| "Green"							|
		| 10000					| 75000						| "Gold"							|
		| 40000					| 40000						| "Gold"							|
		| 9999					| 1000						| "Red"								|
		| 24999					| 1000						| "Green"							|
		| 49999					| 1000						| "Blue"							|
		| 74999					| 1000						| "Gold"    					|