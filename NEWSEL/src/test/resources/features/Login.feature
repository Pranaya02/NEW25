Feature: Login into App

#Scenario: Valid Login
#
#Given User  is on Login Page
#When  User enters login Credential
#Then Should display Home Page

#Scenario: Valid Login
#
#Given User  is on Login Page
#When  User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Home Page


#Scenario Outline: Valid login
#
#Given User is on Login Page
#When User enters "<username>" and "‹password>"
#Then Should display Home Page
#Examples:
#|username | password |
#| tomsmith | SupersecretPassword!|
 #|testuser1 |welcome123 |
#| testuser2  | welcome123 |


Scenario: Valid login
Given User is on Login Page
When User enters login credentials
| tomsmith | SuperSecretPassword! |
Then Should display Home Page