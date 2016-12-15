Feature: Members Achieve Status Levels
  Members will get rewards for flying with us.
  For this iteration, the total miles earned for each member in a month are entered manually.
  The system needs to calculate the status based on the total miles earned
    
  Rules:
  Status Total Miles Flown
  Red    0      - 24999
  Green  25,000 - 49,999
  Blue   50,000 - 74,999
  Gold   75,000 or more
  
    
Scenario Outline: Member Flies Miles
Given A traveler earns <startingMiles> miles 
When A traveler earns <miles> miles
Then A traveler is status <status> and total miles <total>

Examples: Adding Miles
    | startingMiles | miles | status | total |
    | 0             |  0    | "Red"  |     0 |
    | 0             | 24999 | "Red"  | 24999 | 
    | 0             | 25000 |"Green" | 25000 |
    | 0             | 49999 |"Green" | 49999 |
    | 0             | 50000 |"Blue"  | 50000 |
    | 0             | 74999 |"Blue"  | 74999 |
    | 0             | 75000 |"Gold"  | 75000 |
    | 0             |100000 |"Gold"  |100000 |
    | 24999         |  1    |"Green" | 25000 |
    | 49999         |  1    |"Blue"  | 50000 |
    | 74999         |  1    |"Gold"  | 75000 |
    | 24999         | 25000 |"Green" | 49999 |
    | 24999         | 50000 |"Blue"  | 74999 |
    | 24999         | 50001 |"Gold"  | 75000 |
    | 25000         | 24999 |"Green" | 49999 |
    | 25000         | 25000 |"Blue"  | 50000 |
    | 50000         | 24999 |"Blue"  | 74999 |
    | 50000         | 25000 |"Gold"  | 75000 |
    | 75000         |  0    |"Gold"  | 75000 |
    | 75000         | 25000 |"Gold"  |100000 |
 
     