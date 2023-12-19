Feature: Admin adds a user successfully

  Scenario: Admin should add a user successfully
    Given Login to Application
    When Click On "Admin" Tab
    And Verify "System Users" Text
    And Click On "Add" button
    And Verify "Add User" Text
    And Select User Role "Admin"
    And Enter Employee Name "Ananya Dash"
    And Enter Username
    And Select Status "Disable"
    And Enter Password
    And Enter Confirm Password
    And Click On "Save" Button
    Then Verify message "Successfully Saved"

Feature: Search and verify a created user

  Scenario: Search the user created and verify it
    Given Login to Application
    When Click On "Admin" Tab
    And Verify "System Users" Text
    And Enter Username
    And Select User Role
    And Select Status
    And Click on "Search" Button
    Then Verify the User should be in Result list

Feature: Admin deletes a user successfully

  Scenario: Verify that Admin should delete the user successfully
    Given Login to Application
    When Click On "Admin" Tab
    And Verify "System Users" Text
    And Enter Username
    And Select User Role
    And Select Status
    And Click on "Search" Button
    And Verify the User should be in Result list
    And Click on Check box
    And Click on Delete Button
    And Popup will display
    And Click on Ok Button on Popup
    Then Verify message "Successfully Deleted"

Feature: Search and verify the message for found record

  Scenario: Search the user and verify the message record found
    Given Login to Application
    When Click On "Admin" Tab
    And Verify "System Users" Text
    And Enter Username "<username>"
    And Select User Role "<userRole>"
    And Enter EmployeeName "<employeeName>"
    And Select Status "<status>"
    And Click on "Search" Button
    Then Verify message "(1) Record Found"
    And Verify username "<username>"
    And Click on Reset Tab

    Scenario Outline:

    Examples:
      | username         | userRole | employeeName    | status |
      | Admin            | Admin    | Paul Collings   | Enable |
      | Cassidy.Hope     | ESS      | Cassidy Hope    | Enable |
      | Nina.Patel       | ESS      | Nina Patel      | Enable |
      | Odis.Adalwin     | Admin    | Odis Adalwin    | Enable |

