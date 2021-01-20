Feature: feature to test Tutorial Point functionality

  Scenario: Validate TutorialsPoint is working
    Given browser is open
    And user  is on login page
    When user enters username and password
    And hits enter
    Then user is navigated to the home page
