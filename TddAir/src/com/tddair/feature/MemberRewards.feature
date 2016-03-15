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
When Member enters username "bob" email "bob@yada.com"
And Member joins rewards program
Then Member is status "Red" and miles are equal to "0"

Scenario: Uograde to Green
Given Existing Member "bob" has "24000" miles
When Member flies "1000" miles
Then Member is status "Green" and miles are equal to "25000"
