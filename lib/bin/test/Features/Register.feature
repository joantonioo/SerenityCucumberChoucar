Feature: Create new customer

  Scenario: Create new customer successfully with table
    Given User is on home page
    When the user enters
      | mail                   | firstname | Lastname | pass        |
      | caralunaluna@gmail.com | Juan      | Pinzon   | F096r3e5434 |
    And the user writes your address
      | company | address | house | city   | state | postal | country       | info   |
      | otis    | rt3     | AC4   | Cancun | Texas |  22000 | United States | miinfo |
    And the user writes moiles
      | homePhone | cellphone  | references |
      |  31576561 | 3153223456 | HGT        |
    Then I verify the verify new successful customer
