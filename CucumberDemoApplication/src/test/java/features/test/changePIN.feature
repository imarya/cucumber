Feature: Change PIN

  Background: Prior to change PIN
    Given I have been issued a new card
    And I insert the card, entering the correct PIN
    When I choose "Change PIN" from the menu

  Scenario: Change PIN successfully
    When I change the PIN to 9876
    Then the system should remember my PIN is now 9876


  Scenario: Change PIN successfully
    When I try to change the PIN to the original PIN number
    Then I should see a warning message
    And the system should not have changed my PIN