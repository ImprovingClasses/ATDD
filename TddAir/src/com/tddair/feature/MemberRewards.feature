#Author: girija.panda@nokia.com
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
Feature: Title of your feature
	I want to use this template for my feature file

Scenario: New member
When Member registers username "bob" yada
Then Member status is "RED" and miles are equal to "0"

Scenario Outline: Upgrade to Green
Given Existing Member <name> has <start> miles
When Member <name> flies <flightMiles>
Then Member status is <status> and miles are equal to <end>



Examples:
    | name  	|start	| flightMiles |  end	|  status		|
    | "bob"		|0			|0						|	0			|"RED"			|
    | "bob"		|24000	|1500					|25500	|"GREEN"		|