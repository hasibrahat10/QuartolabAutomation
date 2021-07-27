$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PublishDocument.feature");
formatter.feature({
  "line": 1,
  "name": "Quarto Landing Page",
  "description": "",
  "id": "quarto-landing-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14250489700,
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
  "duration": 12518979900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "I want to publish a video document",
  "description": "",
  "id": "quarto-landing-page;i-want-to-publish-a-video-document",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@video-docPublish"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I click on create icon",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click on \"Create or Upload Video\" text",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I have entered the video info and details",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I have selected the categories and published video document",
  "keyword": "And "
});
formatter.match({
  "location": "PublishedDocumentSteps.iClickOnCreateIcon()"
});
formatter.result({
  "duration": 101166649900,
  "status": "passed"
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
  "duration": 1085806400,
  "status": "passed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveEnteredTheVideoInfoAndDetails()"
});
formatter.result({
  "duration": 1386961000,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d91.0.4472.164)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9KHTGJ4\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.164, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\u\\AppData\\Local\\Te...}, goog:chromeOptions: {debuggerAddress: localhost:58080}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0aa5110465770926f8893ae99db1dd76\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat pages.PublishDocumentPage.videoInfo(PublishDocumentPage.java:185)\r\n\tat stepDefinitions.PublishedDocumentSteps.iHaveEnteredTheVideoInfoAndDetails(PublishedDocumentSteps.java:66)\r\n\tat ✽.Then I have entered the video info and details(PublishDocument.feature:27)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PublishedDocumentSteps.iHaveSelectedTheCategoriesAndPublishedVideoDocument()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1596024600,
  "status": "passed"
});
});