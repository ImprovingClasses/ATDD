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
| origin | destination | mileage | airline | number  |
| AAA    | BBB         | 321     | TD      | 123     |
| CCC    | DDD         | 456     | TD      | 654     |
| EEE    | FFF         | 789     | XX      | 987     |

@tag1
Scenario: Complete a flight
Given a passenger with <initMiles>
When complete a <flights>
Then total <mileage> and <status>


Examples:
    
