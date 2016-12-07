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
Feature: Purchase upgrades
	I want to use this to purchase upgrades


@tag2
Scenario Outline: Purchase Upgrades
Given a member with <miles> and <status>
When he purchases <numTickets>
Then he should have <purchased> tickets, <newMiles> remaining and <newStatus>

Examples:
    | miles  | status  | numTickets | purchased | newMiles | newStatus |
    | 0      | "Red"   | 1          | 0         | 0        | "Red"     |
    | 10000  | "Red"   | 1          | 1         | 0        | "Red"     |
    | 10000  | "Green" | 1          | 1         | 1000     | "Green"   |
    | 10000  | "Blue"  | 1          | 1         | 2000     | "Blue"    |
    | 10000  | "Gold"  | 1          | 1         | 3000     | "Gold"    |
    | 40000  | "Blue"  | 2          | 2         | 24000    | "Blue"    |
    | 60000  | "Blue"  | 1          | 1         | 52000    | "Blue"    |
    | 77000  | "Gold"  | 11         | 11        | 0        | "Gold"    |
    | 77000  | "Gold"  | 12         | 11        | 0        | "Gold"    |
    | 70000  | "Red"   | 6          | 6         | 10000    | "Red"     |
