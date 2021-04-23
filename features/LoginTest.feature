# Each feature file contains one feature
# Cucumber does not support full Data-Driven testing (Excel, Csv). Only local tabels.
Feature: Test the login functionality of Vishnu

# A feature may have different scenarios 
Scenario: User logins with valid credentials

Given User is on the Login page
When User enters valid credentials and clicks Login
Then User is navigated to Projects tab