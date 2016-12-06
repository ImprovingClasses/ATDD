Feature: TDD airlines user acceptance criteria

Scenario: Register a valid userid, email pair
When the traveler registers with a username "bob" and the email "bob@abc.com"
Then were travelers "recorded"

Scenario: Register a valid userid, email pair
When the traveler registers with a username "" and the email "bob@abc.com"
Then were travelers "recorded"

Scenario: Register a valid userid, email pair
When the traveler registers with a username "bob" and the email ""
Then were travelers "not recorded"

Scenario: Register a valid userid, email pair
When the traveler registers with a username "bob" and the email "abc.com"
Then were travelers "not recorded"

Scenario: Register a valid userid, email pair
Given the traveler registers with a username "bob" and the email "bob@abc.com"
When the traveler registers with a username "bob" and the email "bob@abc.com"
Then were travelers "not recorded"

Scenario: Register a valid userid, email pair
Given the traveler registers with a username "bob" and the email "bob@abc.com"
When the traveler registers with a username "sue" and the email "bob@abc.com"
Then were travelers "recorded"

Scenario: Register a valid userid, email pair
Given the traveler registers with a username "" and the email "bob@abc.com"
When the traveler registers with a username "" and the email "sue@abc.com"
Then were travelers "recorded"

Scenario: Register a valid userid, email pair
When the traveler registers with a username "123" and the email "bob@abc.com"
Then were travelers "not recorded"

Scenario: Register a valid userid, email pair
When the traveler registers with a username "" and the email ""
Then were travelers "recorded"