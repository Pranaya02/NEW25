Feature: Email

Scenario Outline: Send email to user

Given User must launch the application
When User should send email to register
"""
Hello <users>
Welcome to our community !...
Click on the below link for registration..
From Support team
"""

Examples:
| user |
| testUser1 |
| testUser2  |
