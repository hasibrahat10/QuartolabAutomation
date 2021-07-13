package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.PublishDocumentPage;

public class PublishedDocumentSteps extends TestSetupPage {
    @Then("I click on create icon")
    public void iClickOnCreateIcon() {
        HomePage homePage = new HomePage();
        homePage.setSignIn();
        homePage.setSignInProcess();
        homePage.setPassword();
        new PublishDocumentPage().setCreateIcon();
    }

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
}
