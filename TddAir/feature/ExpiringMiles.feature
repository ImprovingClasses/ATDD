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
Feature: Expiring miles
	As a awards manager I want to determine status based on previous year flight miles

@tag1
Scenario Outline: Determine Status
Given I have <starting status> and my miles flown current year <current year milage> 
When One year passes 
Then my status is <status>
And my current year milage is 0  



Examples: Status 
|starting status|current year milage|new year status|
|"Gold"         |0                  |"Blue"         |
|"Blue"         |0                  |"Green"        |
|"Green"        |0                  |"Red"          |
|"Red"          |0                  |"Red"          |
|"Gold"         |75000              |"Gold"         |
|"Blue"         |50000              |"Blue"         |
|"Green"        |25000              |"Green"        |