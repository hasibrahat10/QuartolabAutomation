package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.TestSetupPage;

public class ProfilePage extends TestSetupPage {
    /*
    Profile Page Element for My Account section
     */
    @FindBy(xpath = "//*[@class='nav-link user-circle']")
    private WebElement profile;
    @FindBy(xpath = "//*[@class='icon-v2-user']")
    private WebElement myAccount;
    @FindBy(xpath = "//*[@formcontrolname='firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//*[@formcontrolname='lastName']")
    private WebElement lastName;
    @FindBy(xpath = "//*[@formcontrolname='designation']")
    private WebElement designation;
    @FindBy(xpath = "//*[@formcontrolname='department']")
    private WebElement department;
    @FindBy(xpath = "//*[@formcontrolname='usersearch']")
    private WebElement usersearch;
    @FindBy(xpath = "//*[@name='InputPhone']")
    private WebElement phone;
    @FindBy(xpath = "//*[contains(text(),' Update')]")
    private WebElement update;
    @FindBy(xpath = "//*[@class='icon-v2-logout']")
    private WebElement logout;

    /**
     * Constructor Define
     */
    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * setPassword method calling caused
     * we'll directly land on password screen
     */
    public void clickProfile() {
        new HomePage().setPassword();
        waitForDisplayed(profile);
        profile.click();
    }

    public void clickMyAccount() {
        waitForDisplayed(myAccount);
        myAccount.click();
    }

    public void updateProfileInfo() {
        waitForDisplayed(firstName);
        firstName.clear();
        firstName.sendKeys(new Faker().name().firstName());
        lastName.clear();
        lastName.sendKeys(new Faker().name().lastName());
        designation.sendKeys((new Faker().job().title()));
        scrollToBottom();
        department.sendKeys(new Faker().job().position());
        phone.sendKeys(new Faker().number().digits(10));
        waitForDisplayed(update);
        update.click();
    }

    public void backToProfileImgClick(){
        waitForDisplayed(profile);
        profile.click();
    }
    public void setLogout() {
        waitForDisplayed(logout);
        logout.click();
    }


}
