
Feature: Test that status upgrade yearly as expected
	I want to test that at the end of the year status roll over and change
	according to thep point system.

Scenario: Test that a Gold member will become a Blue member if there are not enough points
Given Last year status of "GOLD" 
When Member accrues 12000 points during the current year
Then Next year member status is "BLUE"

Scenario: Test that a Blue member will become a Gold member if there are not enough points
Given Last year status of "BLUE" 
When Member accrues 12000 points during the current year
Then Next year member status is "GREEN"

Scenario: Test that a Green member will become a Red member if there are not enough points
Given Last year status of "GREEN" 
When Member accrues 12000 points during the current year
Then Next year member status is "RED"

Scenario: Test that a Red member will stay a Red member
Given Last year status of "RED" 
When Member accrues 12000 points during the current year
Then Next year member status is "RED"

Scenario: Test that a Red member will become a Green member if there are enough points
Given Last year status of "RED" 
When Member accrues 30000 points during the current year
Then Next year member status is "GREEN"

Scenario: Test that a Red member will become a Blue member if there are enough points
Given Last year status of "RED" 
When Member accrues 60000 points during the current year
Then Next year member status is "BLUE"

Scenario: Test that a Red member will become a Gold member if there are enough points
Given Last year status of "RED" 
When Member accrues 80000 points during the current year
Then Next year member status is "GOLD"

Scenario: Test that a Green member will stay a Green member
Given Last year status of "GREEN" 
When Member accrues 30000 points during the current year
Then Next year member status is "GREEN" 

Scenario: Test that a Green member will become a Blue member if there are enough points
Given Last year status of "GREEN" 
When Member accrues 60000 points during the current year
Then Next year member status is "BLUE"

Scenario: Test that a Green member will become a Gold member if there are enough points
Given Last year status of "GREEN" 
When Member accrues 80000 points during the current year
Then Next year member status is "GOLD"

Scenario: Test that a Blue member will stay a Blue member
Given Last year status of "BLUE" 
When Member accrues 60000 points during the current year
Then Next year member status is "BLUE"

Scenario: Test that a Blue member will become a gold member if there are enough points
Given Last year status of "BLUE" 
When Member accrues 80000 points during the current year
Then Next year member status is "GOLD"

Scenario: Test that a Gold member will stay a Gold member
Given Last year status of "GOLD" 
When Member accrues 80000 points during the current year
Then Next year member status is "GOLD"