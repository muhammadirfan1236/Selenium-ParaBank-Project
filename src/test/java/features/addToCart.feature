Feature: Bookcart Application tests

  Scenario Outline: Add to cart
    Given User navigate to the BookCart application
    And user login into the application with "<username>" and "<password>"
    And user search for a  "<book>"
    When user add the book to the cart
    Then the cart badge should get updated

    Examples: 
      | username | password | book    |
      | irfan    | Irfan123 | Roomies |
      
