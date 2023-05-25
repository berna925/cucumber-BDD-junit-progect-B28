Feature: EPR repair order feature

  User story:As a POS & sales manager, I want to get repair order on the Repairs page.

  Scenario: Verify posmanager can select all the repair orders by clicking the top checkbox
    When User is logged in page
    Then user click on repair button
    And  user should  click on the top ckeckbox
    Then user should select all the repair orders by clicking the top check box
