package yellowTailSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static yellowTailSite.Constants.CHROME_DRIVER_PROPERTY;
import static yellowTailSite.Constants.FIREFOX_DRIVER_PROPERTY;
import static yellowTailSite.Constants.PATH_TO_CHROME_DRIVER;
import static yellowTailSite.Constants.PATH_TO_FIREFOX_DRIVER;

public class DriverFactory {

    public WebDriver createDriverInstance(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                System.setProperty(CHROME_DRIVER_PROPERTY, PATH_TO_CHROME_DRIVER);
                return new ChromeDriver();
            case FIREFOX:
                System.setProperty(FIREFOX_DRIVER_PROPERTY, PATH_TO_FIREFOX_DRIVER);
                return new FirefoxDriver();
            default:
                System.setProperty(CHROME_DRIVER_PROPERTY, PATH_TO_CHROME_DRIVER);
                return new ChromeDriver();
        }
    }
}
