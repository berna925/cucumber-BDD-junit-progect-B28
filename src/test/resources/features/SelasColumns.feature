Feature: Sales page displays 6 columns for quotations

  User Story: As a manager, I should be able to get correct information on the Sales page.

  Acceptance Criteria: As a POS user or sales manager
  I want to verify that the Sales page displays 6 columns for quotations
  So that I can easily view and manage sales quotations.

  Background:
    Given the user is logged in as a POS user or sales manager
  Scenario: Sales page displays 6 columns for quotations
    When the user navigates to the Sales page
    Then the Sales page displays 6 columns for quotations