Feature: Quarto Landing Page

  Background:
    Given I click on accept cookies button
    And I click on create icon

  @simple-docPublish
  Scenario: I want to publish a simple document
    When I select CREATE DOCUMENT option
    And I have select simple document create options
    Then I have entered document title and description
    And I have select categories and click on publish document

  @visual-docPublish
  Scenario: I want to publish a visual document
    When I select CREATE DOCUMENT option
    And I have select visual document create options
    Then I have entered visual doc title and other details
    And I have select categories for visual and click on publish document

  @video-docPublish
  Scenario: I want to publish a video document
    When I click on "Create or Upload Video" text
    Then I have entered the video info and details
    And I select the categories and published video document

  @multiSection-docPublish
  Scenario:  I want to publish a multi section document
    When I click on "Create Document" option
    And I have select multi section document options
    Then I have entered multi section doc title and other details
    And I have select categories for multi section and click on publish document




