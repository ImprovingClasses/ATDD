Feature: Purchase Seat Upgrades.
	A member can use their miles to purchase a seat upgrade. 
	This moves them from an economy seat to a first class seat.
	Upgrade coupons are printed and delivered manually.

Status     Miles Cost
Red          10000
Green         9000
Blue          8000
Gold          7000


Scenario Outline: Purchase upgrades
Given A member <status> member with <purchasingMiles> 
When the member purchases <upgrades> number of upgrade coupons
Then the member has <coupons> and <remainingMiles> is still is <status>

Examples:
    | status  |purchasingMiles| upgrades | coupons | remainingMiles |
    |   "Red" |   10000       |    1     |   1     |         0      |
    |   "Red" |   20000       |    1     |   1     |     10000      |
    | "Green" |   10000       |    1     |   1     |      1000      |
    |  "Blue" |   10000       |    1     |   1     |      2000      |
    |  "Gold" |   10000       |    1     |   1     |      3000      |
    | "Green" |   27000       |    3     |   3     |         0      |
    | "Green" |   26999       |    3     |   2     |      8999      |
    |  "Blue" |   50000       |    2     |   2     |     34000      |
    |  "Gold" |   50000       |   10     |   7     |      1000      |

#Could also have column for existing upgrades.