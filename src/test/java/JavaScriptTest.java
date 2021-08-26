import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import stepDefinitions.TestSetupPage;

public class JavaScriptTest extends TestSetupPage {
    @BeforeClass
    public void driverLoad() {
        startDriver();
        driver.navigate().to("http://testautomationpractice.blogspot.com/");
    }

    @Test
    public void scrollingWebPageTest() {
        scrollToDown(100, 20);
        scrollToTop();
        scrollToDown(50, 40);
        scrollToTop();
        scrollToBottom();
        scrollToTop();
        scrollToBottom();
    }

    @AfterClass
    public void closeDriver() {
        stopDriver();
    }
}
