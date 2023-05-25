
@story101
Feature:Odoo documentation message

  User Story:As a user, I want to access the documentation page.

  AC1: 1.Verify the “Odoo Documentation” message is displayed n a new window.
  AC2: 2. Verify there are 4 main document topics are listed.


  Scenario: Verify the “Odoo Documentation” message is displayed n a new window.
    Given user is logged in
    When user clicks "POSManager19" button
    And user clicks "Documentation" option
    Then user sees  "documentation" in the url
    And user sees "Odoo Documentation" message is displayed
    And there are 4 main documents topics are listed

   @AC2US101
    Scenario:Verify there are 4 main document topics are listed.
    And there are 4 main documents topics are listed



