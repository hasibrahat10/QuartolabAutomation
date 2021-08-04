package stepDefinitions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.FileHelper;

import java.util.concurrent.TimeUnit;

public class Hooks extends TestSetupPage {
    @Before
    public void setUpDriver(Scenario scenario) {
        scenarioName = scenario.getName();
        startDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://quartolab.com/");
    }

    @After
    public void tearDown() {
//        if (scenario.isFailed()) {
//            FileHelper.take_screenshot();
//        }
        FileHelper.take_screenshot();
        stopDriver();
    }

}
