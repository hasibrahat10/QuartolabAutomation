package pages;

import com.github.javafaker.Faker;
import helper.FileHelper;
import org.openqa.selenium.By;
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

    /*
    Common element for publish document
     */
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
    @FindBy(xpath = "(//button[@class='btn btn-md btn-secondary ml-auto'])[2]")
    WebElement multiDocBtn;

    @FindBy(id = "docTitle")
    WebElement multiDocTitle;

    @FindBy(xpath = "//input[@placeholder='Add section']")
    WebElement inputSectionName;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-with-icon'])[1]")
    WebElement sectionAdd;

    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    WebElement multiDocDescription;

    @FindBy(xpath = "//input[@type='checkbox']")
    List<WebElement> categories;

    //========================== Video Doc Create Start ============================== //

    @FindBy(xpath = "((//*[contains(text(), 'CREATE')])[4]")
    WebElement videoDocBtn;
    @FindBy(xpath = "((//*[contains(text(), 'Create or Upload Video')])")
    WebElement createVideo;

    @FindBy(id = "title")
    WebElement videoTitle;


    @FindBy(xpath = "//input[@type='file']")
    WebElement videoFileBrowse;

    @FindBy(xpath = "//*[@class='dz-upload' and @style='width: 100%;']")
    WebElement uploadProgressBar;

    @FindBy(xpath = "//label[contains(text(), 'Insert YouTube Video Link')] ")
    WebElement youtubeVidLink;
    // https://www.youtube.com/watch?v=4F6yNyyftRg ---------- youtube link text

    @FindBy(xpath = "//div [@class='fr-element fr-view']")
    WebElement videoDescription;


    //========================= Constructor Define ============================== //

    public PublishDocumentPage() {
        PageFactory.initElements(driver, this);
    }

    //========================= Custom Method to Step Define ============================== //

    public void setCreateIcon() {
        createIcon.click();
    }

    public void selectCreateOptions(String option) {
        for (WebElement element : createOptions) {
            if (element.getText().equalsIgnoreCase(option)) {
                element.click();
                break;
            }
        }
        sleepFor(15);
    }

    public void setSimpleDocBtn() {
        simpleDocBtn.click();
    }

    public void setDocInfo() {
        simpleDocTitle.clear();
        sleepFor(2);
        simpleDocTitle.sendKeys(" Title" + new Faker().name().fullName());
        docDescription.click();
        sleepFor(2);
        docDescription.sendKeys("Automation" + new Faker().lorem());
        sleepFor(3);
    }

    public void setPublishDocument() {
        addCategoriesBtn.click();
        sleepFor(2);
        selectedCategory.click();
//        selectCategory("Normal docs track");
        categorySelectDone.click();
        publishDoc.click();
        sleepFor(2);
        confirmYes.click();
        sleepFor(4);
        backToContentMgr.click();
    }

    public void videoPublished() {

        selectCategory("Normal docs track");
        categorySelectDone.click();
        publishDoc.click();
        sleepFor(2);
        confirmYes.click();
        sleepFor(4);
        backToContentMgr.click();
    }


    //=========================== Visual Doc Steps Define =================================== //

    public void setVisualDocBtn() {
        visualDocBtn.click();
        sleepFor(5);
    }


    public void visualDocInfo() {
        visualDocTitle.clear();
        visualDocTitle.sendKeys("Visual doc automation title sample");
        sleepFor(2);
        String[] images = new String[]{"qdev.PNG", "test.jpg"};
        for (String image : images) {
            addImage.sendKeys(FileHelper.IMAGES_DIR + image);
            sleepFor(15);
        }

        sleepFor(2);
        descriptionVisualDoc.sendKeys("Used to automate native windows related");
    }


    //========================Steps define for multi section document Start============================ //
    public void clickCreateDoc(String createOptions) {
        driver.findElement(By.xpath("//li // a[contains(text(), '" + createOptions + "')]")).click();

    }

    public void setMultiDocBtn() {
        multiDocBtn.click();
    }

    public void setMultiDocInfo() {

        multiDocTitle.click();
        multiDocTitle.sendKeys("title of" + new Faker().name().title());
        sleepFor(2);

        inputSectionName.click();
        inputSectionName.sendKeys("Section" + new Faker().number().digits(2));
        sectionAdd.click();
        sleepFor(2);
        multiDocDescription.click();
        multiDocDescription.sendKeys("description doc " + new Faker().lorem());


    }

    //========================= Steps define for multi section document End ============================== //


    //=========================== Video Doc Steps Define =================================== //

    public void selectVideo(String createOptions) {
        driver.findElement(By.xpath("//li // a[contains(text(), '" + createOptions + "')]")).click();

    }

    public void videoInfo() {
        videoTitle.click();
        videoTitle.sendKeys("Title" + new Faker().name().fullName());
        String[] videos = new String[]{"vide1.mp4"};
        for (String video : videos) {
            videoFileBrowse.sendKeys(FileHelper.VIDEOS_DIR + video);
            waitForVisibility(uploadProgressBar);
        }
        scrollDownToElement(videoDescription);
        videoDescription.sendKeys("Description of video " + new Faker().lorem().paragraph());
    }

    /**
     * Dynamic select category
     *
     * @param category Your expected category name
     */
    public void selectCategory(String category) {
        scrollTop();
        for (WebElement element : categories) {
            System.out.println(element.getAttribute("id"));
            if (element.getAttribute("id").contains(category.toLowerCase())) {
                element.click();
                break;
            }
        }
    }


}
