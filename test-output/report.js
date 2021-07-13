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
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "name": "I want to login Quarto with any email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login-failed"
    }
  ]
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027Next\u0027)]\"}\n  (Session info: chrome\u003d91.0.4472.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9KHTGJ4\u0027, ip: \u0027192.168.0.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\u\\AppData\\Local\\Te...}, goog:chromeOptions: {debuggerAddress: localhost:62914}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 6fdf4b0574a7b3794ca9d9333a8b0251\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Next\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat pages.HomePage.loginNextProcess(HomePage.java:136)\r\n\tat stepDefinitions.HomePageSteps.i_get_an_error_alert(HomePageSteps.java:41)\r\n\tat ✽.I get an error alert \"Couldn\u0027t find your quarto account.\"(file:///D:/Testing%20Issues%20Data/OneDrive%20-%20Red%20Lime%20Solutions/Quarto%20-%20Automation/QuartolabAutomation/src/test/java/features/HomePage.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Get back to home screen",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.get_back_to_home_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
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
  "name": "Logo and Menu click",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@logo-menu"
    }
  ]
});
formatter.step({
  "name": "I click on features, pricing and logo image",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.iClickOnFeaturesPricingAndLogoImage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "Request Demo Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@request-demo"
    }
  ]
});
formatter.step({
  "name": "I click on request demo button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.i_click_on_request_demo_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[contains(text(),\u0027Accept\u0027)]\"}\n  (Session info: chrome\u003d91.0.4472.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9KHTGJ4\u0027, ip: \u0027192.168.0.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\u\\AppData\\Local\\Te...}, goog:chromeOptions: {debuggerAddress: localhost:62717}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 6127059b333c45679c622ed1fd48e6c1\n*** Element info: {Using\u003dxpath, value\u003d//button[contains(text(),\u0027Accept\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat pages.HomePage.setCookiesAccept(HomePage.java:143)\r\n\tat pages.HomePage.setRequestDemo(HomePage.java:163)\r\n\tat stepDefinitions.HomePageSteps.i_click_on_request_demo_button(HomePageSteps.java:69)\r\n\tat ✽.I click on request demo button(file:///D:/Testing%20Issues%20Data/OneDrive%20-%20Red%20Lime%20Solutions/Quarto%20-%20Automation/QuartolabAutomation/src/test/java/features/HomePage.feature:27)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I have entered the form information and click submit",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.i_have_entered_the_form_information_and_click_submit()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I close the success alert",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.i_close_the_success_alert()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
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
  "name": "I want to login Quarto with a verified email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
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
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.i_have_entered_an_email_id_and_click_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have entered password and click on  login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.iHaveEnteredPasswordAndClickOnLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/PublishDocument.feature");
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
  "name": "I want to publish a simple document",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@simple-docPublish"
    }
  ]
});
formatter.step({
  "name": "I click on create icon",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.PublishedDocumentSteps.iClickOnCreateIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have select \"Create Document\" options",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.PublishedDocumentSteps.iHaveSelectOptions(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have select simple document create options",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PublishedDocumentSteps.iHaveSelectSimpleDocumentCreateOptions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have entered document title and description",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PublishedDocumentSteps.iHaveEnteredDocumentTitleAndDescription()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have select categories and click on publish document",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PublishedDocumentSteps.iHaveSelectCategoriesAndClickOnPublishDocument()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "I want to publish a simple document",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@visual-docPublish"
    }
  ]
});
formatter.step({
  "name": "I click on create icon",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.PublishedDocumentSteps.iClickOnCreateIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have select \"Create Document\" options",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.PublishedDocumentSteps.iHaveSelectOptions(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have select visual document create options",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I have entered document title and description",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PublishedDocumentSteps.iHaveEnteredDocumentTitleAndDescription()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I have select categories and click on publish document",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PublishedDocumentSteps.iHaveSelectCategoriesAndClickOnPublishDocument()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});