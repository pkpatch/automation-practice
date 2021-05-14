Feature: Navigate through the website using the footer

  Scenario Outline: I am on the home page and I would like to navigate through the site
    Given I am on the home page
    When I click on "<nav>" in the footer
    Then I will go to the "<nav>" page
    Examples:
    |nav|
    |Women|
    |specials|

