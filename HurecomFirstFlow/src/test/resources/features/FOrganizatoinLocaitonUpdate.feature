
@OrgLocation
Feature: Verify that user can able to update the Organizatoin Location details 

Scenario: Validate that user can able to update the organization Location as valid details 

Given user is on the Update organization location page 
When user click on the Update button
And user Update the Brach name and click on the update button
Then user Should view the update successfull message 