Feature: Cart presents list of products

  Scenario Outline: Product can be added to the cart
    Given Shop page is open
    When I open product "<name>"
    And Set quantity to <quantity>
    And Add Product to card
    And Proceed to checkout
    Then Empty message label is not displayed
    And Product name in basket is "<name>"
    And Product quantity is "<quantity>"
    And Product price is "<price>"
    And Product total price is "<totalPrice>"

    Examples:
      | name                | quantity | price  | totalPrice |
      | HUMMINGBIRD T-SHIRT | 3        | $19.12 | $57.36     |
      | HUMMINGBIRD T-SHIRT | 6        | $19.12 | $114.72    |

