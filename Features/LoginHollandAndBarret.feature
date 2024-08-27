Feature: Check login and logout functionality of Holland and Barret

  Scenario: Successfull LogIn with valid Credentials
    Given User should Open Chrome Browser
    When User should Enter Url in Browser
    When User Should Navigate Home Page
    And Enter UserName and Password in Edit Box
    And Click On Login PushButton
    Then Message displayed Login Successfully
    Then User Should Navigate to Dashboard
    Then User Should Logout Holland and Barrett Application
    Then Message displayed Logout Successfully
