package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.TestSetupPage;

public class HomePage extends TestSetupPage {

    // ===================  To Find the Elements for the Home Page ===========================

    @FindBy(xpath = "//a[contains(text(),'features')]")
    WebElement features;
    @FindBy(xpath = "//h2[contains(text(),'quarto features')]")
    WebElement textDisplayed;




    @FindBy(xpath = "//a[contains(text(),'industries ')]")
    WebElement industriesDropdown;

    @FindBy(xpath = "//a[@href='construction.html']")
    WebElement constructionLink;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signIn;

    @FindBy(id="email")
    WebElement emailID;

    @FindBy(className = "invalid-feedback")
    WebElement errorAlert;

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    WebElement next;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
 WebElement home;








 public void setDropMenu(){
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

    public void setSignInProcess(){
     signIn.click();
     emailID.clear();
     emailID.sendKeys("hasib@yopmail.com");
    }

    public String loginNextProcess(){
     sleepFor(2);
     next.click();
     return errorAlert.getText();


    }
}
