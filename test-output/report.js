$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PublishDocument.feature");
formatter.feature({
  "line": 1,
  "name": "Quarto Landing Page",
  "description": "",
  "id": "quarto-landing-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 31640141700,
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
  "duration": 12304062400,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iClickOnCreateIcon()"
});
formatter.result({
  "duration": 272329169700,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "I want to publish a video document",
  "description": "",
  "id": "quarto-landing-page;i-want-to-publish-a-video-document",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@video-docPublish"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I click on \"Create or Upload Video\" text",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I have entered the video info and details",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I have selected the categories and published video document",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Create or Upload Video",
      "offset": 12
    }
  ],
  "location": "PublishedDocumentSteps.iClickOnText(String)"
});
formatter.result({
  "duration": 592517700,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveEnteredTheVideoInfoAndDetails()"
});
formatter.result({
  "duration": 12817215700,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveSelectedTheCategoriesAndPublishedVideoDocument()"
});
formatter.result({
  "duration": 20057870300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div // a[@class\u003d\u0027btn btn-light btn-with-icon w-100 cursor-pointer\u0027]\"}\n  (Session info: chrome\u003d91.0.4472.164)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9KHTGJ4\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.164, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\u\\AppData\\Local\\Te...}, goog:chromeOptions: {debuggerAddress: localhost:62153}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 97c2dc397403d7d8276af37c136b109d\n*** Element info: {Using\u003dxpath, value\u003d//div // a[@class\u003d\u0027btn btn-light btn-with-icon w-100 cursor-pointer\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat pages.PublishDocumentPage.setPublishDocument(PublishDocumentPage.java:149)\r\n\tat stepDefinitions.PublishedDocumentSteps.iHaveSelectedTheCategoriesAndPublishedVideoDocument(PublishedDocumentSteps.java:72)\r\n\tat ✽.And I have selected the categories and published video document(PublishDocument.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1398007200,
  "status": "passed"
});
});