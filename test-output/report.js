$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/HomePage.feature");
formatter.feature({
  "name": "Quarto Landing Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Features Menu Screen",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click on features menu",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.i_click_on_features_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I observed the text \"QUARTO FEATURES\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.i_observed_the_text(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Industries menu screen visit",
  "description": "",
  "keyword": "Scenario"
});
formatter.scenario({
  "name": "I want to login Quarto with any email",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click on sign in link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.i_click_on_sign_in_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have entered an email id and click on next",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.i_have_entered_an_email_id_and_click_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get an error alert \"Couldn\u0027t find your quarto account.\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.i_get_an_error_alert(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get back to home screen",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.get_back_to_home_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Quarto Cookies",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click on accept cookies",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.i_click_on_accept_cookies()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});