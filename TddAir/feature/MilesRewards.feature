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

Feature: Miles Rewards Classification

Scenario Outline: Instant Miles Rewards
Given Initial miles <currentMiles>
Then Memeber status <status>

Examples: Initial miles
    |currentMiles |status |
    |24999        | "Red"   |
    |25000        | "Green" |
    |49999        | "Green" |
    |50000        | "Blue"  |
    |74999        | "Blue"  |  
    |75000        | "Gold"  |
          

Scenario Outline: Status after Receiving Miles
Given Initial miles <currentMiles>
When flying miles <flyingMiles> 
Then Memeber status <status>

Examples: Miles update
    |currentMiles |flyingMiles|status   |
    | 10000       |  5000     | "Red"   |
    | 10000       |  20000    | "Green" |
    | 15000       |  10000    | "Green" |
    | 47000       |  5000     | "Blue"  |  
    | 30000       |  20000    | "Blue"  |
    | 60000       |  15000    | "Gold"  |
    | 80000       |  10000    | "Gold"  |
    | 20000       |  40000    | "Blue"  | 
    | 20000       |  80000    | "Gold"  |
    | 30000       |  50000    | "Gold"  |
    | 30000       |  10000    | "Green" | 
    | 60000       |  5000     | "Blue"  |
