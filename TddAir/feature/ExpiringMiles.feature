Feature: Expiring Miles Test
Scenario Outline: Expiring Miles
Given the Traveler enters a unique combination of a valid userId "Bob" and a valid emailAddress "bob@abc.com" and has flown <flownMiles> miles with status of <initialStatus>
When 1 year has passed 
Then the Traveler has a status of <expectedStatus>

Examples: Yearly Status
    | flownMiles  | initialStatus   | expectedStatus   | 
    | 0						| "Red"						| "Red"						 |
    | 0       		| "Green"   			| "Red"						 |
    | 0						| "Blue"					| "Green"					 |
    | 0       		| "Golden"   			| "Blue"					 |
		| 75000   		| "Golden"   			| "Golden"				 |
		| 50000   		| "Blue"   			  | "Blue"				   |
		| 25000   		| "Green"   			| "Green"				   |
		| 74999   		| "Golden"   			| "Blue"				 	 |
		| 75000   		| "Red"   			  | "Golden"				 |