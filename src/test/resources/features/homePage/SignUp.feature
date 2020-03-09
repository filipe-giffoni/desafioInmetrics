#Author: filipe_giffoni@hotmail.com
@signup
Feature: Sign up
	
  Scenario Outline: Sign up for Julio de Lima website on Home page
    Given user opens browser and navigates to Julio de Lima website
    When user clicks on OK, I Wanna Sign Up Now button
    And fills the Name field with "<name>"
    And fills the Login field with "<login>"
    And fills the Password field with "<password>"
    And clicks on Save button
    Then user is signed in

    Examples: 
      |  name  |  login  | password |
      | Filipe | fgomes  | teste123 |
