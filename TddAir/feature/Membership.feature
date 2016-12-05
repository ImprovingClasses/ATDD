Feature: As a travellor, I want to
 login providing my User ID and email.

Scenario: Register a new member not having conflicts.
When traveler registers with username "bob" and email "bob@abc.com"
Then the traveler is "registered" as a member

Scenario: Register a new member not having conflicts.
When traveler registers with username "bob" and email ""
Then the traveler is "not registered" as a member

Scenario: Register a new member not having conflicts.
When traveler registers with username "bob" and email ""
Then the traveler is "not registered" as a member



