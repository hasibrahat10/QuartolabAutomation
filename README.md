# Quartolab - A SAAS Based Software Application

### Description
This is a Software Application testing automation project based on Java. 
Apache Maven is used to building and run the project and Cucumber-Gherkin is used for writing test scenarios and reporting.
Web Apps: https://quartolab.com/

### Setup Project
First of all, you need to clone the project from Github. Use the following command
```commandline
git clone https://github.com/hasibrahat10/QuartolabAutomation.git
```
### Add More Features and Scenarios 
- Go to project features package `src/test/java/features`
- Create a new file `login.feature`
- Add a new scenario in the file 
- Example
```gherkin
    @login
    Feature: Login into the application

    @test-1
    Scenario: I want to login Quarto with a verified email
    Given I click on accept cookies button
    Then I click on sign in link
    And I have entered an email id and click on next
    And I have entered password and click on login
```
- Go to project stepDefinitions package `src/test/java/stepDefinitions`
- Create a new file `HomePageSteps.java`
- Add necessary feature steps in the file
- Example:
```java
    public class HomePageSteps{
    @Given("I click on accept cookies button")
        public void iClickOnAcceptCookiesButton() {
        }
     @Then("I click on sign in link")
        public void i_click_on_sign_in_link() {
        }
      @When("I have entered an email id and click on next")
        public void i_have_entered_an_email_id_and_click_on_next() {
        }
      @And("I have entered password and click on login")
        public void iHaveEnteredPasswordAndClickOnLogin() {
        }
}
```
- Write code inside the steps method

### Before Run 
- Open `FileHelper.java` file from `src/test/java/FileHelper.java`
- Changed the credentials
- To keep your credentials secret please set your credentials as system variable
- Example:
```java
        public class FileHelper {
            public static String token;
            public static String username = "";
            public static String password = "";
            public static String baseURI = "https://quartolab.com/";
            public static final String TO_EMAIL = System.getenv("TO_EMAIL");
            public static final String FROM_EMAIL = System.getenv("FROM_EMAIL");
            public static final String EMAIL_PASSWORD = System.getenv("EMAIL_PASSWORD");
        }
```
- Open `TestRunner.java` file from `src/test/java/testRunner/TestRunner.java`
- Add the tests tag those tests will execute
- To run multiple tag same time use comma among the tags
- To skip a test tag use `~` before the tag as `~@test-1`
- Example: 
 ```java
        @CucumberOptions(
                features = {"src/test/java/com/features"},
                glue = {"com/stepDefinitions"},
                tags = {"@login, @contact-us, ~@login-failed"},
                plugin = {"pretty", "html:test-output"}
        )

        @RunWith(Cucumber.class)
        public class CucumberRunner {
        
        }
```
### Local run 
- Go to testRunner package and open this `TestRunner.java` file
- Right click on the file
- Select `Run 'TestRunner'` option
- Then click on it
- It will run all the test that mention in the tags (`tags = {"@login, @contact-us, ~@login-failed"}`)

##### Maven run
- Apache Maven should install on your local machine
- Open terminal
- Go to root directory
- Run command `mvn clean install `
- Run a single test `mvn install -Dcucumber.options="--tags @test-1"`

### Reports and Logs
- Project reports are generated inside the directory `test-output/index.html`
- Cucumber html reports `test-output/index.html`
- Then Click `index.html` right shift on the mouse 
- Open in a browser 
### Directory Structure
``` bash
.
├── drivers
│   └── chromedriver_win32
├── images
|   ├──qdev.PNG
|   ├──test.jpg
|   ├──testimages.jpg
│   └── www.PNG
├── src
│   └── test
│       ├── java
│       │    ├── features
│       │    │   ├── HomePage.feature
│       │    │   ├── PublishDocument.feature
│       │    │   ├── Add More Featutre
│       │    │   └── Add More Featutre
│       │    ├── helper
│       │    │   ├── FileHelper.java
│       │    │   ├── Add More Helper
│       │    │   ├── Add More Helper
│       │    ├── pages
│       │    │   ├── HomePage.java
|       |    |   ├── PublishDocumentPage.java
│       │    ├── stepDefinitions
│       │    │   ├── HomePageSteps.java
│       │    │   ├── Hooks.java
│       │    │   ├── PublishDocumentSteps.java
│       │    │   └── TestSetupPaage
│       │    ├── testRunner
│       │    │   └── TestRunner.java
│       │    ├── utils
│       │    │   ├── Helpers.java
│       │    │   └── MailHelper.java
│       │    ├── EnvData.java
│       │    └── User.java
├── videos
|   ├──vide1.mp4           
├── pom.xml
└── README.md
```
#### Questions
If you have trouble getting set up, or if you have any questions, please don't hesitate to reach out to me. 
I'm happy to help!


