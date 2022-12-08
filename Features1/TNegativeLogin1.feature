Feature: Testing Login functionality to the application

Scenario Outline: This scenario tests all the invalid username and password
Description: We can use boundary tests, State Transition techniques, etc.

Given I open the browser and I navigate to the application
When I click on the sign in button on homepage
And I enter "<email>" and "<password>"
And I click on the login button
Then I am suppose to get an error message

Examples:


| email                     | password 		 	 |
| RajibRoy0@me.com          | SmartTech100    |
| RajibRoy00@me.com 				| SmartTech10    |
| RajibRoy000@me.com 			  | SmartTech100   |
| RajibRoy0000@me.com    	  | SmartTech100   |
