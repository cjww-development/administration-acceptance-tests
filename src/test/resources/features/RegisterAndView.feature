@RegisterAndView
Feature: Registration and user view
  Scenario: The user is going to sign in as an individual
    Given the user is on the login page
    And the user has entered some login credentials
      |     key     |       value       |
      |  username   |       root        |
      |  password   |    testing123     |
    Then the user is redirected to the admin dashboard

  Scenario: The user is registering a user
    Given the user is on the registration page
    And the user has entered the new users details
      |        key         |       value       |
      |      username      |      testuser     |
      |       email        |  test1@email.com  |
      |     password       |     Testing123    |
      |  confirmPassword   |     Testing123    |
      |    permissions     |        all        |
    Then the user is on the view user page
    And the new user is displayed on the users overview page

  Scenario: The newly created users details are viewed
    Given the user is on the view user page
    Then the new users details are viewed
    And the users details are display on the page
    Then the new user is deleted and the user is returned to user overview

