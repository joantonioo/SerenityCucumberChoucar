Feature: Login automation

  Scenario Outline: login functionality for a apparel site
    Given Homepage
    When I enter my <username> and <password>
    Then user login confirmation

    Examples: 
      | username        | password    |
      | tgrhk@gmail.com | F096r3e5434 |
