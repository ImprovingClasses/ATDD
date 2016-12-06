Feature: Loyalty
As a Product Owner
I want to get userID and email
in order to add a traveller

Scenario: Register a new member
When I have a traveller with userID "bob" and email of "bob@abc.com"
Then the traveller is "registered" as a member

Scenario: Register a new member not having conflicts
When I have a traveller with userID "" and email of "bob@abc.com"
Then the traveller is "registered" as a member

Scenario: Register a new member not having conflicts
When I have a traveller with userID "sue" and email of "bob@abc.com"
Then the traveller is "registered" as a member

Scenario: Register a new member not having conflicts
When I have a traveller with userID "bob" and email of ""
Then the traveller is "registered" as a member

Scenario: Register a new member
When I have a traveller with userID "bob" and email of "abc.com"
Then the traveller is "registered" as a member

Scenario: Register a new member
When I have a traveller with userID "" and email of ""
Then the traveller is "registered" as a member

Scenario: Register a new member
When I have a traveller with userID "123" and email of "123@abc.com"
Then the traveller is "registered" as a member