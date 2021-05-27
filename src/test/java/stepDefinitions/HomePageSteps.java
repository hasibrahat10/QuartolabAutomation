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

    //====== Login Attempt to the Website ==============
    @Then("I click on sign in link")
    public void i_click_on_sign_in_link() {

    }

    @When("I have entered an email id and click on next")
    public void i_have_entered_an_email_id_and_click_on_next() {

        new HomePage().setSignInProcess();

    }

    @When("I get an error alert {string}")
    public void i_get_an_error_alert(String text) {

        new HomePage().loginNextProcess();
    }

    @Then("Get back to home screen")
    public void get_back_to_home_screen() {

    }

}
