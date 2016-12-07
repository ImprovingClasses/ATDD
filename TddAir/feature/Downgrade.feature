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
Feature: Status Downgrade
	I want to use this to test Membership status downgrade

Scenario Outline: Status Downgrade
Given a member who has flown <currentMiles> and has <status>
When I reach end of year
Then he should have <yearMiles>, <totalMiles> and <newStatus> 

Examples:
    | currentMiles  | status  | yearMiles | totalMiles | newStatus |
    | 10000         | "Red"   | 0         | 10000      | "Red"     |
    | 10000         | "Green" | 0         | 10000      | "Red"     |
    | 10000         | "Blue"  | 0         | 10000      | "Green"   |
    | 10000         | "Gold"  | 0         | 10000      | "Blue"    |
    | 30000         | "Green" | 0         | 30000      | "Green"   |
    | 30000         | "Blue"  | 0         | 30000      | "Green"   |
    | 30000         | "Gold"  | 0         | 30000      | "Blue"    |
    | 60000         | "Blue"  | 0         | 60000      | "Blue"    |
    | 60000         | "Gold"  | 0         | 60000      | "Blue"    |
    | 80000         | "Gold"  | 0         | 80000      | "Gold"    |
