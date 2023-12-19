@regression
Feature: Verify user login functionality

  Scenario: User should login successfully
    Given Enter username
    And Enter password
    When Click on Login Button
    Then Verify "Welcome" Message

Feature: Verify the display of the logo on the home page

  Scenario: Logo should be displayed on the home page
    Given Login To The application
    Then Verify Logo is Displayed

Feature: Verify user logout functionality

  Scenario: User should log out successfully
    Given Login To The application
    When Click on User Profile logo
    And Mouse hover on "Logout" and click
    Then Verify the text "Login Panel" is displayed

Feature: Verify error message with invalid credentials

  Scenario Outline: Error message with invalid credentials
    Given Enter  username1 <username>
    And Enter  password1 <password>
    When Click on Login Button
    Then Verify Error message1 <errorMessage>

    Examples:
      | username             | password  | errorMessage         |
      | Required             |           | Required              |
      | test123@gmail.com    |           | Required              |
      | test123@gmail.com    | test123   | Invalid credentials   |









