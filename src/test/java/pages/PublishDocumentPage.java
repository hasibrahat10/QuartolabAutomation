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
    @FindBy(xpath = "//i[@class='icon icon-create-v2 hvr-icon']")
    private WebElement createIcon;
    //    @FindBy(xpath = "//li // a[contains(text(), 'Create Document')]")
//    WebElement createDocument;
    @FindBy(xpath = "//ul[@class='create-dropdown dropdown-nav show']/li")
    private List<WebElement> createOptions;
    @FindBy(xpath = "(//*[contains(text(), 'CREATE')])[1]")
    private WebElement simpleDocBtn;
    @FindBy(xpath = "//input[@placeholder='Enter title']")
    private WebElement simpleDocTitle;
    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    private WebElement docDescription;

    @FindBy(xpath = "//div // a[@class='btn btn-light btn-with-icon w-100 cursor-pointer']")
    private WebElement addCategoriesBtn;
    @FindBy(xpath = "//label[@class='form-check-label' and @for='normal docs track-12']")
    private WebElement selectedCategory;
    @FindBy(xpath = "//button[contains(text(),'Done')]")
    private WebElement categorySelectDone;
    @FindBy(xpath = "//button[contains(text(), ' Publish Document ')]")
    private WebElement publishDoc;
    @FindBy(xpath = "//button[contains(text(), 'Yes')]")
    private WebElement confirmYes;
    @FindBy(xpath = "//button[contains(text(), 'BACK TO CONTENT MANAGER')]")
    private WebElement backToContentMgr;

    @FindBy(xpath = "(//*[contains(text(), 'CREATE')])[3]")
    private WebElement visualDocBtn;
    @FindBy(xpath = "//input[@placeholder='Enter title']")
    private WebElement visualDocTitle;
    //  @FindBy(xpath = "//*[contains(text(), 'Add Image')]")
    @FindBy(id = "img-doc")
    private WebElement addImage; // single image
    @FindBy(xpath = "//textarea[@formcontrolname='imgdescription']")
    private WebElement descriptionVisualDoc;
    //    @FindBy(xpath = "//textarea[@class='form-control ng-untouched ng-pristine ng-valid']")
//    WebElement descriptionVisualDoc;

    @FindBy(xpath = "(//button[@class='btn btn-md btn-secondary ml-auto'])[2]")
    private WebElement multiDocBtn;
    @FindBy(id = "docTitle")
    private WebElement multiDocTitle;
    @FindBy(xpath = "//input[@placeholder='Add section']")
    private WebElement inputSectionName;
    @FindBy(xpath = "(//button[@class='btn btn-primary btn-with-icon'])[1]")
    private WebElement sectionAdd;
    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    private WebElement multiDocDescription;

    @FindBy(xpath = "//input[@type='checkbox']")
    private List<WebElement> categories;
    @FindBy(xpath = "((//*[contains(text(), 'CREATE')])[4]")
    private WebElement videoDocBtn;
    @FindBy(xpath = "((//*[contains(text(), 'Create or Upload Video')])")
    private WebElement createVideo;
    @FindBy(id = "title")
    private WebElement videoTitle;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement videoFileBrowse;
    @FindBy(xpath = "//*[@class='dz-upload' and @style='width: 100%;']")
    private WebElement uploadProgressBar;
    @FindBy(xpath = "//label[contains(text(), 'Insert YouTube Video Link')] ")
    private WebElement youtubeVidLink;
    // https://www.youtube.com/watch?v=4F6yNyyftRg ---------- youtube link text
    @FindBy(xpath = "//div [@class='fr-element fr-view']")
    private WebElement videoDescription;


    public PublishDocumentPage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Common create Icon for create documents
     */
    public void setCreateIcon() {
        waitForVisibility(createIcon, 20);
        createIcon.click();
    }

    /**
     * Create options for different items
     *
     * @param option
     */
    public void selectCreateOptions(String option) {
        waitForVisibility(createOptions.get(0));
        for (WebElement element : createOptions) {
            if (element.getText().equalsIgnoreCase(option)) {
                element.click();
                break;
            }
        }
    }

    public void setSimpleDocBtn() {
        waitForVisibility(simpleDocBtn);
        simpleDocBtn.click();
    }

    public void setDocInfo() {
        waitForVisibility(simpleDocTitle);
        simpleDocTitle.clear();
        simpleDocTitle.sendKeys(" Title" + new Faker().name().fullName());
        docDescription.click();
        waitForVisibility(docDescription);
        docDescription.sendKeys("Automation" + new Faker().lorem().paragraph());
    }

    /**
     * Publish document process followed for all kinds of doc
     */
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

    /**
     * Video document published
     */
    public void videoPublished() {
        selectCategory("Normal docs track");
        categorySelectDone.click();
        publishDoc.click();
        sleepFor(2);
        confirmYes.click();
        sleepFor(4);
        backToContentMgr.click();
    }

    /**
     * Visual Document published
     */
    public void setVisualDocBtn() {
        visualDocBtn.click();
        sleepFor(5);
    }

    public void visualDocInfo() {
        visualDocTitle.clear();
        visualDocTitle.sendKeys("Visual doc automation title sample");
        waitForVisibility(visualDocTitle);
        String[] images = new String[]{"qdev.PNG", "test.jpg"};
        for (String image : images) {
            addImage.sendKeys(FileHelper.IMAGES_DIR + image);
            waitForVisibility(addImage);
        }
        descriptionVisualDoc.sendKeys("Used to automate native" + new Faker().lorem().paragraph());
    }

    /**
     * Multi section document published
     *
     * @param createOptions Our element path is dynamic, what we set
     *                      in the feature file , will find it.
     */
    public void clickCreateDoc(String createOptions) {
        driver.findElement(By.xpath("//li // a[contains(text(), '" + createOptions + "')]")).click();
    }

    public void setMultiDocBtn() {
        multiDocBtn.click();
    }

    public void setMultiDocInfo() {
        multiDocTitle.click();
        multiDocTitle.sendKeys("title of" + new Faker().name().fullName());
        waitForVisibility(multiDocTitle);
        inputSectionName.click();
        inputSectionName.sendKeys("Section" + new Faker().number().digits(2));
        sectionAdd.click();
        waitForVisibility(sectionAdd);
        multiDocDescription.click();
        multiDocDescription.sendKeys("description doc " + new Faker().lorem().paragraph());
    }

    /**
     * Video document published
     *
     * @param createOptions Our element path is dynamic, what we set
     *                      in the feature file , will find it.
     */
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
