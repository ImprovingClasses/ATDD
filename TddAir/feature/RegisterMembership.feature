Feature: Register Members in the Membership program
As a Traveler
I want to know join the membership program
In order to get loyalty rewards

Scenario: Add First Membership 
When Traveler selects identifier "bob" and email "bob@abc.com" when registering 
Then The traveler information is "recorded"

Scenario: Duplicate identifier
Given Traveler selects identifier "bob" and email "bob@abc.com" when registering 
When  Traveler selects identifier "bob" and email "bob@abc.com" when registering 
Then  The traveler information is "not recorded"

Scenario: Blank identifier
When  Traveler selects identifier "" and email "bob@abc.com" when registering 
Then  The traveler information is "recorded"

Scenario: Blank Email
When  Traveler selects identifier "bob" and email "" when registering 
Then  The traveler information is "not recorded"

Scenario: Bad Email Address
When  Traveler selects identifier "bob" and email "abc.com" when registering 
Then  The traveler information is "recorded"

Scenario: Numbers for identifier
When  Traveler selects identifier "1234" and email "bob@abc.com" when registering 
Then  The traveler information is "recorded"

Scenario: Different identifiers with same email
Given Traveler selects identifier "sue" and email "bob@abc.com" when registering 
When  Traveler selects identifier "bob" and email "bob@abc.com" when registering 
Then  The traveler information is "recorded"

Scenario: Records three Travels
Given Traveler selects identifier "joe" and email "joe@abc.com" when registering 
Given Traveler selects identifier "sue" and email "sue@abc.com" when registering 
When  Traveler selects identifier "bob" and email "bob@abc.com" when registering 
Then  The traveler information is "recorded"

Scenario: Records four Travels
Given Traveler selects identifier "moe" and email "moe@abc.com" when registering 
Given Traveler selects identifier "joe" and email "joe@abc.com" when registering 
Given Traveler selects identifier "sue" and email "sue@abc.com" when registering 
When  Traveler selects identifier "bob" and email "bob@abc.com" when registering 
Then  The traveler information is "recorded"

Scenario: Retrieve recorded information
Given Traveler selects identifier "bob" and email "bob@abc.com" when registering 
When  Traveler retrieves identifier "bob" information 
Then  The traveler information retrieved is "bob" and "bob@abc.com"