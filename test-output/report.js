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
  "name": "Contact Us",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@contact-us"
    }
  ]
});
formatter.step({
  "name": "I click on contact us button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.iClickOnContactUsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have submit the form info and close the success screen",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.iHaveSubmitTheFormInfoAndCloseTheSuccessScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});