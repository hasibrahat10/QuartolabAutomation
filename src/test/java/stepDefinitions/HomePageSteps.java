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

    // Cookies Accept

    @Then("I click on accept cookies")
    public void i_click_on_accept_cookies() {
        new HomePage().setCookiesAccept();
    }

    // Logo and Menu Click

    @And("I click on features, pricing and logo image")
    public void iClickOnFeaturesPricingAndLogoImage() {
        new HomePage().setLogMenuItem();
    }

    // Request Demo Screen


    @Then("I click on request demo button")
    public void i_click_on_request_demo_button() {
        new HomePage().setRequestDemo();

    }

    @Then("I have entered the form information and click submit")
    public void i_have_entered_the_form_information_and_click_submit() {
        new HomePage().setFormDetails();

    }

    @Then("I close the success alert")
    public void i_close_the_success_alert() {
        new HomePage().setCloseSuccess();
    }


}
