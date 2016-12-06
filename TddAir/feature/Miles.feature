
Feature:  Set the miles for users and display their Miles Group Status

Scenario Outline: Set the miles for users and display their Miles Group Status
Given I want to check miles <currentMiles> miles
When I want to add miles <addedMiles>
Then I verify the miles <membershipStatus> group

Examples:
    | currentMiles|  addedMiles	| membershipStatus |
    |     0		    | 		 0    	| 			"Red"	     |
    |     0		    |      1      |       "Red"      |
    |   24999     |      1      |      "Green"     |
    |   25000     |      1      |      "Green"     |
    |   44999     |      1      |       "Blue"     |
    |   50000     |      1      |       "Blue"     |
    |   74999     |      1      |       "Gold"     |
    |   75000     |      1      |       "Gold"     |
