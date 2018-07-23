@SHA512
Feature: SHA512
  Scenario: The user is going to sign in as an individual
    Given the user is on the login page
    And the user has entered some login credentials
      |     key     |       value       |
      |  username   |       root        |
      |  password   |    testing123     |
    Then the user is redirected to the admin dashboard

  Scenario: The user wants to encrypt a value using SHA512
    Given the user is on the enc and dec dash
    Then the user selects SHA512
    And the user enters the value they want encrypting
      |     key     |       value       |
      |     data    |       test        |
    Then the page reloads with the users encrypted value