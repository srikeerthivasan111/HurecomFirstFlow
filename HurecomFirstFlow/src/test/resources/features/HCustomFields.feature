 
 @Custom
 Feature: Verify that user can able to create an custom fields
 
 Scenario: Validate that user can able to create an custom fields bu using valid credentials 
 
 Given User is on the custom Fields Page
 When User click on the Create Custom fields button
 And User Enter the custom fields details as candidate personal fields
 And User should click on the save button
 Then user can view that successfull message 
 
 
 Scenario: Validate that user can able to edit the custom fields 
 
 Given User should navigate to the custom fields edit page 
 And User should edit the name of the custom fields 
 Then User click on the save button and view the message 
 
 Scenario: Validate that user can able to delete the custom fields
 
 Given User should navigate to the custom fields page 
 And User Click on the delete button
 And user should view the delete popup message 
 When User click on the yes button 
 Then Custom field should be deleted