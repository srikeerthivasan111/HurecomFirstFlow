 
 @Mail
 Feature: Verify that user can able to create an mail configuration
 
 Scenario: Validate that user can able to configure the valid mail id 
 

 Given Click on the my account drop down button 
 When Select the mail configuration options
 And Enter the valid Email details 
 And click on the save button
 Then User should view the configuration mail
 
  @OrgMail
 Scenario: validate that user can able to configure the Organization Mail
 
 Given User should navigate to the Organization mail configuration page
 And User Enter the organization mail details 
 When User click on the save button of Organization Mail
 Then User can view that success message of Organization 
  
 
   