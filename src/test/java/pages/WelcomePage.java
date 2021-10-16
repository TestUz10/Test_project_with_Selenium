package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLegalAgeField() {
        return legalAgeField;
    }

    public WebElement getLegalAgeCheckbox() {
        return legalDrinkingAgeCheckbox;
    }

    public WebElement getWelcomeButton() {
        return welcomeButton;
    }

    public WebElement getDropdownSelect() {
        return dropDownSelect;
    }

    public MainPage clickOnWelcomeButton() {
        getWelcomeButton().click();
        return new MainPage(driver);
    }
}
