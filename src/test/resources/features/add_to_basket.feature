Ability: To add to basket

  Scenario: Add item to basket when on home page
    Given I am on the home page
    When I add an item to the basket
    Then I see an item in my basket