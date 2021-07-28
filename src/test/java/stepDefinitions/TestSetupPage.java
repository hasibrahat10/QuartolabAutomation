package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class TestSetupPage {
    private static final int TIMEOUT = 10;
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


    public static void scrollTop() {
        js.executeScript("window.scrollTo(0, 0)");
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
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.setExperimentalOption("prefs", prefs);
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // chrome control text

        // set properties
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "/drivers/chromedriver_win32/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); //selenium text ignore
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

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

    protected void waitForVisibility(WebElement element) {
        isLocatorVisible(element, TIMEOUT);
    }

    protected void waitForVisibility(WebElement element, int seconds) {
        isLocatorVisible(element, seconds);
    }

    protected void waitForInvisibility(WebElement element) {
        isLocatorInvisible(element, TIMEOUT);
    }

    protected void waitForInvisibility(WebElement element, int seconds) {
        isLocatorInvisible(element, seconds);
    }

    private void isLocatorVisible(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    private void isLocatorInvisible(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }


}
