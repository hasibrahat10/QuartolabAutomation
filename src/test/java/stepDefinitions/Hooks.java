package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.FileHelper;

public class Hooks extends TestSetupPage {
    @Before
    public void setUpDriver() {
        startDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed())
        FileHelper.takeScreenshot(scenario.getName());
        stopDriver();
    }
}
