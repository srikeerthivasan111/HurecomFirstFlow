 
 @Teams 
 Feature: Verify that user can able to create an Users
 
 Scenario: Validate that can able to create an user by using valid credentials 
 
 Given User should navigate to the Teams menu
 And User click on the Create User button
 And Enter the users valid credentials 
 When User click on the Create button
 Then User Can view that Success message
 
 
 Scenario: Validate that user can able to create an user as manager
 
 Given User should enter the manager details
 And User click on the create button
 Then User can view the success message on the users page	
 
 
 Scenario: Validate that user can able to create Teams
 
 Given User should navigate to teams page 
 And user click on the Create team menu
 And Enter the Teams valid details 
 And Add the users in the team
 When User click on the Update button
 Then User can view that success message for creating the teams  