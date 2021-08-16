package pages;

import com.github.javafaker.Faker;
import helper.FileHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.TestSetupPage;

public class HomePage extends TestSetupPage {
    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    private WebElement cookiesAccept;
    @FindBy(xpath = "//a[contains(text(),'features')]")
    private WebElement features;
    @FindBy(xpath = "//a[contains(text(),'pricing')]")
    private WebElement pricing;
    @FindBy(xpath = "//img[@class='light']")
    private WebElement logoImg;
    @FindBy(xpath = "//h2[contains(text(),'quarto features')]")
    private WebElement textDisplayed;
    @FindBy(xpath = "//a[contains(text(),'industries ')]")
    private WebElement industriesDropdown;
    @FindBy(xpath = "//a[@href='construction.html']")
    private WebElement constructionLink;
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    private WebElement signIn;
    @FindBy(id = "email")
    private WebElement emailID;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(className = "invalid-feedback")
    private WebElement errorAlert;
    @FindBy(xpath = "//a[contains(text(),'Next')]")
    private WebElement next;
    @FindBy(xpath = "//button[contains(text(),'Log In ')]")
    private WebElement login;
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;
    @FindBy(xpath = "(//a[contains(text(),'Request Demo')])[2]")
    private WebElement requestDemo;
    @FindBy(id = "name")
    private WebElement userName;
    @FindBy(id = "email")
    private WebElement userEmail;
    @FindBy(id = "companyname")
    private WebElement companyName;
    @FindBy(id = "phonenumber")
    private WebElement phoneNumber;
    @FindBy(id = "message")
    private WebElement message;
    @FindBy(xpath = "//span[contains(text(),'submit')]")
    private WebElement buttonSubmit;
    @FindBy(xpath = "//span[@class='icon-close']")
    private WebElement closeSuccess;
    @FindBy(xpath = "(//a[contains(text(),'Contact Us')])[1]")
    private WebElement contactUs;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void setDropMenu() {
        Actions action = new Actions(driver);
        action.moveToElement(industriesDropdown).perform();
        constructionLink.click();
    }

    public void setFeatures() {
        features.click();
        waitForVisibility(features);
    }

    public String setTextDisplayed() {
        waitForVisibility(textDisplayed);
        return textDisplayed.getText();
    }

    public void setSignIn() {
        waitForVisibility(signIn,20);
        signIn.click();
    }

    public void setSignInProcess() {
        waitForVisibility(emailID, 20);
        emailID.sendKeys(FileHelper.EMAIL_ADDRESS);
        next.click();
        waitForVisibility(next);
    }

    public void setPassword() {
        waitForVisibility(password);
        password.isDisplayed();
        password.sendKeys(FileHelper.PASSWORD);
        login.click();
    }

    public String loginNextProcess() {
        waitForVisibility(next);
        next.click();
        return errorAlert.getText();
    }

    public void setCookiesAccept() {
        waitForVisibility(cookiesAccept,20);
        cookiesAccept.click();
        sleepFor(2);
    }

    public void setLogMenuItem() {
        features.click();
        waitForVisibility(features);
        pricing.click();
        waitForVisibility(pricing);
        logoImg.click();
        waitForVisibility(logoImg);
    }

    public void setRequestDemo() {
        requestDemo.click();
        waitForVisibility(requestDemo);
        setCookiesAccept();
    }

    public void setFormDetails() {
        userName.clear();
        userName.sendKeys("test" + new Faker().name().username());
        userEmail.clear();
        userEmail.sendKeys("hasib" + new Faker().number().digits(2) + "yopmail.com");
        companyName.clear();
        companyName.sendKeys("my" + new Faker().company().name());
        phoneNumber.clear();
        phoneNumber.sendKeys("(123) 121-2412");
        message.clear();
        message.sendKeys("Mesage for" + new Faker().lorem().paragraph(2));
        waitForVisibility(message);
        buttonSubmit.click();
        waitForVisibility(buttonSubmit);
    }

    public void setCloseSuccess() {
        closeSuccess.click();
        waitForVisibility(closeSuccess);
    }

    public void setContactUs() {
        contactUs.click();
        waitForVisibility(contactUs);
    }
}
