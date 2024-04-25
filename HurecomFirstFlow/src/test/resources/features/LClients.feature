 
 
 @Cients
 Feature: Verify  that user can able to create an Clients 
 
 
 Scenario: Validate that user can able to create an Clients by using the valid credentials 
 
 Given User should navigate to the Jobs configuration Clients page 
 And User Click on the Create client button
 And User enter the client details 
 When user click on the create client button
 Then user can view the client created successfull message
 
 Scenario: Validate that user can able to create an client location
 
 Given user should redirected to update client page
 And User click on the create client location button
 And  User Enter the client location details 
 When User click on the  client location create button 
 Then user can view success message of creating client location
 
 Scenario: Validate that user can able to create an Spoc
 
 Given User should navigate to the Client Spoc page
 And User click on the Create spoc button
 When User Enter the Spoc Details and click on the create
 Then user can view that success message of creating client spoc 
 