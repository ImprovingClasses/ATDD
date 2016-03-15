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

Feature: Membership Rewards Registration Scenarios

Scenario: Add the first user
When User registers username "bob" and email "bob@yada.com"
And member is added
Then "bob" is added to our list

Scenario: Duplicate user
Given Existing username is "bob" and email is "bob@yada.com"
When User registers username "bob" and email "steve@yada.com"
And member is added
Then "bob" is not added to our list

Scenario: New unique user
Given Existing username is "bob" and email is "bob@yada.com"
When User registers username "bobby" and email "joe@yada.com"
And member is added
Then "bobby" is added to our list

Scenario: Invalid email address
When User registers username "bob" and email "yada"
And member is added
Then "bob" is added to our list

Scenario: Unique username, duplicate email
Given Existing username is "bob" and email is "bob@yada.com"
When User registers username "steve" and email "bob@yada.com"
And member is added
Then "steve" is added to our list

Scenario: Empty username
When User registers username "" and email "bob@yada.com"
And member is added
Then "" is added to our list

Scenario: Empty email
When User registers username "bob" and email ""
And member is added
Then "bob" is not added to our list

Scenario: Duplicate empty username
Given Existing username is "" and email is "bob@yada.com"
When User registers username "" and email "steve@yada.com"
And member is added
Then "" is added to our list

Scenario: All input empty
When User registers username "" and email ""
And member is added
Then "" is not added to our list


Scenario Outline: Switcheroo
When User registers username "bob@yada.com" and email "bob"
And member is added
Then "bob@yada.com" is added to our list

Examples:
    | name  |value | status |
    | name1 |  5   | success|
    | name2 |  7   | Fail   |