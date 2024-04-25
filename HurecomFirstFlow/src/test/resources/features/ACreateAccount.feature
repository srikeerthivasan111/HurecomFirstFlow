@Create
Feature: Verify that user can able to create an account 
Scenario: Validate that user can able to create an user account by using the valid credentials

Given User click on the hurecom link
When User click on the create account button
And User Enter the valid credentials 
And User click on the Create button
Then Create user successfull message should be shown 