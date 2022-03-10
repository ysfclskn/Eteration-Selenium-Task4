Feature: Check Instructors List

  @main
  Scenario: Check Instructors List Count
    Given I opens Eteration Academy Page
    Then I goes to "Instructors" Page
    And I verifies instructors list count

