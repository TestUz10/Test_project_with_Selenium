package yellowTailSite.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {
    WebDriver driver;
    @FindBy(xpath = "//label[text()='I am of legal drinking age in']")
    private SelenideElement legalAgeField;
    @FindBy(xpath = "//div[@class='confirmation-checkbox']/child::label")
    private SelenideElement legalDrinkingAgeCheckbox;
    @FindBy(id = "\"agegate-selector-options\"")
    private SelenideElement dropDownExists;
    @FindBy(xpath = "//select[@name='country']")
    private SelenideElement dropDownSelect;
    @FindBy(xpath = "//input[@type='submit']")
    private SelenideElement welcomeButton;


//    public WelcomePage() {
//        this.driver = DriverProvider.INSTANCE.getDriver();
//        PageFactory.initElements(driver, this);
//    }
    @Step
    public SelenideElement getLegalAgeField() {
        return (SelenideElement) legalAgeField;
    }
    @Step
    public SelenideElement getLegalAgeCheckbox() {
        return legalDrinkingAgeCheckbox;
    }
    @Step
    public SelenideElement getWelcomeButton() {
        return welcomeButton;
    }
    @Step
    public SelenideElement getDropdownSelect() {
        return dropDownSelect;
    }
    @Step
    public MainPage clickOnWelcomeButton() {
        getWelcomeButton().click();
        return new MainPage();
    }
}
