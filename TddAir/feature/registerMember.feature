Feature: register member
As a Traveller I want to register

Scenario: Register member
When user "bob" and email "bob@abc.com"
Then "bob" is added

Scenario: Register member doesn't match name and email id
When user "bob" and email "aro@abc.com"
Then "bob" is added

Scenario: Register member doesn't have name and valid email id
When user "" and email "aro@abc.com"
Then "bob" is added

Scenario: Register member doesn't have email and valid name
When user "Aro" and email ""
Then "Aro" is not added


Scenario: Register member doesn't have name and email
When user "" and email ""
Then user is not added

Scenario: Register member that is already exist
when user name "Aro" and email id "Aro@Aro.com"
Then "Aro" is not added

Scenario: Register member that is already exist
when user name "Aro" and email id "Aro@Aro.com"
Then "Aro" is not   added

