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
Feature: Mileage
	As a Member, check my status after certain events


Scenario Outline: Fly Miles

Given a member with <Start> miles
When the member flies <Distance> miles
Then his flyer status should be <Status>

Examples:
    | Start  | Distance | Status  |
    | 10000  |  5000    | "Red"   |
    | 10000  |  20000   | "Green" |
    | 15000  |  10000   | "Green" |
    | 47000  |  5000    | "Blue"  |
    | 30000  |  20000   | "Blue"  |
    | 60000  |  15000   | "Gold"  |
    | 80000  |  10000   | "Gold"  |
    | 20000  |  40000   | "Blue"  |
    | 20000  |  80000   | "Gold"  |
    | 30000  |  50000   | "Gold"  |
    | 30000  |  10000   | "Green" |
    | 60000  |  5000    | "Blue"  |
    | 24999  |  0       | "Red"   |
    | 25000  |  0       | "Green" |
    | 49999  |  0       | "Green" |
    | 50000  |  0       | "Blue"  |
    | 74999  |  0       | "Blue"  |
    | 75000  |  0       | "Gold"  |
