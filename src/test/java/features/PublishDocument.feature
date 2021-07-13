Feature: Quarto Landing Page

  Background:
    Given I click on accept cookies button

  @simple-docPublish
  Scenario: I want to publish a simple document
    Given I click on create icon
    When I have select "Create Document" options
    And I have select simple document create options
    Then I have entered document title and description
    And I have select categories and click on publish document


  @visual-docPublish
  Scenario: I want to publish a visual document
    Given I click on create icon
    When I have select "Create Document" options
    And I have select visual document create options
    Then I have entered visual doc title and other details
    And I have select categories for visual and click on publish document


