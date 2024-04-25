 
@Dropdown
Feature: Verify that user can able to create an dropdown types

Scenario: Validate that user can able to create an dropdown types by using valid credentials 

Given User should navigate to the Dropdown page
And User click on the add new button and Enter the dropdown type name
When User click on the save button 
Then Dropdown success message can be view by the user 

Scenario: validate that user can able to create an dropdown values by using valid credentials 

Given User click on the created dropdwon type aero button
And user click on the add new button 
When Enter the dropdown values  and click on the save button
Then Success message should be shown

Scenario: validate that user can able to edit the dropdown types name 

Given User should navigate to the edit dropdown page
And Edit the dropdown name 
Then user should view the success message 