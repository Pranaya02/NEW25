Feature: Google Page Search

Background: Launch App
Given User launch google page

Scenario: Search Java tutorial
When  User search Java tutorial
Then Should display Java result page

Scenario: Search Selenium tutorial
When  User search Selenium Tutorial
Then Should display Selenium result page