package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.PublishDocumentPage;

public class PublishedDocumentSteps extends TestSetupPage {
    /**
     * Set create icon for all the create document option with login
     */
    @Then("I click on create icon")
    public void iClickOnCreateIcon() {
        HomePage homePage = new HomePage();
        homePage.setSignIn();
        homePage.setSignInProcess();
        homePage.setPassword();
        new PublishDocumentPage().setCreateIcon();
    }

    /**
     * Common steps for create options
     * @param option
     */
    @Then("I select (.*) option")
    public void iSelectOption(String option) {
        new PublishDocumentPage().selectCreateOptions(option);
    }

    @And("I have select simple document create options")
    public void iHaveSelectSimpleDocumentCreateOptions() {
        new PublishDocumentPage().setSimpleDocBtn();
    }

    @Then("I have entered document title and description")
    public void iHaveEnteredDocumentTitleAndDescription() {
        new PublishDocumentPage().setDocInfo();
    }

    @And("I have select categories and click on publish document")
    public void iHaveSelectCategoriesAndClickOnPublishDocument() {
        new PublishDocumentPage().setPublishDocument();
    }

    @And("I have select visual document create options")
    public void iHaveSelectVisualDocumentCreateOptions() {
        new PublishDocumentPage().setVisualDocBtn();

    }

    @Then("I have entered visual doc title and other details")
    public void iHaveEnteredVisualDocTitleAndOtherDetails() {
        new PublishDocumentPage().visualDocInfo();
    }

    @And("I have select categories for visual and click on publish document")
    public void iHaveSelectCategoriesForVisualAndClickOnPublishDocument() {
        new PublishDocumentPage().setPublishDocument();
    }

    @When("^I click on \"([^\"]*)\" text$")
    public void iClickOnText(String option) {
        new PublishDocumentPage().selectVideo(option);
    }

    @Then("^I have entered the video info and details$")
    public void iHaveEnteredTheVideoInfoAndDetails() {
        new PublishDocumentPage().videoInfo();
    }

    @And("^I have selected the categories and published video document$")
    public void iHaveSelectedTheCategoriesAndPublishedVideoDocument() {
        new PublishDocumentPage().setPublishDocument();
    }

    @When("^I click on \"([^\"]*)\" option$")
    public void iClickOnOption(String option) {
        new PublishDocumentPage().clickCreateDoc(option);
    }

    @And("^I have select multi section document options$")
    public void iHaveSelectMultiSectionDocumentOptions() {
        new PublishDocumentPage().setMultiDocBtn();
    }

    @Then("^I have entered multi section doc title and other details$")
    public void iHaveEnteredMultiSectionDocTitleAndOtherDetails() {
        new PublishDocumentPage().setMultiDocInfo();
    }

    @And("^I have select categories for multi section and click on publish document$")
    public void iHaveSelectCategoriesForMultiSectionAndClickOnPublishDocument() {
        new PublishDocumentPage().setPublishDocument();
    }

    @And("^I select the categories and published video document$")
    public void iSelectTheCategoriesAndPublishedVideoDocument() {
        new PublishDocumentPage().videoPublished();
    }
}
