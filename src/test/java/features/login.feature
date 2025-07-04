Feature: Bookcart Application tests


  Scenario: Login should be success
  
    Given User navigate to the BookCart application login
    And User clicks on the login button
    And User enter the username as "irfan"
    And User enter the password as "Irfan123"
    When User click on the login button
    Then Login shoild be success
  
  Scenario: Login should not be success
  
    Given User navigate to the BookCart application login
    And User clicks on the login button
    And User enter the username as "koushik"
    And User enter the password as "passkoushik"
    When User click on the login button
    But Login shoild fail