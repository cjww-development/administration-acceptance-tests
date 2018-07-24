@GenerateUUID
Feature: UUID Generation

  Scenario: The user is going to sign in as an individual
    Given the user is on the login page
    And the user has entered some login credentials
      |     key     |       value       |
      |  username   |       root        |
      |  password   |    testing123     |
    Then the user is redirected to the admin dashboard

  Scenario: The user needs a UUID for making a new service or for API testing
    Given the user is on the uuid page
    Then the page should display a UUID

  Scenario: The user needs a a different UUID
    Given the user is on the uuid page
    And the user has clicked generate
    Then the page should display a UUID