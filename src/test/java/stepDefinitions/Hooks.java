package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends TestSetupPage {
    @Before
    public void setUpDriver() {
        startDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://quartolab.com/");
    }

    @After
    public void tearDown() {
        stopDriver();
    }

}
