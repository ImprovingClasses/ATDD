Feature: Membership Entry
As a flier
I want to be able to register my User ID and password
In order to join the membership group

Scenario: Add New User
Given there is no registered user named "Bob" with email "bob@abc.com"
When I register with UserID "Bob" and email "bob@abc.com"
Then a new User will be "Registered"

Scenario: Add New User
Given there is no registered user named "" with email "bob@abc.com"
When I register with UserID "" and email "bob@abc.com"
Then a new User will be "Registered"

Scenario: Add New User
Given there is no registered user named "Bob" with email "bob@abc.com"
When I register with UserID "Bob" and email ""
Then a new User will be "Not Registered"

Scenario: Add New User
Given there is no registered user named "Bob" with email "bob@abc.com"
When I register with UserID "Bob" and email "abc.com"
Then a new User will be "Registered"

Scenario: Add New User
Given there is a registered user named "Bob" with email "bob@abc.com"
When I register with UserID "Bob" and email "bob@abc.com"
Then a new User will be "Not Registered"

Scenario: Add New User
Given there is a registered user named "Sue" with email "bob@abc.com"
When I register with UserID "Bob" and email "bob@abc.com"
Then a new User will be "Registered"

Scenario: Add New User
Given there is a registered user named "" with email "bob@abc.com"
When I register with UserID "" and email "sue@abc.com"
Then a new User will be "Registered"