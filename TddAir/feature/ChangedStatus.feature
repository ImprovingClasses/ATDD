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
Feature: Upgrading the member status
I want to use this template for my feature file

Scenario Outline: Changed of Status
Given the <previousYearStatus>
When I check for the <currentMiles> in step
Then I verify the <nextYearStatus> in step

Examples:
    | previousYearStatus  	| currentMiles 			| nextYearStatus 		|
    | Gold									|  12000   					| Blue			 				|
    | Blue 									|  5000   					| Green   					|
    | Green									|  5000							| Red								|
    | Red										|  400							| Red								|
    | Green									|	 30000						| Green							|
		| Blue									|  60000						| Blue							|
		| Gold									|	 80000						| Gold							|
		| Red										|	 30000						| Green							|
		| Red										|  60000						| Blue							|
		| Red										|  100000						| Gold							|
		| Green									|	 50500						| Blue							|
		| Green									|  100000						| Gold							|
		| Blue									|  100000						| Gold							|