Feature: Users are on flights

Background:
Given these flights:
|flightNumber	|mileage		|
|TD1					|1000				|
|TD25					|25000			|
|TD50					|50000			|
|AA50					|50000			|
|US1					|1000				|

Scenario Outline: User takes flight
Given the Traveler enters a unique combination of a valid userId "Bob" and a valid emailAddress "bob@abc.com" and mileage of <initalMileage>
When the Traveler "Bob" takes <userFlight>
Then the Traveler status be <mileageStatus> and mileage should be <finalMileage>

Examples: Inital Mileage Status
|initalMileage|userFlight	|finalMileage	|
|0						|TD50				|50000				|
|0						|AA50				|0						|
|0						|US1				|0						|


