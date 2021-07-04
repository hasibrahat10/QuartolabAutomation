package stepDefinitions;


import helper.FileHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()){
            FileHelper.take_screenshot();
        }

        stopDriver();
    }

}
