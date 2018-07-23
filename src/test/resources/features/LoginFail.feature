@LoginFail
Feature: Logging in
  Scenario: The user is going to sign in and fail authentication because of incorrect creds
    Given the user is on the login page
    And the user has entered some login credentials
      |     key     |     value     |
      |  username   |    invalid    |
      |  password   |    invalid    |
    Then the user is presented with the login screen containing the incorrect creds error message

  Scenario: The user is going to sign in and fail authentication
    Given the user is on the login page
    And the user has entered some login credentials
      |     key     |     value     |
      |  username   |               |
      |  password   |               |
    Then the user is presented with the login screen containing errors about no creds provided
