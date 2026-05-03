Feature: Amazon India End-to-End Shopping Flow

  Scenario Outline: Search, select, add to cart, and proceed to checkout
    Given I navigate to the Amazon India application
    When I search for a product "<productName>"
    And I select the first product from the search results
    And I add the product to the cart
    And I proceed to buy from the cart page
    Then I should be redirected to the Amazon Sign-In page

    Examples:
      | productName |
      | laptop      |