$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PublishDocument.feature");
formatter.feature({
  "line": 1,
  "name": "Quarto Landing Page",
  "description": "",
  "id": "quarto-landing-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20558623700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I click on accept cookies button",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.iClickOnAcceptCookiesButton()"
});
formatter.result({
  "duration": 12463102100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "I want to publish a visual document",
  "description": "",
  "id": "quarto-landing-page;i-want-to-publish-a-visual-document",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@visual-docPublish"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I click on create icon",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I select CREATE DOCUMENT option",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I have select visual document create options",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I have entered visual doc title and other details",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I have select categories for visual and click on publish document",
  "keyword": "And "
});
formatter.match({
  "location": "PublishedDocumentSteps.iClickOnCreateIcon()"
});
formatter.result({
  "duration": 125794191700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CREATE DOCUMENT",
      "offset": 9
    }
  ],
  "location": "PublishedDocumentSteps.iSelectOption(String)"
});
formatter.result({
  "duration": 10278678100,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveSelectVisualDocumentCreateOptions()"
});
formatter.result({
  "duration": 5205040100,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveEnteredVisualDocTitleAndOtherDetails()"
});
formatter.result({
  "duration": 34748268000,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveSelectCategoriesForVisualAndClickOnPublishDocument()"
});
formatter.result({
  "duration": 9299162100,
  "status": "passed"
});
formatter.after({
  "duration": 946521200,
  "status": "passed"
});
});