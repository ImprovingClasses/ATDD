#Author: brett@yada.com
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


Scenario: Add the first user
When Entered username is "bob"
	And Entered email is "bob@yada.com"
Then "bob" is "added" to our list

Scenario: Duplicate user
Given Existing username is "bob"
And Existing email is "bob@yada.com"
When Entered username is "bob"
And Entered email is "steve@yada.com"
Then "bob" is "not added" to our list

Scenario: New unique user
Given Existing username is "bob"
And Existing email is "bob@yada.com"
When Entered username is "bobby"
And Entered email is "joe@yada.com"
Then "bobby" is "added" to our list

Scenario: Invalid email address
When Entered username is "bob"
And Entered email is "yada"
Then "bob" is "added" to our list

Scenario: Unique username, duplicate email
Given Existing username is "bob"
And Existing email is "bob@yada.com"
When Entered username is "steve"
And Entered email is "bob@yada.com"
Then "steve" is "added" to our list

Scenario: Empty username
When Entered username is ""
And Entered email is "bob@yada.com"
Then "" is "added" to our list

Scenario: Empty email
When Entered username is "bob"
And Entered email is ""
Then "bob" is "not added" to our list

Scenario: Duplicate empty username
Given Existing username is ""
And Existing email is "bob@yada.com"
When Entered username is ""
And Entered email is "steve@yada.com"
Then "" is "added" to our list

Scenario: All input empty
When Entered username is ""
And Entered email is ""
Then "" is "not added" to our list


Scenario Outline: Switcheroo
When Entered username is "bob@yada.com"
And Entered email is "bob"
Then "bob@yada.com" is "added" to our list

Examples:
    | name  |value | status |
    | name1 |  5   | success|
    | name2 |  7   | Fail   |