Feature: Buying upgrades

Scenario Outline: Buying upgrades scenario
Given The member current miles <currentTotalMiles> and Member currentStatus <currentStatus>
When The member buys <numUpgrades> upgrades
Then The member has <finalTotalMiles> and status <finalStatus> and <boughtUpgrades> upgrades

Examples:
| currentTotalMiles | currentStatus | numUpgrades | finalTotalMiles | finalStatus | boughtUpgrades |
| 0                 | "Red"         | 1           | 0               | "Red"       | 0              |
| 10000             | "Red"         | 1           | 0               | "Red"       | 1              |
| 10000             | "Green"       | 1           | 1000            | "Green"     | 1              |
| 10000             | "Blue "       | 1           | 2000            | "Blue"      | 1              |
| 10000             | "Gold"        | 1           | 3000            | "Gold"      | 1              |
| 40000             | "Blue"        | 2           | 24000           | "Blue"      | 2              |
| 80000             | "Gold"        | 10          | 10000           | "Gold"      | 10             |
| 60000             | "Blue"        | 1           | 52000           | "Blue"      | 1              |
| 77000             | "Gold"        | 11          | 0               | "Gold"      | 11             |
| 77000             | "Gold"        | 12          | 0               | "Gold"      | 11             |
| 70000             | "Red"         | 6           | 10000           | "Red"       | 6              |