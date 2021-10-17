package yellowTailSite.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yellowTailSite.DriverProvider;

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

    public WhereToBuyPage() {
        this.driver = DriverProvider.INSTANCE.getDriver();
        PageFactory.initElements(driver, this);
    }

    @Step
    public WebElement getMyLocation() {
        return myLocation;
    }
    @Step
    public WebElement getSearchButton() {
        return searchButton;
    }
    @Step
    public WebElement getStocksInYourArea() {
        return stocksInYourArea;
    }
    @Step
    public WebElement getAddressesAreDisplayed() {
        return addressesAreDisplayed;
    }


}