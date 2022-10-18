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

Feature: User adds items to the cart for checkout 
  

@AddToCart1 
  Scenario: User adds first item to the cart
  
   Given Users navigates to home page 
   When User Selects the Computers Tab
   And User clicks the desktop icon
   And The User selects the item to add to cart
   And User selects the option of the item
   Then User clicks the add to cart button
   And The User views the item added onto the cart
   
   
 @AddToCart2 
  Scenario: User adds Second item to the Shopping cart
    
    Given User Selects the Electronics Tab
    When User clicks the Cell phones icon
    And The User selects the Second item to add to cart
    And User enters the Quantity of the item
    Then The User clicks the add to cart button
   	And The User views all the item added onto the cart
    
    
    
    
    
    
    
    