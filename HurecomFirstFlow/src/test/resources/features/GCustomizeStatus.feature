 
 @Status
 Feature: Verify that user can able to add and update the status 
 
 Scenario: Validate that user can able to add the status by using valid credentials
 
 Given User should navigate to the custom Configuration page
 When User Click on the status Aero button
 And User click on the add button and add the status 
 And User Enter the new Status name and click on the save button
 Then User can view the Created status name 
 
 @Delete
 Scenario: Validate that user can able to delete the status 
 
 Given user is on the Customize status page
 And Click on the Delete buttton
 When User click on the yes button on the popup message 
 Then User can view that successfull message 
 
 
 @Edit
 Scenario: Validate that user can able to edit the status
 
 Given user click on the status edit button
 And Edit the name and Enter the Deatils in the Status
 When Click on the save button 
 Then User can view that success message 