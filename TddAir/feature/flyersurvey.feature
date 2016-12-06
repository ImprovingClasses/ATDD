Feature: 
Flight Survey Membership Program
As an airline
I want to know who is interested in a frequent flyer rewards program
In order to record data

Scenario: User enters bob for username and bob@abc.com for email
When user registers with a username "bob" and the email "bob@abc.com" 
Then user is "registered" for reward program  

Scenario: User enters empty string for username and bob@abc.com for email
When user registers with a username "" and the email "bob@abc.com" 
Then user is "registered" for reward program         

Scenario: User enters bob for username and empty string for email
When user registers with a username "bob" and the email "" 
Then user is not "registered" for reward program    
 
Scenario: User enters bob for username and abc.com for email
When user registers with a username "bob" and the email "abc.com" 
Then user is "registered" for reward program    

Scenario: User enters bob for username and bob@abc.com for email
then user enters bob for username and an empty string for email
When user registers with a username "bob" and the email "bob@abc.com"
And user registers with a username "bob" and the email "" 
Then user is not "registered" for reward program      

Scenario: User enters sue for username and bob@abc.com for email
then user enters bob for username and bob@abc.com for email
When user registers with a username "sue" and the email "bob@abc.com"
And user registers with a username "bob" and the email "bob@abc.com" 
Then user is "registered" for reward program  

Scenario: User enters empty string for username and bob@abc.com for email
then user enters empty string for username and sue@abc.com for email
When user registers with a username "" and the email "bob@abc.com"
And user registers with a username "" and the email "sue@abc.com" 
Then user is "registered" for reward program         

Scenario: User enters 123 string for username and bob@abc.com for email
When user registers with a username "123" and the email "bob@abc.com" 
Then user is "registered" for reward program         

Scenario: User enters empty string for username and empty string for email
When user registers with a username "" and the email "" 
Then user is not "registered" for reward program                                                                                                                                                                              