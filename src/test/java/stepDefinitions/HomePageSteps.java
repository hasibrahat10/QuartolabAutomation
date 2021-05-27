package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;

public class HomePageSteps extends TestSetupPage {

    @Then("I click on features menu")
    public void i_click_on_features_menu() {
        new HomePage().setFeatures();

    }

    @Then("I observed the text {string}")
    public void i_observed_the_text(String expectedText) {
        sleepFor(3);
        Assert.assertEquals(expectedText, new HomePage().setTextDisplayed());

    }
}
