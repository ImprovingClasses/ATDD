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
Feature: Title of your feature
	I want to use this template for my feature file

@tag1
Scenario Outline: Mileagetransitions
Given flyer has <Balance> mileage
When flyer travels <flightmiles>
Then flyer status is <Level>

Examples:
    | Balance  | flightmiles | Level |
    | 0				 | 24999	     | "Red" |
    | 0				 | 25000	     | "Green" |
    | 0				 | 50000       | "Blue" |
    | 0				 | 500   	     | "Red" |
    | 0				 | 75000	     | "Golden" |
    | 0				 | 49999	     | "Green" |
    | 0				 | 74999	     | "Blue" |
    | 24999		 | 13000	     | "Green" |
    | 49999		 | 500	       | "Blue" |
    | 74500		 | 500	       | "Golden" |