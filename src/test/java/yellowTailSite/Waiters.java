package yellowTailSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {
    public static void waitForElementToBeVisible(WebElement webElement) {
        (new WebDriverWait(DriverProvider.INSTANCE.getDriver(), 5)).until(
                ExpectedConditions.visibilityOf(webElement));
    }
}