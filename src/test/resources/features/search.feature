Feature: search bar
Scenario Outline: Searching for a product
Given I am on any page on the website
When I enter "<searchTerm>" into the search
Then I see the relevant search results for "<searchTerm>"
  Examples:
  |searchTerm|
  |dress|
  |sparta|
  |orange|

