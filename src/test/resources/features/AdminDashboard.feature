@AdminDash
Feature: Admin dashboard

  Scenario: The user is going to sign in as an individual
    Given the user is on the login page
    And the user has entered some login credentials
      |     key     |       value       |
      |  username   |       root        |
      |  password   |    testing123     |
    Then the user is redirected to the admin dashboard

  Scenario: The user is on the admin dashboard
    Given the user is on the admin dashboard
    And all side bar links are correct for the root user
    And all main dashboard links are correct for the root user