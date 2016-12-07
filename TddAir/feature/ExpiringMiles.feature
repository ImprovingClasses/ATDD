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


Feature: Expiring Miles

Scenario Outline: Expiuring Miles in a New Year
Given Member current miles <currentMiles> and Member currentStatus <currentStatus>
When New Year
Then Member new status will be <newStatus>
And Member YTD miles 0

Examples:
    | currentMiles  |currentStatus | newStatus |
    | 10000 |  "Red"     | "Red"   |
    | 10000 |  "Green"   | "Red"   |
    | 10000 |  "Blue"    | "Green" |
    | 10000 |  "Gold"    | "Blue"  |
    | 30000 |  "Green"   | "Green" | 
    | 30000 |  "Blue"    | "Green" | 
    | 30000 |  "Gold"    | "Blue"  | 
    | 60000 |  "Blue"    | "Blue"  | 
    | 60000 |  "Gold"    | "Blue"  |
    | 80000 |  "Gold"    | "Gold"  |  
            
                   
            
