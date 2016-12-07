Feature: Upgrading users
Scenario Outline: Users buy upgrades
Given the Traveler enters a unique combination of a valid userId "Bob" and a valid emailAddress "bob@abc.com" and has accumulated <currencyMiles> currency miles with status of <initialStatus>
When the Traveler "Bob" purchases <numberOfPurchases> upgrades 
Then the Traveler successfully purchases <successfulPurchases> and has <remainingCurrencyMiles> remaining currency miles

Examples: Purcases table
|initialStatus|currencyMiles|numberOfPurchases|successfulPurchases|remainingCurrencyMiles	|
|"Red"				|0						|1								|0									|0											|
|"Red"				|9999					|1								|0									|9999										|
|"Red"				|10000				|1								|1									|0											|
|"Green"			|9000					|1								|1									|0											|
|"Blue"				|9000					|1								|1									|1000										|
|"Golden"			|50000				|10								|7									|1000										|