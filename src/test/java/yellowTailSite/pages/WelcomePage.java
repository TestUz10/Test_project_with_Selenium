package yellowTailSite.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yellowTailSite.DriverProvider;

public class WelcomePage {
    WebDriver driver;
    @FindBy(xpath = "//label[text()='I am of legal drinking age in']")
    private WebElement legalAgeField;
    @FindBy(xpath = "//div[@class='confirmation-checkbox']/child::label")
    private WebElement legalDrinkingAgeCheckbox;
    @FindBy(id = "\"agegate-selector-options\"")
    private WebElement dropDownExists;
    @FindBy(xpath = "//select[@name='country']")
    private WebElement dropDownSelect;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement welcomeButton;


    public WelcomePage() {
        this.driver = DriverProvider.INSTANCE.getDriver();
        PageFactory.initElements(driver, this);
    }
    @Step
    public WebElement getLegalAgeField() {
        return legalAgeField;
    }
    @Step
    public WebElement getLegalAgeCheckbox() {
        return legalDrinkingAgeCheckbox;
    }
    @Step
    public WebElement getWelcomeButton() {
        return welcomeButton;
    }
    @Step
    public WebElement getDropdownSelect() {
        return dropDownSelect;
    }
    @Step
    public MainPage clickOnWelcomeButton() {
        getWelcomeButton().click();
        return new MainPage();
    }
}
