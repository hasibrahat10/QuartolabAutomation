package helper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import stepDefinitions.TestSetupPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class FileHelper extends TestSetupPage {
    public static String CURRENT_DIR = System.getProperty("user.dir");
    public static final String IMAGES_DIR = CURRENT_DIR + "/images/";
    public static final String VIDEOS_DIR = CURRENT_DIR + "/videos/";
    public static String SCREENSHOT_DIR = CURRENT_DIR + "/target/screenshot/";
    public static String DATA_FOLDER = CURRENT_DIR + "/data/";

    public static void take_screenshot() {
        File screenshot_file;
        GregorianCalendar cal = new GregorianCalendar();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd.HH:mm:ss");
        String currentTime = formatter.format(cal.getTime()).replace(':', '_');
        if (driver != null) {
            try {
                String screenshot_name = clean_string(scenarioName) + "_" + ".png";
                screenshot_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshot_file, new File(FileHelper.SCREENSHOT_DIR + screenshot_name));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String clean_string(String scenario_name) {
        return scenario_name.replaceAll("[-()#.,]", "").replaceAll("[/ :]", "_");
    }
}
