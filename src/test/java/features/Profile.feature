Feature: Quarto Profile Page

  Background:
    Given  I click on profile image


  Scenario: I want to edit my account
    When  I click on my account text
    And I have edited profile info and click update button
    And Click on profile image once again
    Then I click logout



