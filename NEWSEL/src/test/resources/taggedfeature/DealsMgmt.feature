@PhaseThree


Feature: Task Management
CRUD Operations for Task


Background: Login into app
 @SmokeTest
Scenario: Create a Deal
Given User is logged in
When User create a Deal
 
 @RegressionTest @SmokeTest
Scenario: Update a Deal
Given User is logged in
When User update a Deal
 
 @RegressionTest
Scenario: Delete a  Deal
Given User is logged in
When User delete a Deal