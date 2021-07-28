$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PublishDocument.feature");
formatter.feature({
  "line": 1,
  "name": "Quarto Landing Page",
  "description": "",
  "id": "quarto-landing-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11467058400,
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
  "duration": 12196328900,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iClickOnCreateIcon()"
});
formatter.result({
  "duration": 111010166000,
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
  "duration": 15248216400,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveSelectSimpleDocumentCreateOptions()"
});
formatter.result({
  "duration": 20116950000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//*[contains(text(), \u0027CREATE\u0027)])[1]\"}\n  (Session info: chrome\u003d91.0.4472.164)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9KHTGJ4\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.164, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\u\\AppData\\Local\\Te...}, goog:chromeOptions: {debuggerAddress: localhost:62243}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: ef9fae0c4e7ee8bf93c3b76c54a40fc7\n*** Element info: {Using\u003dxpath, value\u003d(//*[contains(text(), \u0027CREATE\u0027)])[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat pages.PublishDocumentPage.setSimpleDocBtn(PublishDocumentPage.java:133)\r\n\tat stepDefinitions.PublishedDocumentSteps.iHaveSelectSimpleDocumentCreateOptions(PublishedDocumentSteps.java:28)\r\n\tat ✽.And I have select simple document create options(PublishDocument.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveEnteredDocumentTitleAndDescription()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveSelectCategoriesAndClickOnPublishDocument()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 959853400,
  "status": "passed"
});
});