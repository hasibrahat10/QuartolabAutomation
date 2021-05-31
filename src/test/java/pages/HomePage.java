package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.TestSetupPage;

public class HomePage extends TestSetupPage {

    // ===================  To Find the Elements for the Home Page ===========================


    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    WebElement cookiesAccept;

    @FindBy(xpath = "//a[contains(text(),'features')]")
    WebElement features;

    @FindBy(xpath = "//a[contains(text(),'pricing')]")
    WebElement pricing;


    @FindBy(xpath = "//img[@class='light']")
    WebElement logoImg;


    @FindBy(xpath = "//h2[contains(text(),'quarto features')]")
    WebElement textDisplayed;


    @FindBy(xpath = "//a[contains(text(),'industries ')]")
    WebElement industriesDropdown;

    @FindBy(xpath = "//a[@href='construction.html']")
    WebElement constructionLink;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signIn;

    @FindBy(id = "email")
    WebElement emailID;

    @FindBy(className = "invalid-feedback")
    WebElement errorAlert;

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    WebElement next;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement home;

    //Request Demo Element Finder

    @FindBy(xpath = "(//a[contains(text(),'Request Demo')])[2]")
    WebElement requestDemo;

    @FindBy(id = "name")
    WebElement userName;

    @FindBy(id = "email")
    WebElement userEmail;

    @FindBy(id = "companyname")
    WebElement companyName;

    @FindBy(id = "phonenumber")
    WebElement phoneNumber;


    @FindBy(id = "message")
    WebElement message;

    @FindBy(xpath = "//span[contains(text(),'submit')]")
    WebElement buttonSubmit;
    @FindBy(xpath = "//span[@class='icon-close']")
    WebElement closeSuccess;

    // Contact Us Form Submission

    @FindBy(xpath = "(//a[contains(text(),'Contact Us')])[1]")
    WebElement contactUs;


    public void setDropMenu() {
        Actions action = new Actions(driver);
        action.moveToElement(industriesDropdown).perform();
        constructionLink.click();
    }


    //=====================  constructor define ===============================

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //========================= Custom Method declare for the steps =======================

    public void setFeatures() {
        features.click();
        sleepFor(5);
    }

    public String setTextDisplayed() {
        return textDisplayed.getText();
    }

    public void setSignInProcess() {
        signIn.click();
        emailID.clear();
        emailID.sendKeys("hasib@yopmail.com");
    }

    public String loginNextProcess() {
        sleepFor(2);
        next.click();
        return errorAlert.getText();
    }

    //Cookies Accepts

    public void setCookiesAccept() {
        cookiesAccept.click();
        sleepFor(5);
    }

    // Menu and logo item click

    public void setLogMenuItem() {
        features.click();
        sleepFor(3);
        pricing.click();
        sleepFor(3);
        logoImg.click();
        sleepFor(3);
    }

    //Request Demo Screen

    public void setRequestDemo() {
        requestDemo.click();
        sleepFor(4);
        setCookiesAccept();

    }

    public void setFormDetails() {
        userName.clear();
        userName.sendKeys("Hasib Rahat23");
        userEmail.clear();
        userEmail.sendKeys("hasib126@yopmail.com");

        companyName.clear();
        companyName.sendKeys("Demo Company");

        phoneNumber.clear();
        phoneNumber.sendKeys("(123) 121-2412");

        message.clear();
        message.sendKeys("I am trying to access the demo version of Quarto Lab.");

        sleepFor(2);
        buttonSubmit.click();
        sleepFor(5);
    }

    public void setCloseSuccess() {
        closeSuccess.click();
        sleepFor(4);
    }

    // Contact Us

    public void setContactUs() {
        contactUs.click();
        sleepFor(2);
    }


}
