#Author: filipe_giffoni@hotmail.com
@login
Feature: Log In
	
  Scenario Outline: Log in for Julio de Lima website on Home page
    Given user opens browser and access Julio de Lima website
    When user clicks on Sign In
    And enters "<login>" into Login field
    And enters "<password>" into Password field
    And clicks on Sign In button
    Then user is logged in

    Examples: 
      |    login    |  password |
      | testetask20 | teste1234 |
