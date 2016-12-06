Feature: As a travellor, I want to
  login providing my User ID and email.

  Scenario: Register a new member not having conflicts.
    When traveler registers with username "bob" and email "bob@abc.com"
    Then the traveler is "bob" as a member

  Scenario: Register a new member not having conflicts.
    When traveler registers with username "bob" and empty email ""
    Then the traveler "bob" is not registered as a member

  Scenario: Register a new member not having conflicts.
    When traveler registers with username "dan" and email "sdf.com"
    Then the traveler is "registered" as a member

  Scenario: Register a new member not having conflicts.
    When traveler registers with empty username "" and valid email "sam@def.com"
    Then the traveler is "registered" as a member

  Scenario: Register a new member not having   conflicts.
    When traveler tries to registers with username "sam" and email "abc.com"
    Then the traveler is "registered" as a member
