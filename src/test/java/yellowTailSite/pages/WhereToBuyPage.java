package yellowTailSite.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yellowTailSite.DriverProvider;

public class WhereToBuyPage {
    WebDriver driver;
    @FindBy(id = "locationName")
    private SelenideElement myLocation;
    @FindBy(className = "search-submit")
    private SelenideElement searchButton;
    @FindBy(xpath = "//h3[text()='Stockists in your area:']")
    private SelenideElement stocksInYourArea;
    @FindBy(xpath = "//div[@class='tiles']/descendant::div[@class='tile']")
    private SelenideElement addressesAreDisplayed;

//    public WhereToBuyPage() {
//        this.driver = DriverProvider.INSTANCE.getDriver();
//        PageFactory.initElements(driver, this);
//    }

    @Step
    public SelenideElement getMyLocation() {
        return myLocation;
    }
    @Step
    public SelenideElement getSearchButton() {
        return searchButton;
    }
    @Step
    public SelenideElement getStocksInYourArea() {
        return stocksInYourArea;
    }
    @Step
    public SelenideElement getAddressesAreDisplayed() {
        return addressesAreDisplayed;
    }


}