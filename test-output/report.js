$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PublishDocument.feature");
formatter.feature({
  "line": 1,
  "name": "Quarto Landing Page",
  "description": "",
  "id": "quarto-landing-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18308207301,
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
formatter.step({
  "line": 5,
  "name": "I click on create icon",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iClickOnAcceptCookiesButton()"
});
formatter.result({
  "duration": 12263778901,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iClickOnCreateIcon()"
});
formatter.result({
  "duration": 106449392300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "I want to publish a simple document",
  "description": "",
  "id": "quarto-landing-page;i-want-to-publish-a-simple-document",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@simple-docPublish"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I select CREATE DOCUMENT option",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I have select simple document create options",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I have entered document title and description",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I have select categories and click on publish document",
  "keyword": "And "
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
  "duration": 15283228199,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveSelectSimpleDocumentCreateOptions()"
});
formatter.result({
  "duration": 364632400,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveEnteredDocumentTitleAndDescription()"
});
formatter.result({
  "duration": 4430585800,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveSelectCategoriesAndClickOnPublishDocument()"
});
formatter.result({
  "duration": 9011756700,
  "status": "passed"
});
formatter.after({
  "duration": 1169408600,
  "status": "passed"
});
});