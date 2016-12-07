Feature: Track users yearly travel miles and evaluate at 
    beginning of year to establish starting status.
 
 
  Scenario Outline: Assign a reward level to a Traveler based on the current miles flown.
  Given User <UserId> with email <EmailId> has current miles <CurrentMiles> with <Points> with <Status> with travel on <Flight> with <FlightMiles> 
  When User <UserId> status is recalculated at year end.
  Then The Traveler <UserId>  level <ExpectedStatus> is set
  
  Examples:  Initialize Travelor reward level
  |UserId	|EmailId      |CurrentMiles	|Status     | Points 	| Flight 	| FlightMiles	| ExpectedStatus|
  |"Bob" 	|"bob@abc.com"|0           	|"GREEN"    |  35000 	| "TDD12" |   4000 			|  "RED" 				|
 	|"Sam" 	|"sam@abc.com"|35000       	|"BLUE"	    |  35000 	| "TDD12" |   0 			  |  "GREEN"			|
 	|"Tom" 	|"tom@abc.com"|79000        |"GOLDEN"   |  79000 	| "TDD12" |   49000			|  "BLUE" 			|
 	|"Sue" 	|"sue@abc.com"|35000        |"GREEN"    |  75000 	| "TDD12" |   50000			|  "RED" 				|
 
  
 