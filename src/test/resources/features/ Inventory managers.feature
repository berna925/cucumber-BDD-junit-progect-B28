Feature:As a user Inventory managers access to main modules.

  User Story: As an Inventory manager, I should be able to access to the main modules.

  Scenario:Verify the Inventory managers access to 16 modules.
    Given an inventory manager is logged into the system
    When the manager navigates to the modules page
    Then the manager should see 16 modules displayed
    And the manager should have access to all 16 modules