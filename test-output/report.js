$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/HomePage.feature");
formatter.feature({
  "name": "Quarto Landing Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click on accept cookies button",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.iClickOnAcceptCookiesButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Features Menu Screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Menu-test"
    }
  ]
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
});