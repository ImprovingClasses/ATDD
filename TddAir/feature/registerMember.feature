Feature: register member
As a Traveller I want to register

Scenario: Register member Aro
When user "Aro" and email "Aro@Aro.com"
Then "Aro" is added

Scenario: Register member bob with different email
When user "bob" and email "aro@abc.com"
Then "bob" is added

Scenario: Register member empty string with valid email
When user "" and email "aro@abc.com"
Then "aro@abc.com" is added

Scenario: Register member Aro with empty email
When user "Aro" and email ""
Then "Aro" is not added


Scenario: Register member with empty user and email
When user "" and email ""
Then "" is not added



