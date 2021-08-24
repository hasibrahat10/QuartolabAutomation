package stepDefinitions;

import cucumber.api.Scenario;
import helper.EventReporter;
import helper.FileHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class TestSetupPage {
    protected static EventFiringWebDriver driver;
    private static JavascriptExecutor executor;

    /**
     * Start Driver
     * Pause the browser auto fill password modal
     * Dynamic driver path
     */
    void startDriver() {
        WebDriver webDriver = getWebDriver(FileHelper.getResString("BROWSER"));
        executor = (JavascriptExecutor) webDriver;
        driver = getEventFiringWebDriver(webDriver);
        driver.manage().timeouts().implicitlyWait(FileHelper.getResInteger("IMPLICIT_WAIT"), TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(FileHelper.getResString("BASE_URL"));
    }

    /**
     * This will close the browser & ends the session
     */
    void stopDriver() {
        driver.quit();
    }

    /**
     * Chrome driver instantiate
     *
     * @return
     */
    private static WebDriver getWebDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                setChromeDriverProperty();
                return new ChromeDriver(getChromeOptions());

            case "firefox":
                setFirefoxDriverProperty();
                return new FirefoxDriver(getFirefoxOptions());

            default:
                System.out.println("[" + browser + "] is not a correct browser name.");
        }
        return null;
    }

    /**
     * get event firing web driver
     *
     * @param webDriver
     * @return
     */
    private static EventFiringWebDriver getEventFiringWebDriver(WebDriver webDriver) {
        driver = new EventFiringWebDriver(webDriver);
        if (FileHelper.getResBoolean("EVENT_ENABLE"))
            return driver.register(new EventReporter());
        return driver;
    }

    /**
     * set chrome driver property
     */
    private static void setChromeDriverProperty() {
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, FileHelper.CHROME_DRIVER_PATH);
    }

    /**
     * @return Chrome driver options
     */
    private static ChromeOptions getChromeOptions() {
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
        chromeOptions.setHeadless(FileHelper.getResBoolean("HEADLESS"));
        return chromeOptions;
    }

    /**
     * set firefox driver property
     */
    private static void setFirefoxDriverProperty() {
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        System.setProperty("webdriver.gecko.driver", FileHelper.FIREFOX_DRIVER_PATH);
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
    }

    /**
     * @return Firefox driver options
     */
    private static FirefoxOptions getFirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(FileHelper.getResBoolean("HEADLESS"));
        return options;
    }

    /**
     * End of the test take a screenshot
     *
     * @param scenario
     */
    public static void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed() || FileHelper.getResBoolean("SCREENSHOT")) {
            String screenshotName = getScreenshotName(scenario.getName());
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File(screenshotName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getScreenshotName(String name) {
        String screenshot = FileHelper.SCREENSHOT_DIR + name.replaceAll("[-()#.,]", "").replaceAll("[/ :]", "_") + ".png";
        System.setProperty("SCREENSHOT", screenshot);
        return screenshot;
    }

    /**
     * Initiate fluent wait with default configuration
     */
    private FluentWait<String> wait = new FluentWait<>("")
            .withTimeout(Duration.ofSeconds(FileHelper.getResInteger("EXPLICIT_WAIT")))
            .pollingEvery(Duration.ofMillis(400))
            .ignoring(NoSuchElementException.class, NullPointerException.class);

    /**
     * Wait for element to be displayed upto a certain time
     *
     * @param element wait for which element
     * @param seconds amount of wait time
     */
    protected void waitForDisplayed(WebElement element, int seconds) {
        wait.withTimeout(Duration.ofSeconds(seconds)).until(a -> element.isDisplayed());
    }

    /**
     * Wait for element to be displayed upto prefix explicit time
     *
     * @param element
     */
    protected void waitForDisplayed(WebElement element) {
        wait.until(a -> element.isDisplayed());
    }

    /**
     * Wait for element to be not displayed upto a certain time
     *
     * @param element wait for which element
     * @param seconds amount of wait time
     */
    protected void waitForNotDisplayed(WebElement element, int seconds) {
        wait.withTimeout(Duration.ofSeconds(seconds)).until(a -> !element.isDisplayed());
    }

    /**
     * Wait for element to be not displayed upto prefix explicit time
     *
     * @param element
     */
    protected void waitForNotDisplayed(WebElement element) {
        wait.until(a -> !element.isDisplayed());
    }

    /**
     * Hard sleep for seconds
     *
     * @param seconds
     */
    public static void sleep(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Hard sleep for milliseconds
     *
     * @param milliseconds
     */
    public static void sleepInMillis(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Got to top of the page
     */
    protected static void scrollToTop() {
        sleepInMillis(500);
        executor.executeScript("window.scrollTo(0, 0)");
        sleepInMillis(500);
    }

    /**
     * Got to bottom of the page
     */
    protected static void scrollToBottom() {
        sleepInMillis(500);
        executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepInMillis(500);
    }

    /**
     * This  will scroll down the page by {pixel} vertical
     *
     * @param count We can set the scroll value by any number
     */
    protected static void scrollToDown(int pixel, int count) {
        sleepInMillis(500);
        for (int i = 0; i < count; i++) {
            executor.executeScript("window.scrollBy(0, " + pixel + ")");
            sleepInMillis(100);
        }
    }

    /**
     * Wait Element to Scroll
     *
     * @param element Pass the element name to scroll down
     */
    protected static void scrollToElement(WebElement element) {
        sleepInMillis(500);
        executor.executeScript("arguments[0].scrollIntoView();", element);
        sleepInMillis(500);
    }
}
