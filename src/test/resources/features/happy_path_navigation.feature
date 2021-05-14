Ability: To buy a products

  Scenario: Add product to basket and view basket
    Given I am on the home page
    When I click on the add to cart button
    And I click on the view cart
    Then The cart page opens and I see the product

  Scenario: Passing the cart page
    Given I am on the cart page
    When I click the Proceed to checkout button
    Then I go to the authentication page


  Scenario: Login and proceed to address page
    Given I am on the authentication page
    When I enter my username
    And I enter my password
    And I click the sign in button
    Then I continue to the addresses page

  Scenario: Pass the addresses page
    Given I am on the address page
    And I have an address saved
    When I click proceed to checkout button
    Then I continue to the shipping page

  Scenario: Pass the shipping page
    Given I am on the shipping page
    When I tick the terms of service box
    And I click on the proceed to checkout button
    Then I proceed to the payment page

  Scenario: Pass the payment page using bank wire
    Given I am on the payment page
    When I click pay by bank wire
    Then I go to the final payment page

  Scenario: Pass the final payment page
    Given I am on the final payment page
    When I click I confirm my order
    Then I am taken to the confirmation page

  Scenario: Check the order succeeded
    Given I am on the order confirmation page
    When My order was successful
    Then I should see written confirmation
