 
 
 @Login
 @Full
 Feature: Verify that user can able to login into the application
 
 Scenario: Validate that user can able to login by using the valid credentials
 
 Given User is on the application login page
 When User Enter the Login credentials
 And User Click on the login button
 Then User should view the Application Homepage 