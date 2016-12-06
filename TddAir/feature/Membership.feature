Feature: Determine if the userId and email are registered.


  Scenario: Register a new memeber without conflicts
    When the traveler registers with a username "bob" and the email "bob@avc.com"
    Then the traveler is "registered" as a member


  Scenario: Do not register a new memeber without conflicts that has no userId
    When the traveler registers with a username "" and the email "bob@avc.com"
    Then the traveler is "not registered" as a member


  Scenario: Do not register a new user if the userId is not unique
    When the traveler registers with a username "bob" and the email "bob@avc.com"
    When the traveler registers with a username "bob" and the email "notbob@avc.com"
    Then the traveler is "not registered" as a member


  Scenario: Do not register a new user if there is no email address
    When the traveler registers with a username "bob" and the email ""
    Then the traveler is "not registered" as a member
    
  Scenario: Register a new memeber without conflicts if the email does not contain an @
    When the traveler registers with a username "bob" and the email "bobavc.com"
    Then the traveler is "registered" as a member 
  
  Scenario: Do not register a new user if there is no email address or user id
    When the traveler registers with a username "" and the email ""
    Then the traveler is "not registered" as a member
    
  Scenario: Register a new memeber without conflicts if the email address is already used
    When the traveler registers with a username "Tim" and the email "bob@avc.com"
    When the traveler registers with a username "Allen" and the email "bob@avc.com"
    Then the traveler is "registered" as a member