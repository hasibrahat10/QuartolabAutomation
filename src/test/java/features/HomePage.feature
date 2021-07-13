Feature: Quarto Landing Page

  Background:
    Given I click on accept cookies button

  @Menu-test
  Scenario: Features Menu Screen
    Then I click on features menu
    And I observed the text "QUARTO FEATURES"

#  Scenario: Industries menu screen visit
  @login-failed
  Scenario:  I want to login Quarto with any email
    Then I click on sign in link
    When I have entered an email id and click on next
    And I get an error alert "Couldn't find your quarto account."
    Then Get back to home screen

  @logo-menu
  Scenario: Logo and Menu click
    And I click on features, pricing and logo image

  @request-demo
  Scenario: Request Demo Page
    Then I click on request demo button
    And I have entered the form information and click submit
    Then I close the success alert

  @contact-us
  Scenario: Contact Us
    Then I click on contact us button
    And I have submit the form info and close the success screen

  @login
  Scenario:  I want to login Quarto with a verified email
    Then I click on sign in link
    And I have entered an email id and click on next
    And I have entered password and click on login















