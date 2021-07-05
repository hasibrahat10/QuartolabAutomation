package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.TestSetupPage;

public class PublishDocumentPage extends TestSetupPage {

    //========================= Simple Document Element Finder ============================== //
    @FindBy(xpath = "//i[@class='icon icon-create-v2 hvr-icon']")
    WebElement createIcon;

    @FindBy(xpath = "//li // a[contains(text(), 'Create Document')]")
    WebElement createDocument;

    @FindBy(xpath = "(//*[contains(text(), 'CREATE')])[1]")
    WebElement simpleDocBtn;

    @FindBy(xpath = "//input[@placeholder='Enter title']")
    WebElement docTitle;

    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    WebElement docDescription;

    @FindBy(xpath = "//div // a[@class='btn btn-light btn-with-icon w-100 cursor-pointer']")
    WebElement addCategoriesBtn;

    @FindBy(xpath = "//label[@class='form-check-label' and @for='normal docs track-12']")
    WebElement selectedCategory;

    @FindBy(xpath = "//button[contains(text(),'Done')]")
    WebElement categorySelectDone;

    @FindBy(xpath = "//button[contains(text(), ' Publish Document ')]")
    WebElement publishDoc;

    @FindBy(xpath = "//button[contains(text(), 'Yes')]")
    WebElement confirmYes;

    @FindBy(xpath = "//button[contains(text(), 'BACK TO CONTENT MANAGER')]")
    WebElement backToContentMgr;


    //========================= Constructor Define ============================== //

    public PublishDocumentPage() {
        PageFactory.initElements(driver, this);
    }

    //========================= Custom Method to Step Define ============================== //

    public void setCreateIcon() {
        createIcon.click();
    }

    public void selectCreateOptions(String createOptions) {
//Dynamic Xpath for the multiples item
        driver.findElement(By.xpath("//li // a[contains(text(), '" + createOptions + "')]")).click();
//        createDocument.click();
    }

    public void setSimpleDocBtn(){
        simpleDocBtn.click();
    }

    public void setDocInfo(){
        docTitle.clear();
        sleepFor(2);
        docTitle.sendKeys("Automation Title one");
        docDescription.click();
        sleepFor(2);
        docDescription.sendKeys("Automation the industry's standard dummy text ever \n" +
                "since the 1500s, when an unknown printer took a galley of type and " +
                "scrambled it to make a type speciman.\n");

        sleepFor(3);
    }

    public void setPublishDocument(){
        addCategoriesBtn.click();
        sleepFor(2);
        selectedCategory.click();
        categorySelectDone.click();
        publishDoc.click();
        sleepFor(2);
        confirmYes.click();
        backToContentMgr.click();
        sleepFor(4);

    }
}
