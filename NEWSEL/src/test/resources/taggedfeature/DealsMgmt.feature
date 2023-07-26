@PhaseTwo
Feature: Task Management
CRUD Operations for Task

Scenario: Create a Deal
Given User is logged in
When User create a Deal
 
 @SmokeTest
Scenario: Update a Deal
Given User is logged in
When User update a Deal
 
 @RegressionTest
Scenario: Delete a  Deal
Given User is logged in
When User delete a Deal