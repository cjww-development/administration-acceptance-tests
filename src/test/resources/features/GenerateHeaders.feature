@Headers
Feature: Generate headers
  Scenario: The user is going to sign in as an individual
    Given the user is on the login page
    And the user has entered some login credentials
      |     key     |       value       |
      |  username   |       root        |
      |  password   |    testing123     |
    Then the user is redirected to the admin dashboard

  Scenario: The user is attempting to generate a header but fails
    Given the user is on the generate headers page
    And the user clicks generate
    Then the errors should display without the headers well

  Scenario: The user is attempting to generate a header and succeeds
    Given the user is on the generate headers page
    And the user enters the appId
      |     key     |       value       |
      |    appId    |     testAppId     |
    And the user clicks generate
    Then the page is reloaded with the generated header