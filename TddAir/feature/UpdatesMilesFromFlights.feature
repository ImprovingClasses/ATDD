Feature: Updates miles from flights

Scenario Outline: Add miles based on flights
Given these flights:
| number | miles |
| TD1234 | 10000 |
| TD1235 | 20000 |
| TD1236 | 50000 |
| AA1000 | 50000 |
| MS4332 | 30000 |
Given Preflight miles <initialMiles>
When Flight <flightId>
Then Member Miles <finalMiles>
Then Member Status <status>

Examples: Flights miles
| initialMiles | flightId | finalMiles | status  |
| 0            | "TD1234" | 10000      | "Red"   |
| 10000        | "TD1235" | 30000      | "Green" |
| 10000        | "AA1000" | 10000      | "Red"   |
| 30000        | "TD1235" | 50000      | "Blue"  |
| 60000        | "TD1235" | 80000      | "Gold"  |
| 60000        | "MS4332" | 60000      | "Blue"  |