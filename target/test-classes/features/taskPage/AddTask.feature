#Author: filipe_giffoni@hotmail.com
@login @signup
Feature: Add Task
	
  Scenario Outline: Add a task on Task page
    Given user clicks on Lets Add Some Tasks button
    When user clicks on Add A Task button
    And enters "<title>" into Title field
    And sets Date Limit for <days> from now
    And sets Time Limit for "<time>"
    And enters "<description>" into Tell Us More About It field
    And selects "<status>" option on Its Done comboBox
    And clicks on the Save button
    Then the task is displayed

    Examples: 
      |  title  | days |  time |   description    | status |
      | Title1  |   7  | 21:30 |    Description   |   Yes  |
      | Title2  |  10  | 17:30 |    Description   |   Not  |
