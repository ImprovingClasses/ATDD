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
Feature: Milage status
	As a user I want my status to reflect my milage

@tag1
Scenario Outline: Update Mileage
Given I have <starting milage> in my account 
When I travel <added milage> 
Then my status is <status>
And my milage should be <total miles> 



Examples: Adding miles 
|starting milage|added milage|status  |total miles|
|0              |0           |"RED"   |0          |
|24,999         |2           |"GREEN" |25,001     |
|49,999         |2           |"BLUE"  |50,001     |
|74,999         |2           |"GOLD"  |75,001     |
|24,999         |0           |"RED"   |24,999     |
|49,999         |0           |"GREEN" |49,999     |
|74,999         |0           |"BLUE"  |74,999     |
|30,000         |0           |"GREEN" |30,000     |
|20,000         |30,000      |"BLUE"  |50,000     |
|20,000         |55,000      |"GOLD"  |75,000     |
|30,000         |45,000      |"GOLD"  |75,000     |