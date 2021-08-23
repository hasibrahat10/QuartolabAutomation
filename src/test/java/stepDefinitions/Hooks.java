package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestSetupPage {
    @Before
    public void setUpDriver() {
        startDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        takeScreenshot(scenario);
        stopDriver();
    }
}
