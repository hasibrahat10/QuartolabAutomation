package stepDefinitions;

import helper.EventReporter;
import helper.FileHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class TestSetupPage {
    protected static EventFiringWebDriver driver;
    private static JavascriptExecutor js;
    private static final int TIMEOUT = 10;

    /**
     * Set all necessary chrome driver options
     *
     * @return chrome options
     */
    private ChromeOptions getChromeOptions() {
        //Set properties
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + FileHelper.CHROME_DRIVER_PATH);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); //selenium text ignore
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--ignore-certificate-errors");

        //Chrome control text
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        chromeOptions.setExperimentalOption("prefs", prefs);
        return chromeOptions;
    }

    /**
     * Start Driver
     * Pause the browser auto fill password modal
     * Dynamic driver path
     */
    void startDriver() {
        WebDriver webDriver = new ChromeDriver(getChromeOptions());
        js = (JavascriptExecutor) webDriver;
        driver = new EventFiringWebDriver(webDriver);
        driver.register(new EventReporter());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://sqa.quartolab.com/account/login?email=hasancse10@gmail.com");
//        driver.get("https://quartolab.com/");
    }

    /**
     * This will close the browser & ends the session
     */
    void stopDriver() {
        if (driver != null)
            driver.quit();
    }

    /**
     * Initiate fluent wait with default configuration
     */
    private FluentWait<String> wait = new FluentWait<>("")
            .withTimeout(Duration.ofSeconds(TIMEOUT))
            .pollingEvery(Duration.ofMillis(400))
            .ignoring(NoSuchElementException.class, NullPointerException.class);

    protected void waitForDisplayed(WebElement element, int seconds) {
        wait.withTimeout(Duration.ofSeconds(seconds)).until(a -> checkDisplayed(element));
    }

    protected void waitForDisplayed(WebElement element) {
        wait.until(a -> checkDisplayed(element));
    }

    protected void waitForDisappear(WebElement element, int seconds) {
        wait.withTimeout(Duration.ofSeconds(seconds)).until(a -> !checkDisplayed(element));
    }

    protected void waitForDisappear(WebElement element) {
        wait.until(a -> !checkDisplayed(element));
    }

    private boolean checkDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    /**
     * @param seconds
     */
    protected static void sleep(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Scroll down the web page
     */
    protected static void scrollDown() {
        js.executeScript("window.scrollBy(0, 450)");
    }

    protected static void scrollTop() {
        js.executeScript("window.scrollTo(0, 0)");
    }

    /**
     * This  will scroll down the page by  100 pixel vertical
     *
     * @param count We can set the scroll value by any number
     */
    protected static void scrollDown(int count) {
        for (int i = 0; i < count; i++) {
            js.executeScript("window.scrollBy(0, 300)");
            sleep(1);
        }
    }

    /**
     * Wait Element to Scroll
     *
     * @param element Pass the element name to scroll down
     */
    protected static void scrollDownToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
