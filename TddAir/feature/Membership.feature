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
Feature: Membership
	As a user I want to record my user details

@tag1
Scenario: Register a new member not having conflicts
When the traveler registers with a userid "bob" and the email "bob@abc.com"
Then the traveler is "registered" as a member 

@tag2
Scenario: Register a new member without a userid
When the traveler registers with a userid "" and the email "bob@abc.com"
Then the traveler is "registered" as a member 
