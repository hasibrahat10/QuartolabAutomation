package helper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import stepDefinitions.TestSetupPage;

import java.io.File;
import java.io.IOException;

public class FileHelper extends TestSetupPage {
    public static final String CHROME_DRIVER_PATH = System.getProperty("os.name").contains("Windows") ?
            "/drivers/chromedriver.exe" : "/drivers/chromedriver";
    public static final String EMAIL_ADDRESS = System.getenv("email");
    public static final String PASSWORD = System.getenv("password");
    public static String CURRENT_DIR = System.getProperty("user.dir");
    public static final String IMAGES_DIR = CURRENT_DIR + "/images/";
    public static final String VIDEOS_DIR = CURRENT_DIR + "/videos/";
    public static String SCREENSHOT_DIR = CURRENT_DIR + "/target/screenshot/";
    public static String DATA_FOLDER = CURRENT_DIR + "/data/";

    public static void takeScreenshot(String scenarioName) {
        File screenshot_file;
        try {
            String screenshot_name = cleanString(scenarioName) + "_" + ".png";
            screenshot_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot_file, new File(FileHelper.SCREENSHOT_DIR + screenshot_name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String cleanString(String scenario_name) {
        return scenario_name.replaceAll("[-()#.,]", "").replaceAll("[/ :]", "_");
    }
}
