package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.util.List;

public class EventReporter implements WebDriverEventListener {
    static By locator;

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Navigate: \t\t" + s);
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Find By: \t\t" + by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        locator = by;
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        List<WebElement> webElements = webDriver.findElements(locator);
        int index = webElements.size();

        System.out.print("Found: \t\t\t[" + index + "][displayed: ");
        for (int i = 0; i < index; i++)
            System.out.print(webElements.get(i).isDisplayed() + (i == index - 1 ? "]\n" : ", "));
        System.out.println("Click on: \t\t<" + webElement.getTagName() + "> " + (webElement.getText().isEmpty() ? "\n" : "\'" + webElement.getText() + "\'\n"));
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.print(webElement.getTagName().equals("input") && !webElement.getAttribute("value").isEmpty() ? "Old text: \t\t\'" + webElement.getAttribute("value") + "\'\n\n" : "");
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.print(webElement.getTagName().equals("input") && !webElement.getAttribute("value").isEmpty() ? "New text: \t\t\'" + webElement.getAttribute("value") + "\'\n\n" : "");
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("Execute script: \t" + s);
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        System.out.println();
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {
        System.out.println("Screenshot: \t" + "Done");
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {
    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
        System.out.println(s.isEmpty() ? "" : "Get text: \t\t\'" + s + "\'\n");
    }
}
