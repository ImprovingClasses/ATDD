Feature: 
As a business traveler 
I want to register for 
So that I can recieve member benefits.


Scenario: Register an new member not having conflicts.
When the traveler registeres with a username "bob" and the email "bob@abc.com"
Then the traveler is "registered" as a member 

Scenario: Members are can register with only an email
When the traveler registers with a username "" and the email "bob@abc.com"
Then the traveler is "registered" as a member