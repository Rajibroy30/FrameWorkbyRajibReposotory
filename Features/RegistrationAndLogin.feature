#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Testing the Register and Login/Logout functionality to the application 
 

@Registration 
 Scenario: User can Register with valid information
 
 Given Users open the browser
 And Users Navigate to "https://demo.nopcommerce.com/"
 When Users click on the register button 
 And Users select the Gender
 And Users enter the Name 
 And Users enter Date of birth 
 And Users enter Valid Email
 And Users enter Company Name 
 And Users enter Password and Confirm Password 
 And Users click on Register Button 
 Then Users Finishes registration
 
 
 
 @LogoutandLogin 
 Scenario: User logs out and Logs back inn with correct email and password
	Given Users displayed successfully register message and Logs out
	When User clicks the Login button
	And Enters the Email and Password
 	Then Users Logs in and navigates to home page 
 
 
 