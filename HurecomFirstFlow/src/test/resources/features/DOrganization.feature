@OrgLocation
@Organization
@Org
Feature: Verify that user can able to create an Organization 
Scenario: Validate that user can able to create an organization by using valid credentials 

Given User should navigate to the Organization page 
And User click on the Create Organization button
And Enter the Organization name and click on the create button
Then User should view the Creating organization successfull message 


