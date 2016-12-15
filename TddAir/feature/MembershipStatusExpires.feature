Feature: Membership status levels expire yearly
  Members status renewed based on miles flown in previous year
  Members only downgraded one level of status regardless of miles flown in the previous year

Scenario Outline: Expire Date Happens
Given A member flew <yearlyMiles> with <status> level
When the year passes
Then the members has <newYearStatus>

Examples:
    | yearlyMiles  |  status | newYearStatus |
    |    10000     |   "Red" |    "Red"      |
    |    25000     | "Green" |    "Green"    |
    |    50000     |  "Blue" |     "Blue"    |
    |    75000     |  "Gold" |     "Gold"    |
    |        0     |   "Red" |      "Red"    |
    |        0     | "Green" |      "Red"    |
    |        0     |  "Blue" |    "Green"    |
    |        0     |  "Gold" |     "Blue"    |
    |    50000     |  "Gold" |     "Blue"    |
    |   150000     |  "Gold" |     "Gold"    |
    |    25000     |  "Gold" |     "Blue"    |
    |    25000     |  "Blue" |    "Green"    |
    