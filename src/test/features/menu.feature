Feature: menu
  As a user i should be navigate to the appropriate using the Menu option.
  @menu
  Scenario Outline: Menu Navigation

    Given I am on the  home page "https://www.next.co.uk"
    When  I Mouser Over on the header menu option "<Menu>"
    And   I Click on the Menu option
    Then  I should be able to see the appropriate page "<ExpectedTitle>"
    Examples:
    | Menu | ExpectedTitle |
    | MEN  | Mens Clothing |
    | WOMEN | Women's Clothing |
    |BEAUTY | Beauty |
