Feature: Product search

  Scenario: User can find product using search
    Given Shop page is open
    And Random product name is chosen
    When I search for random product
    Then It's name is on the search reslut list