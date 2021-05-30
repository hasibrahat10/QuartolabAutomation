package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSetupPage {
    public static WebDriver driver;
    public static JavascriptExecutor js;


    //================   RANDOM STRING GENERATE  ========================
    public static String randomString() {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return (generatedString);
    }

    public static void sleepFor(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //=============================   SCROLL DOWN  =======================================
    public static void scrollDown() {
        // This  will scroll down the page by  100 pixel vertical
        js.executeScript("window.scrollBy(0, 100)");
    }

    public static void scrollDown(int count) {
        // This  will scroll down the page by  100 pixel vertical
        for (int i = 0; i < count; i++) {
            js.executeScript("window.scrollBy(0, 300)");
            sleepFor(1);
        }
    }

    //======================== WAIT ELEMENT CLICK  ==============================
    public static void scrollDownToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    //=================================   START DRIVER  =======================================
    public void startDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--ignore-certificate-errors");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "/drivers/chromedriver_win32/chromedriver.exe");
        //System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
        Logger.getLogger("").setLevel(Level.OFF);
        driver = new ChromeDriver(chromeOptions);
        js = (JavascriptExecutor) driver;
    }

    //=============================   STOP DRIVER  =======================================
    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    //=============================   SLEEP ACTIVITIES  =======================================
    public void sleepFor() {
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public boolean isElementVisible(WebElement elm) {
        try {
            return elm.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
