package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhereToBuyPage {
    WebDriver driver;
    @FindBy(id = "locationName")
    private WebElement myLocation;
    @FindBy(className = "search-submit")
    private WebElement searchButton;
    @FindBy(xpath = "//h3[text()='Stockists in your area:']")
    private WebElement stocksInYourArea;
    @FindBy(xpath = "//div[@class='tiles']/descendant::div[@class='tile']")
    private WebElement addressesAreDisplayed;

    public WhereToBuyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyLocation() {
        return myLocation;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getStocksInYourArea() {
        return stocksInYourArea;
    }

    public WebElement getAddressesAreDisplayed() {
        return addressesAreDisplayed;
    }


}