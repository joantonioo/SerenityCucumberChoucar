Feature: buy at the store

  Scenario Outline: enter the store and buy clothes successfully
    Given start in virtual store
    When enter my <mail> and <pass> fin
    And select dresses
    Then confirm purchase

    Examples: 
      | mail            | pass        |
      | tgrhk@gmail.com | F096r3e5434 |
