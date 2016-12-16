Feature: Title of your feature
	I want to use this template for my feature file

Background:
Given these Flights:
| origin | destination | mileage | airline | number |
|  DFW   |   LAX       |  1200   |  AA     | 1211   |
|  ATL   |   ZZY       |  2200   |  UA     |  773   |
|  WAS   |   LAG       |   400   |  TD     |  211   |
|  DFW   |   VIC       |  3233   |  TD     | 8344   |
|  HOU   |   AUS       |   120   |  TD     | 3344   |
|  HOU   |   VIC       |  3244   |  SW     | 3434   |
|  TYT   |   LAG       |  5030   |  TD     |    1   |
|  DBY   |   MIS       |  5543   |  DA     |  333   |
|  MAN   |   SAS       | 13033   |  TD     |   23   |

Scenario: One TDDAir flight
Given A member with 10000 miles
When the member flights are:
|TD8344 |
Then the members status is "Red" and miles are 13233

Scenario: Two TDDAir flight
Given A member with 10000 miles
When the member flights are:
|TD8344 |
|TD211  |
Then the members miles are 13633

Scenario: Three TDDAir flight
Given A member with 10000 miles
When the member flights are:
|TD8344 |
|TD211  |
|TD23   |
Then the members miles are 26666


Scenario: Three Not TDDAir flight
Given A member with 10000 miles
When the member flights are:
|SW3434 |
|UA773  |
|AA1211 |
Then the members miles are 10000

Scenario: One TDDAir flights out of three 
Given A member with 10000 miles
When the member flights are:
|TD8344 |
|DA333  |
|AA1211 |
Then the members miles are 10120

Scenario: Two TDDAir flights out of three
Given A member with 10000 miles
When the member flights are:
|TD8344 |
|TD211  |
|AA1211 |
Then the members miles are 13633

