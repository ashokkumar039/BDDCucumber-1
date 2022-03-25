Feature: Demo Bank Login Feature

  Scenario: Demo Bank Login Test Scenario
    Given Open chrome and start application
    When I enter valid username and password
    And I click the login button
    Then User should be able to login successfully
