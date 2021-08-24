package helper;

import stepDefinitions.TestSetupPage;

import java.util.ResourceBundle;

public class FileHelper extends TestSetupPage {
    public static final ResourceBundle bundle = ResourceBundle.getBundle("config");

    public static final String EMAIL = System.getenv("email");
    public static final String PASSWORD = System.getenv("password");

    public static final String USER_DIR = System.getProperty("user.dir");
    public static final String DRIVER_PATH = USER_DIR + "/drivers/";
    public static final String IMAGES_DIR = USER_DIR + "/images/";
    public static final String VIDEOS_DIR = USER_DIR + "/videos/";
    public static final String SCREENSHOT_DIR = USER_DIR + "/target/screenshot/";
    public static final String DATA_FOLDER = USER_DIR + "/data/";
    public static final boolean OS_WINDOWS = System.getProperty("os.name").contains("Windows");
    public static final String FIREFOX_DRIVER_PATH = DRIVER_PATH + (OS_WINDOWS ? "geckodriver.exe" : "geckodriver");
    public static final String CHROME_DRIVER_PATH = DRIVER_PATH + (OS_WINDOWS ? "chromedriver.exe" : "chromedriver");

    public static String getResString(String key) {
        return bundle.getString(key);
    }

    public static int getResInteger(String key) {
        return Integer.parseInt(bundle.getString(key));
    }

    public static boolean getResBoolean(String key) {
        return Boolean.parseBoolean(bundle.getString(key));
    }
}
