Feature: As a travellor, I want to
  login providing my User ID and email.

  Scenario: Register a new member not having conflicts.
    When traveler registers with username "bob" , email "bob@abc.com" , initial miles 100
    Then the traveler "bob" is a member

  Scenario: Register a new member not having conflicts.
    When traveler registers with username "tom" , empty email "" , initial miles 1000
    Then the traveler "tom" is not a member

  Scenario: Register a new member not having conflicts.
    When traveler registers with username "dan" , email "otherUser@sdf.com" , initial miles 5000
    Then the traveler "dan" is a member

  Scenario: Register a new member not having conflicts.
    When traveler registers with username "" , email "sam@def.com" , initial miles 10000
    Then the traveler "sam@def.com" is a member

  Scenario: Register a new member not having conflicts.
    When traveler registers with username "sue" , email "sue.com" , initial miles 1000
    Then the traveler "sue" is not a member
