Feature: Quarto Landing Page

  Scenario: Features Menu Screen
    Then I click on features menu
    And I observed the text "QUARTO FEATURES"

  Scenario: Industries menu screen visit

  Scenario:  I want to login Quarto with any email
    Then I click on sign in link
    When I have entered an email id and click on next
    And I get an error alert "Couldn't find your quarto account."
    Then Get back to home screen




