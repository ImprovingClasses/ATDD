Feature: Member Mileage Scenarios

Scenario Outline: Member Mile on creation
Given the Traveler enters a unique combination of a valid userId "Bob" and a valid emailAddress "bob@abc.com" and mileage of <initalMileage>
When the Traveler "Bob" requests their mileage status
Then the Traveler status should be <mileageStatus>

Examples: Inital Mileage Status
|initalMileage	|mileageStatus|
|0							|"Red"				|
|24999					|"Red"				|
|25000					|"Green"			|
|49999					|"Green"			|
|50000					|"Blue"				|
|74999					|"Blue"				|
|75000					|"Golden"			|

Scenario Outline: Member Gains Mileage
Given the Traveler enters a unique combination of a valid userId "Bob" and a valid emailAddress "bob@abc.com" and mileage of <initalMileage>
And the Traveler "Bob" gains <newMileage>
When the Traveler "Bob" requests their mileage status
Then the Traveler status should be <mileageStatus>

Examples: Traveler Miles Added
|initalMileage	|newMileage		|mileageStatus|
|0							|1						|"Red"				|
|24999					|1						|"Green"			|
|25000					|1						|"Green"			|
|49999					|1						|"Blue"				|
|50000					|1						|"Blue"				|
|74999					|1						|"Golden"			|
|75000					|1						|"Golden"			|
|0							|50000				|"Blue"				|
|0							|75000				|"Golden"			|
|25000					|50000				|"Golden"			|