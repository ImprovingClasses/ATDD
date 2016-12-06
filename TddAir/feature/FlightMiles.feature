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
Feature: Add flight miles
	I want to use this template for my feature file

Background:
Given these flights:
| origin | destination | mileage | airline | number |
| "AAA"    | "BBB"         | 10000   | "TD"      | 1234   |
| "CCC"    | "DDD"         | 20000   | "TD"      | 1235   |
| "EEE"    | "FFF"         | 50000   | "AA"      | 1000   |
| "EEE"    | "FFF"         | 30000   | "MS"      | 4332   |
| "EEE"    | "FFF"         | 50000   | "AA"      | 1236   |
@tag1
Scenario: Complete a flight
Given a passenger with <initMiles>
When complete a <flights>
Then total <mileage> and <status>
| initMiles | flights | mileage | status |
| 0 | "TD1234" | 10000 | "Red" |
| 10000 | "TD1235" | 30000 | "Green" |
| 10000 | "TD1234,TD1235,AA1000" | 40000 | "Green" |
| 10000 | "AA1000" | 10000 | "Red" |
| 30000 | "TD1235" | 50000 | "Blue" |
| 60000 | "TD1235" | 80000 | "Gold" |
| 20000 | "AA1000,TD1236,TD1234,MS4332,TD1235" | 100000 | "Gold" |
| 60000 | "MS4332" | 60000 | "Blue" |