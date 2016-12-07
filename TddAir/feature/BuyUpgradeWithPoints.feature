Feature: Buy upgrades with miles
	I want to buy upgrades with my miles and current status.

Scenario: User Chris has a RED status with 20000 miles and wants to purchase an upgrade.
Given A member with a status of "RED" and has 20000 miles
When member purchases 1 upgraded seat
Then member has 1 upgrade and member status is still "RED" and has 10000 miles left

Scenario: User Chris has a GREEN status with 30000 miles and wants to purchase an upgrade.
Given A member with a status of "GREEN" and has 30000 miles
When member purchases 1 upgraded seat
Then member has 1 upgrade and member status is still "GREEN" and has 21000 miles left

Scenario: User Chris has a BLUE status with 60000 miles and wants to purchase an upgrade.
Given A member with a status of "BLUE" and has 60000 miles
When member purchases 1 upgraded seat
Then member has 1 upgrade and member status is still "BLUE" and has 52000 miles left

Scenario: User Chris has a GOLD status with 100000 miles and wants to purchase an upgrade.
Given A member with a status of "GOLD" and has 100000 miles
When member purchases 1 upgraded seat
Then member has 1 upgrade and member status is still "GOLD" and has 93000 miles left

Scenario: User Chris has a RED status with 24000 miles and wants to purchase an upgrade.
Given A member with a status of "RED" and has 24000 miles
When member purchases 2 upgraded seat
Then member has 2 upgrade and member status is still "RED" and has 4000 miles left

Scenario: User Chris has a GREEN status with 48000 miles and wants to purchase an upgrade.
Given A member with a status of "GREEN" and has 48000 miles
When member purchases 2 upgraded seat
Then member has 2 upgrade and member status is still "GREEN" and has 30000 miles left

Scenario: User Chris has a BLUE status with 60000 miles and wants to purchase an upgrade.
Given A member with a status of "BLUE" and has 60000 miles
When member purchases 2 upgraded seat
Then member has 2 upgrade and member status is still "BLUE" and has 44000 miles left

Scenario: User Chris has a GOLD status with 100000 miles and wants to purchase an upgrade.
Given A member with a status of "GOLD" and has 100000 miles
When member purchases 2 upgraded seat
Then member has 2 upgrade and member status is still "GOLD" and has 86000 miles left

Scenario: User Chris has a RED status with 1 miles and wants to purchase an upgrade.
Given A member with a status of "RED" and has 1 miles
When member purchases 1 upgraded seat
Then member has 0 upgrade and member status is still "RED" and has 1 miles left

Scenario: User Chris has a BLUE status with 1 miles and wants to purchase an upgrade.
Given A member with a status of "BLUE" and has 1 miles
When member purchases 1 upgraded seat
Then member has 0 upgrade and member status is still "BLUE" and has 1 miles left

Scenario: User Chris has a GREEN status with 1 miles and wants to purchase an upgrade.
Given A member with a status of "GREEN" and has 1 miles
When member purchases 1 upgraded seat
Then member has 0 upgrade and member status is still "GREEN" and has 1 miles left

Scenario: User Chris has a GOLD status with 1 miles and wants to purchase an upgrade.
Given A member with a status of "GOLD" and has 1 miles
When member purchases 1 upgraded seat
Then member has 0 upgrade and member status is still "GOLD" and has 1 miles left
