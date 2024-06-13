Feature: visa Confirmation Test

  Background:
    Given I am on homepage
    When I click on cookie

  Scenario: an Australian coming to the UK for tourism\z\/+
    When I click on start now button
    And I select nationality "Australia"
    And I click on continue button
    And I select reason for visit
    And I click on second continue button
    Then I should see the result message "You will not need a visa to come to the UK"

  Scenario: a Chilean coming to the UK for work and plans on staying for longer than six months
    When I click on start now button
    And I select nationality "Chile"
    And I click on continue button
    And I select reason for visit job type
    And I click on second continue button
    And I select length of stay
    And I click on third continue button
    And I select job type Health and care professional
    And I click on fourth continue button
    Then I should see the second result message "You need a visa to work in health and care"

  Scenario: a Colombian national coming to the UK to join a partner for a long stay
    When I click on start now button
    And I select nationality "Colombia"
    And I click on continue button
    And I select reason for visit Join partner or family for a long stay
    And I click on second continue button
    Then I should see the third result message "You’ll need a visa to join your family or partner in the UK"



