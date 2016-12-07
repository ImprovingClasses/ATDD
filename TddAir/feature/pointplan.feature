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
Feature: testing annual point/status processing

Scenario Outline: Annual point processing
Given member "bob" flew <milesflown> this year
	And member finished with <totalpoints>
	And current status is <status>
Then new status is <newstatus>

Examples:
    | milesflown | totalpoints | status  | newstatus | 
    | 4000       | 35000       | "Green" | "Red"     |
    | 0          | 35000       | "Blue"  | "Green"   |
    | 49000      | 79000       | "Golden"| "Blue"    |
    | 50000      | 75000       | "Green" | "Blue"    |
    | 4000       | 4000        | "Red"   | "Red"     |    