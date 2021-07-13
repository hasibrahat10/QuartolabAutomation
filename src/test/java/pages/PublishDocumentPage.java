package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.TestSetupPage;

import java.util.List;

public class PublishDocumentPage extends TestSetupPage {

    //========================= Simple Document Element Finder ============================== //
    @FindBy(xpath = "//i[@class='icon icon-create-v2 hvr-icon']")
    WebElement createIcon;

//    @FindBy(xpath = "//li // a[contains(text(), 'Create Document')]")
//    WebElement createDocument;

    @FindBy(xpath = "//ul[@class='create-dropdown dropdown-nav show']/li")
    List<WebElement> createOptions;

    @FindBy(xpath = "(//*[contains(text(), 'CREATE')])[1]")
    WebElement simpleDocBtn;

    @FindBy(xpath = "//input[@placeholder='Enter title']")
    WebElement simpleDocTitle;

    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    WebElement docDescription;


    //============================ Common Action for Publish Document Start ============================//
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

    //============================ Common Action for Publish End============================//


    //========================== Visual Doc Create Start ============================== //
    @FindBy(xpath = "(//*[contains(text(), 'CREATE')])[3]")
    WebElement visualDocBtn;

    @FindBy(xpath = "//input[@placeholder='Enter title']")
    WebElement visualDocTitle;

    //  @FindBy(xpath = "//*[contains(text(), 'Add Image')]")
    @FindBy(id = "img-doc")
    WebElement addImage; // single image

    @FindBy(xpath = "//textarea[@formcontrolname='imgdescription']")
    WebElement descriptionVisualDoc;
//
//    @FindBy(xpath = "//textarea[@class='form-control ng-untouched ng-pristine ng-valid']")
//    WebElement descriptionVisualDoc;


    //========================== Multi Doc Create Start ============================== //
    @FindBy(xpath = "((//*[contains(text(), 'CREATE')])[2]")
    WebElement multiDocBtn;

    //========================== Video Doc Create Start ============================== //

    @FindBy(xpath = "((//*[contains(text(), 'CREATE')])[4]")
    WebElement videoDocBtn;

    //========================= Constructor Define ============================== //

    public PublishDocumentPage() {
        PageFactory.initElements(driver, this);
    }

    //========================= Custom Method to Step Define ============================== //

    public void setCreateIcon() {
        createIcon.click();
    }

//    public void selectCreateOptions(String createOptions) {
//Dynamic Xpath for the multiples item
//       driver.findElement(By.xpath("//li // a[contains(text(), '" + createOptions + "')]")).click();
//       createDocument.click();
//    }

    public void selectCreateOptions(String option) {
        for (WebElement element : createOptions) {
            if (element.getText().equalsIgnoreCase(option)) {
                element.click();
                break;
            }
        }
        sleepFor(10);
    }

    public void setSimpleDocBtn() {
        simpleDocBtn.click();
    }

    public void setDocInfo() {
        simpleDocTitle.clear();
        sleepFor(2);
        simpleDocTitle.sendKeys("Automation Title one");
        docDescription.click();
        sleepFor(2);
        docDescription.sendKeys("Automation the industry's standard dummy text ever \n" +
                "since the 1500s, when an unknown printer took a galley of type and " +
                "scrambled it to make a type speciman.\n");

        sleepFor(3);
    }

    public void setPublishDocument() {
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


    //=========================== Visual Doc Steps Define =================================== //

    public void setVisualDocBtn() {
        visualDocBtn.click();
        sleepFor(5);
    }

//    public void visualDocInfo() {
//        visualDocTitle.clear();
//        visualDocTitle.sendKeys("Visual doc automation title sample");
//        sleepFor(2);
//        addImage.click();
//        addImage.sendKeys("C:\\Users\\u\\Downloads\\b.jpeg");
//
//        sleepFor(4);
//        descriptionVisualDoc.click();
//        sleepFor(2);
//        descriptionVisualDoc.sendKeys("Used to automate native windows related");
//    }

    public void visualDocInfo() {
        visualDocTitle.clear();
        visualDocTitle.sendKeys("Visual doc automation title sample");
        sleepFor(2);

        String imageDir = System.getProperty("user.dir") + "/images/";
        String[] images = new String[]{"qdev.PNG", "test.jpg"};
        for (String image : images) {
            addImage.sendKeys(imageDir + image);
            sleepFor(15);
        }

        sleepFor(2);
        descriptionVisualDoc.sendKeys("Used to automate native windows related");
    }

}
