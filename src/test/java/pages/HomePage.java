package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.TestSetupPage;

public class HomePage extends TestSetupPage {

    // ===================  To Find the Elements for the Home Page ===========================

@FindBy (xpath = "//a[contains(text(),'features')]")
WebElement features;
@FindBy (xpath = "//h2[contains(text(),'quarto features')]")
WebElement textDisplayed;



    //=====================  constructor define ===============================

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //========================= Custom Method declare for the steps =======================

public  void setFeatures(){
        features.click();
        sleepFor(5);
}

public String setTextDisplayed(){
        return textDisplayed.getText();
}
}
