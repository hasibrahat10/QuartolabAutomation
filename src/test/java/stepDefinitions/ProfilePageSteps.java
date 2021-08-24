package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ProfilePage;

public class ProfilePageSteps extends TestSetupPage {
    @Given("^I click on profile image$")
    public void i_click_on_profile_image() {
        new ProfilePage().clickProfile();
    }

    @When("^I click on my account text$")
    public void i_click_on_my_account_text() {
        new ProfilePage().clickMyAccount();
    }

    @When("^I have edited profile info and click update button$")
    public void i_have_edited_profile_info_and_click_update_button() {
        new ProfilePage().updateProfileInfo();
    }

    @When("^Click on profile image once again$")
    public void click_on_profile_image_once_again() {
        new ProfilePage().backToProfileImgClick();
    }

    @Then("^I click logout$")
    public void i_click_logout() {
        new ProfilePage().setLogout();
    }

}
