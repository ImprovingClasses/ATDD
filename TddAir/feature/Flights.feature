Feature: Title of your feature
	I want to use this template for my feature file
	
  Background:
    Given these flights 
    
      |Origin|Destination|  Miles     |FlightNumber|
      |"DAL" | "PHX"     | 1000       |"TD100"     |
	    |"NYC" | "LAX"     | 2000       |"TD101"     |
	    |"CHI" | "ALT"     | 3000		    |"TD200"     |
	    |"CHI" | "ALT"     | 3000		    |"AA200"     |
	    |"CHI" | "ALT"     | 3000		    |"AA200"     |
	    
  Scenario: Getting the first person working
    When "Chris" flies flight "TD100"
    Then "Chris" has 1000 miles and status is "RED"
    

      