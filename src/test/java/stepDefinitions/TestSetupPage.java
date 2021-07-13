package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Level;

public class TestSetupPage {
    public static WebDriver driver;
    public static JavascriptExecutor js;
    protected static String scenarioName;
    protected static boolean REMOTE_TEST;
    private static DesiredCapabilities caps = new DesiredCapabilities();



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
        js.executeScript("window.scrollBy(0, 450)");
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
        // set properties
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "/drivers/chromedriver_win32/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); //selenium text ignore
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // chrome control text
        chromeOptions.addArguments("--ignore-certificate-errors");
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
