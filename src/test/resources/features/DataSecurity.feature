@DataSec
Feature: Data security
  Scenario: The user is going to sign in as an individual
    Given the user is on the login page
    And the user has entered some login credentials
      |     key     |       value       |
      |  username   |       root        |
      |  password   |    testing123     |
    Then the user is redirected to the admin dashboard

  Scenario: The user wants to encrypt a string using data sec
    Given the user is on the data sec page
    And the user has chosen encrypt and string
    And has entered the data they want to encrypt
      |     key     |       value       |
      |     data    |       test        |
    Then the process button has been clicked
    Then the page will reload and display the encrypted value

  Scenario: The user wants to encrypt json using data sec
    Given the user is on the data sec page
    And the user chosen encrypt and json
    And has entered the data they want to encrypt
      |     key     |       value       |
      |     data    |  {"abc" : "xyz"}  |
    Then the process button has been clicked
    Then the page will reload and display the encrypted value

  Scenario: The users want to decrypt a string using data sec
    Given the user is on the data sec page
    And the user chosen decrypt and string
    And has entered the data they want to decrypt
      |     key     |          value          |
      |     data    | YjExJRyt-AGFTN_tlkgRIA  |
    Then the process button has been clicked
    Then the page will reload and display the decrypted value

  Scenario: The users want to decrypt json using data sec
    Given the user is on the data sec page
    And the user chosen decrypt and json
    And has entered the data they want to decrypt
      |     key     |           value          |
      |     data    |  2362v9gGF4XwOTpVEByArQ  |
    Then the process button has been clicked
    Then the page will reload and display the decrypted value