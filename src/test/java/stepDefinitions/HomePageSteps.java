package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class HomePageSteps extends TestSetupPage {
    @Then("I click on features menu")
    public void i_click_on_features_menu() {
        new HomePage().setFeatures();
    }

    @Then("I observed the text (.*)")
    public void i_observed_the_text(String expectedText) {
        sleepFor(3);
        Assert.assertEquals(expectedText, new HomePage().setTextDisplayed());
    }

    /**
     * Login Attempt for the application
     */
    @Then("I click on sign in link")
    public void i_click_on_sign_in_link() {
        new HomePage().setSignIn();
    }

    @When("I have entered an email id and click on next")
    public void i_have_entered_an_email_id_and_click_on_next() {
        new HomePage().setSignInProcess();
    }

    @When("I get an error alert (.*)")
    public void i_get_an_error_alert(String text) {
        new HomePage().loginNextProcess();
    }

    @Then("Get back to home screen")
    public void get_back_to_home_screen() {

    }

    /*
    Cookies Accept
     */

    @Given("I click on accept cookies button")
    public void iClickOnAcceptCookiesButton() {
        sleepFor(10);
        new HomePage().setCookiesAccept();
    }

    @And("I click on features, pricing and logo image")
    public void iClickOnFeaturesPricingAndLogoImage() {
        new HomePage().setLogMenuItem();
    }

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

    @Then("I click on contact us button")
    public void iClickOnContactUsButton() {
        new HomePage().setContactUs();
    }

    @And("I have submit the form info and close the success screen")
    public void iHaveSubmitTheFormInfoAndCloseTheSuccessScreen() {
        HomePage homePage = new HomePage();
        homePage.setFormDetails();
        homePage.setCloseSuccess();
    }

    @And("I have entered password and click on login")
    public void iHaveEnteredPasswordAndClickOnLogin() {
        new HomePage().setPassword();
    }


}
