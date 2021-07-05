package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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

    @Then("I have select {string} options")
    public void iHaveSelectOptions(String options) {
        new PublishDocumentPage().selectCreateOptions(options);
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
}
