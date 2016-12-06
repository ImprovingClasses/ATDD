Feature: Establish a reward level for a Traveler based on the number of miles flown.
    
  Scenario Outline: Assign a reward level to a Traveler based on the current miles flown.
  Given User <UserId> with email <EmailId> has current miles <CurrentMiles>
  When User <UserId> flies they get additional <TravelMiles>
  Then The Traveler <UserId> reward level <RewardLevel> is set
  
  Examples:  Initialize Travelor reward level
  |UserId|EmailId      |CurrentMiles|RewardLevel|TravelMiles|
  |"Bob" |"bob@abc.com"|24999       |"RED"      |     0     |
  |"Sam" |"sam@abc.com"|25000				|"GREEN"		|			0			|
  |"Sara"|"bob@abc.com"|50000|"BLUE"|0|
  |"Sue"|"bob@abc.com"|15000|"RED"|0|
  |"Bob"|"bob@abc.com"|75000|"GOLDEN"|0|
  |"Bob"|"bob@abc.com"|49999|"GREEN"|0|
  |"Bob"|"bob@abc.com"|74999|"BLUE"|0|
  |"Bob"|"bob@abc.com"|24999|"GREEN"|500|
  |"Bob"|"bob@abc.com"|49999|"BLUE"|1000|
  |"Bob"|"bob@abc.com"|74999|"GOLDEN"|1000|

 