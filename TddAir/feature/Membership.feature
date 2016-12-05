Feature: TDD airlines user acceptance criteria

Scenario: Register a valid userid, email pair
When the traveler registers with a username "bob" and the email "bob@abc.com"
Then the traveler is "registered" as a member

Scenario: Register a valid userid, email pair
When the traveler registers with a username "" and the email "bob@abc.com"
Then the traveler is "registered" as a member

Scenario: Register a valid userid, email pair
When the traveler registers with a username "bob" and the email ""
Then the traveler is "not registered" as a member