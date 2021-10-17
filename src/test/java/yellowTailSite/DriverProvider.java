package yellowTailSite;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import static yellowTailSite.Constants.BROWSER_NAME_PROPERTY;
import static yellowTailSite.Constants.FILE_WITH_PROPERTIES;
public class DriverProvider {
    public static final DriverProvider INSTANCE = new DriverProvider();
    private ThreadLocal<WebDriver> DRIVER = new ThreadLocal<WebDriver>();

    private DriverProvider() {
    }

    public WebDriver getDriver() {
        if (DRIVER.get() == null) {
            String browserName = (System.getProperty(BROWSER_NAME_PROPERTY) == null) ?
                    loadProperties().getProperty(BROWSER_NAME_PROPERTY) : System.getProperty(BROWSER_NAME_PROPERTY);

            WebDriver createdWebDriver = new DriverFactory().createDriverInstance(BrowserType.valueOf(browserName));//BrowserType.CHROME
            DRIVER.set(createdWebDriver);//object WebDriver
        }
        return DRIVER.get();
    }

    public void removeDriver() {
        DRIVER.get().quit();
        DRIVER.remove();
    }
    public static Properties loadProperties() {
        String current = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String resourcesFolder = "src" + separator + "test" + separator + "resources";


        Path file = Paths.get(current + separator + resourcesFolder + separator + FILE_WITH_PROPERTIES);

        Properties properties = new Properties();
        try {
            properties.load(Files.newInputStream(file));
        } catch (IOException e) {
            throw new RuntimeException("No such file is found");
        }

        return properties;
    }
}
