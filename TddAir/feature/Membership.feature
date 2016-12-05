Feature: These scenarios are used to describe when the system should or should not register a new member

Scenario: Traveler enters a unique combination of a valid user ID and a valid email address 
When the Traveler enters a unique combination of a valid userId "Bob" and a valid emailAddress "bob@abc.com"
Then the Traveler membership status is "registered"

Scenario: Traveler enters a no user ID and valid email address
When the Traveler enters an empty userId "" and a valid emailAddress "bob@abc.com"
Then the Traveler membership status is "registered"

Scenario: Traveler enters a valid user ID and no email address
When the Traveler enters a valid userId "Bob" and an empty emailAddress ""
Then the Traveler membership status is "not registered"

Scenario: Traveler enters a duplicate combination of a valid user ID and a valid email address 
When the Traveler enters a duplicate combination of a valid userId "Bob" and a valid emailAddress "bob@abc.com"
Then the Traveler membership status is "not registered"